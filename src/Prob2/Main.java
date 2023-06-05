package Prob2;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        DeptEmployee[] department = new DeptEmployee[5];

        Professor professor1 = new Professor("Dorj", 50000, LocalDate.of(1990, 12, 1), 3);
        Professor professor2 = new Professor("Bold", 40000, LocalDate.of(1989, 5, 2), 2);
        Professor professor3 = new Professor("Dulam", 30000, LocalDate.of(1999, 6, 5), 0);
        Secretary secretary1 = new Secretary("Uyanga", 90000, LocalDate.of(1993, 2, 5), 10);
        Secretary secretary2 = new Secretary("Ganaa", 30000, LocalDate.of(2000, 1, 1), 2);

        department[0] = professor1;
        department[1] = professor2;
        department[2] = professor3;
        department[3] = secretary1;
        department[4] = secretary2;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you wanna see sum of all salaries? Y/N : ");
        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("Y")) {
            double total = 0;
            for (DeptEmployee employee : department) {
                System.out.println("Name: "+employee.getName() + " Salary: " + employee.getSalary()+" Computed Salary: " + employee.computeSalary());
                total += employee.computeSalary();
            }
            System.out.println("Total salary: " + total);
        }
    }
}
