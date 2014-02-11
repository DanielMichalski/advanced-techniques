package p33_serializacja;

import p33_strumienie_i_pliki.*;

import java.io.*;

/**
 * Author: Daniel
 */
public class ObjectStreamTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee harry = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        Employee carl = new Employee("Carl Cracker", 75000, 1987, 12, 15);
        carl.setSecretary(harry);
        Employee tony = new Employee("Tony Tester", 40000, 1990, 3, 15);
        tony.setSecretary(harry);

        Employee[] employees = new Employee[3];
        employees[0] = carl;
        employees[1] = harry;
        employees[2] = tony;

        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream("employee.dat")))
        {
            oos.writeObject(employees);
        }

        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream("employee.dat")))
        {
            Employee[] staff  = (Employee[]) ois.readObject();

            staff[1].raiseSalary(10);

            for (Employee employee : staff) {
                System.out.println(employee);
            }
        }
    }
}
