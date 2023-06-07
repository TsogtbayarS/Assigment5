package Prob4;

public class SalariedEmployee extends Employee {
    double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String ssn, double weeklySalary) {
        super(firstName, lastName, ssn);
        this.weeklySalary = weeklySalary;
    }
    @Override
    double getPayment() {
        return weeklySalary;
    }
    @Override
    public String toString() {
        return "SalariedEmployee\n{[firstName=" + firstName + ", lastName=" + lastName + ", Social Security Number=" + socialSecurityNumber + "] " +
                " weeklySalary=" + weeklySalary +
                '}';
    }
}
