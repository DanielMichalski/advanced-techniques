package p66_serializacja_klonowanie;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Author: Daniel
 */
public class Employee extends SerialClonable {
    private String name;
    private double salary;
    private Date hireDate;

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        hireDate = calendar.getTime();
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void raiseSalary(double byPercent) {
        salary += salary * byPercent / 100;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("name='").append(name).append('\'');
        sb.append(", salary=").append(salary);
        sb.append(", hireDate=").append(hireDate);
        sb.append('}');
        return sb.toString();
    }
}
