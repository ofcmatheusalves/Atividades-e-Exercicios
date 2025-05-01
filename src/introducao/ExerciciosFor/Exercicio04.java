package introducao.ExerciciosFor;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int numeroDeLoop = scan.nextInt();

        for (int inicio = 0; inicio < numeroDeLoop; inicio++){

            double numeroUm = scan.nextDouble();
            double numeroDois = scan.nextDouble();

            if (numeroDois == 0){
                System.out.println("Divisão impossível.");
            }else{
                double divisao = numeroUm / numeroDois;
                System.out.printf("A divisão é igual = %.1f\n",divisao);
            }
        }
    }
}
