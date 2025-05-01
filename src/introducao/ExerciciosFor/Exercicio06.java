package introducao.ExerciciosFor;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numeroInicial = scan.nextInt();

        for (int inicio = 1; inicio <= numeroInicial; inicio++){

            if (numeroInicial % inicio == 0){
                System.out.println(inicio);
            }
        }
    }
}
