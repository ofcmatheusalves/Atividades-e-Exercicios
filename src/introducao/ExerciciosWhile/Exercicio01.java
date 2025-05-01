package introducao.ExerciciosWhile;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int kay = scan.nextInt();

        while (kay != 2002) {
            System.out.println("Senha incorreta");
            kay = scan.nextInt();
        }
        System.out.println("Acesso concedido.");
    }
}
