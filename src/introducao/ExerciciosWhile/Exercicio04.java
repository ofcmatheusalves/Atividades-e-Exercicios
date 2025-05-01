package introducao.ExerciciosWhile;

import java.util.Scanner;

public class Exercicio04 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número de 0 a 10: ");
        int number = sc.nextInt();

        while (number > 10){
            System.out.println("Número inválido");
            number = sc.nextInt();
        }
        System.out.println("Sua nota é: "+number);
    }
}
