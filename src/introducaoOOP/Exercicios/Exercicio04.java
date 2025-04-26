package introducaoOOP.Exercicios;

import introducaoOOP.entities.CunrrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dollarPrice = scan.nextDouble();

        System.out.print("How many dollars will be bought? ");
        double amount = scan.nextDouble();

        double result = CunrrencyConverter.real(amount, dollarPrice);
        System.out.printf("Amount to be paid in reais = %.2f\n", result);

        scan.close();
    }
}
