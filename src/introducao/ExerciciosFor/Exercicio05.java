package introducao.ExerciciosFor;

import java.util.Scanner;

public class Exercicio05 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        int numeroFatorial = scan.nextInt();

        for (int inicio = numeroFatorial - 1; inicio > 0; inicio = inicio - 1){
            numeroFatorial = numeroFatorial * inicio;

        }
        System.out.println("O numero fatorial é igual: "+numeroFatorial);
    }
}
