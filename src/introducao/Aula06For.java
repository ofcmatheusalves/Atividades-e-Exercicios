package introducao;

import java.util.Scanner;

public class Aula06For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int soma = 0;
        for (int i = 0; i < N; i = i + 1){
            int X = sc.nextInt();
            soma = soma + X;
        }
        System.out.println(soma);
    }
}
