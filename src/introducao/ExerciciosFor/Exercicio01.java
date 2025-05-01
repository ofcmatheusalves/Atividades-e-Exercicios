package introducao.ExerciciosFor;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digíte um número: ");
        int X = scan.nextInt();

        System.out.println("Os números páres são: ");
        for (int inicio = 1; inicio <= X; inicio++){
            if (inicio % 2 != 0 ){
                System.out.println(inicio);
            }
        }
        scan.close();
    }
}
