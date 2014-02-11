package p33_strumienie_i_pliki;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.SortedMap;

/**
 * Author: Daniel
 */
public class TextFileTest {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);

        try (PrintWriter out =
                     new PrintWriter("employee.dat", "UTF-8"))
        {
            writeData(staff, out);
        }

        try (Scanner in = new Scanner(
                new FileInputStream("employee.dat"), "UTF-8"))
        {
            Employee[] newStaff = readData(in);

            for (Employee employee : newStaff) {
                System.out.println(employee);
            }
        }
    }

    private static void writeData(Employee[] staff, PrintWriter out) {
        out.println(staff.length);

        for (Employee employee : staff) {
            writeEmployee(out, employee);
        }
    }

    private static void writeEmployee(PrintWriter out, Employee employee) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(employee.getHireDate());
        out.println(employee.getName() + "|" +
                employee.getSalary() + "|" +
                calendar.get(Calendar.YEAR) + "|" +
                calendar.get(Calendar.MONTH) + 1 + "|" +
                calendar.get(Calendar.DAY_OF_MONTH));
    }

    private static Employee[] readData(Scanner in) {
        int n = in.nextInt();
        in.nextLine();

        Employee[] employees = new Employee[n];
        for (int i = 0; i < n; i++) {
            employees[i] = readEmployee(in);
        }
        return employees;
    }

    private static Employee readEmployee(Scanner in) {
        String line = in.nextLine();
        String[] tokens = line.split("\\|");
        String name = tokens[0];
        double salary = Double.parseDouble(tokens[1]);
        int year = Integer.parseInt(tokens[2]);
        int month = Integer.parseInt(tokens[3]);
        int day = Integer.parseInt(tokens[4]);
        return new Employee(name, salary, year, month, day);
    }
}
