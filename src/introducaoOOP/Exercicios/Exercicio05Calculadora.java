package introducaoOOP.Exercicios;

import introducaoOOP.entities.Calculadora;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05Calculadora {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        System.out.println("1. Adição");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");

        System.out.println();
        System.out.print("Escolha uma operação (1/2/3/4): ");
        calculadora.calc = scan.nextDouble();

        System.out.println();
        System.out.print("Digite o primeiro número: ");
        calculadora.num1 = scan.nextDouble();

        System.out.println();
        System.out.print("Digite o segundo número: ");
        calculadora.num2 = scan.nextDouble();


        System.out.println();
        calculadora.RESULT(calculadora.calc);

        scan.close();
    }
}
