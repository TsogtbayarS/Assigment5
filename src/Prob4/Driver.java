package Prob4;

public class Driver {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new CommissionEmployee("John", "Smith", "001", 10000, 12.5);
        employees[1] = new BasePlusCommissionEmployee("James", "Bond", "007", 50000, 0.07, 70000.0);
        employees[2] = new HourlyEmployee("Dorj", "Bold", "123", 15.0, 40.0);
        employees[3] = new SalariedEmployee("Tsogtoo", "Bayaraa", "789", 50000.0);
        employees[4] = new HourlyEmployee("Amar", "Jargal", "654", 20.0, 35.0);

        for (Employee employee : employees) {
            System.out.println(employee);
        }

        double totalSalaries = 0.0;
        for (Employee employee : employees) {
            totalSalaries += employee.getPayment();
        }
        System.out.println("Total salaries:" + totalSalaries);
    }
}
