package introducao.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        double raio,pi, area, quadrado;
        pi = 3.14159;

        System.out.println("Digite o raio: ");
        raio = sc.nextDouble();

        quadrado = Math.pow(raio , 2);

        area = pi * quadrado;
        System.out.printf("%.4f\n",area);
        sc.close();
    }
}
