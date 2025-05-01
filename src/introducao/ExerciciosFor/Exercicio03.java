package introducao.ExerciciosFor;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double valorUm = 0.0;
        double valorDois = 0.0;
        double valorTres = 0.0;

        double div = 0;

        System.out.println("Digite um valor: ");
        int numeroDeCasos = scan.nextInt();

        for (int i = 0; i < numeroDeCasos; i++){

            valorUm = scan.nextDouble();
            valorUm = valorUm * 2;

            valorDois = scan.nextDouble();
            valorDois = valorDois * 3;

            valorTres = scan.nextDouble();
            valorTres = valorTres * 5;

            double soma = valorUm + valorDois + valorTres;
            div = soma / 10;

            System.out.printf("A media é: %.1f\n",div);
        }

    }
}
