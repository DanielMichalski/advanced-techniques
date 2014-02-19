package p66_serializacja_klonowanie;

/**
 * Author: Daniel
 */
public class Main {
    public static void main(String[] args) {
        Employee harry = new Employee("Harry Hacker", 35000, 1989, 10, 1);
        Employee harry2 = (Employee) harry.clone();

        harry.raiseSalary(10);

        System.out.println("harry = " + harry);
        System.out.println("harry2 = " + harry2);
    }
}
