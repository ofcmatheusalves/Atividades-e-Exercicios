package introducao.ExerciciosFor;

import java.util.Scanner;

public class Exercicio02 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número máximo");
        int numeroInicial = scan.nextInt();

        int in = 0;
        int out = 0;

        System.out.println("Digite os números para o computador dizer \nqual é IN e qual é OUT:");
        for (int i = 0; i < numeroInicial; i++){

            int numeroRepitido = scan.nextInt();

            if (numeroRepitido < 10 || numeroRepitido > 20){
                out = out + 1;
            }
            else {
                in = in + 1;
            }
        }
        System.out.println("in: "+in);
        System.out.println("out: "+out);
    }
}
