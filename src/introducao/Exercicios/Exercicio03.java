package introducao.Exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int A, B, C, D, DIFERENCA;

        System.out.println("Digite seus nomeros: ");
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        DIFERENCA = (A * B - C * D);
        System.out.println("DIFERENÇA = " + DIFERENCA);

        sc.close();
    }
}
