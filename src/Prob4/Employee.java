package Prob4;

public abstract class Employee {
    String firstName;
    String lastName;
    String socialSecurityNumber;

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    abstract double getPayment();

    @Override
    public String toString() {
        return "Employee\n [firstName=" + firstName + ", lastName=" + lastName + ", Social Security Number=" + socialSecurityNumber + "] ";
    }
}
