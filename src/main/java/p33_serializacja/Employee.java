package p33_serializacja;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

/**
 * Author: Daniel
 */
public class Employee implements Serializable {
    private String name;
    private double salary;
    private Date hireDate;
    private Employee secretary;

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month-1, day);
        hireDate = calendar.getTime();
    }

    public void raiseSalary(double percent) {
        salary += salary * percent / 100;
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

    public void setSecretary(Employee secretary) {
        this.secretary = secretary;
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
