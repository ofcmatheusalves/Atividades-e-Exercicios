package introducao.Exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y;

        System.out.println("Digite um número: ");
        x = sc.nextInt();

        System.out.println("Digite outro número:");
        y = sc.nextInt();

        var soma = x + y;
        System.out.printf("Soma é igual: %d",soma);

        sc.close();

    }
}
