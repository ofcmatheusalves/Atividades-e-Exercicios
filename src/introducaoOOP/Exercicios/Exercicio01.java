/*
 Programa para ler a altura e a largura de um retangulo
 Em seguida mostra o valor a área, perímetro e a diagonal do retangulo
 */

package introducaoOOP.Exercicios;

import introducaoOOP.entities.Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();
        System.out.println("Digite as medidas do retangulo: ");
        System.out.print("Altura: ");
        retangulo.altura = scan.nextDouble();

        System.out.print("Largura: ");
        retangulo.largura = scan.nextDouble();

        System.out.println(retangulo);
        scan.close();
    }
}
