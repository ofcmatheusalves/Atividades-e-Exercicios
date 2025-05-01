package introducao.ExerciciosFor;

import java.util.Scanner;

public class Exercicio07 {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor inicial: ");
        int valor = scan.nextInt();

        for (int i = 1; i <= valor; i++){

            double valorQuadrado = Math.pow(i, 2);
            double valorCubo = Math.pow(i, 3);

            System.out.printf("%d %.0f %.0f\n", i, valorQuadrado, valorCubo);

        }
    }
}
