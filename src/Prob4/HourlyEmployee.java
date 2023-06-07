package Prob4;

public class HourlyEmployee extends Employee {
    double wage;
    double hours;
    public HourlyEmployee(String firstName, String lastName, String ssn,  double wage, double hours) {
        super(firstName, lastName, ssn);
        this.wage = wage;
        this.hours = hours;
    }

    @Override
    double getPayment() {
        return wage * hours;
    }

    @Override
    public String toString() {
        return "HourlyEmployee\n{[firstName=" + firstName + ", lastName=" + lastName + ", Social Security Number=" + socialSecurityNumber + "] " +
                "wage=" + wage +
                " hours=" + hours +
                '}';
    }
}
