package Prob4;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String ssn, double grossSales, double commissionRate , double baseSalary) {
        super(firstName, lastName, ssn, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }
    @Override
    public double getPayment() {
        return baseSalary + super.getPayment();
    }
    @Override
    public String toString() {
        return "BasePlusCommissionEmployee\n{[firstName=" + firstName + ", lastName=" + lastName + ", Social Security Number=" + socialSecurityNumber + "] " +
                " baseSalary=" + baseSalary +
                '}';
    }
}
