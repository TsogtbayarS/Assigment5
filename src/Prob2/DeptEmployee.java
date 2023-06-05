package Prob2;

import java.time.LocalDate;

public class DeptEmployee {

    String name;
    double salary;
    LocalDate hireDate;

    public DeptEmployee(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public double computeSalary() {
        return this.salary;
    }
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
