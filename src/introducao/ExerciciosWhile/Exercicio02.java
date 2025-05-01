package introducao.ExerciciosWhile;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int X = scan.nextInt();
        int Y = scan.nextInt();

        while (X != 0 && Y != 0) {

            if (X > 0 && Y > 0) {
                System.out.println("primeiro");

            } else if (X < 0 && Y > 0) {
                System.out.println("segundo");

            } else if (X < 0 && Y < 0) {
                System.out.println("terceiro");

            } else {
                System.out.println("quarto");
            }
            X = scan.nextInt();
            Y = scan.nextInt();
        }
        scan.close();
    }
}
