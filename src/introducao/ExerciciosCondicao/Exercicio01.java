package introducao.ExerciciosCondicao;

import java.util.Scanner;

public class Exercicio01 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int X;

        System.out.println("Entrada: ");
        X = sc.nextInt();

        if (X >= 0){
            System.out.println("NÃO NEGATIVO");
        }else {
            System.out.println("NEGATIVO");
        }
    }
}
