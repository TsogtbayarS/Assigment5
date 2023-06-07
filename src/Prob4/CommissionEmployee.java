package Prob4;

public class CommissionEmployee extends Employee {
    double grossSales;
    double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String ssn, double grossSales, double commissionRate) {
        super(firstName, lastName, ssn);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    @Override
    double getPayment() {
        return grossSales * commissionRate;
    }
    @Override
    public String toString() {
        return "CommissionEmployee\n{[firstName=" + firstName + ", lastName=" + lastName + ", Social Security Number=" + socialSecurityNumber + "] " +
                "grossSales=" + grossSales +
                " commissionRate=" + commissionRate +
                '}';
    }
}
