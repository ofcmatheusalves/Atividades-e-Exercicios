package introducaoOOP.Exercicios;

import introducaoOOP.entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = sc.nextLine();

        System.out.print("Gross salary: ");
        employee.grossSalary = sc.nextDouble();

        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();

        System.out.println();
        System.out.println("Employee: "+employee.discount());

        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        employee.increase = sc.nextDouble();

        System.out.println();
        System.out.print("Updated data: "+employee.updated());
        sc.close();
    }
}
