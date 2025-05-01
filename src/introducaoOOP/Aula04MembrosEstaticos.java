package introducaoOOP;

import introducaoOOP.entities.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Aula04MembrosEstaticos {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = scan.nextDouble();

        double c = Calculator.circumference(radius);

        double v = Calculator.volume(radius);

        System.out.printf("Circumference: %.2f\n", c);

        System.out.printf("Volume: %.2f\n", v);

        System.out.printf("Pi value: %.2f\n", Calculator.PI);

        scan.close();
    }

}
