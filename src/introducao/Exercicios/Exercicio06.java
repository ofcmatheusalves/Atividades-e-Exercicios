package introducao.Exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main (String[] args){
        Scanner rs = new Scanner(System.in);

        double A, B, C;
        var PI = 3.14159;

        System.out.println("Digite os valores: ");
        A = rs.nextDouble();
        B = rs.nextDouble();
        C = rs.nextDouble();

        var TRIANGULO = A * C / 2;

        var quadrado = Math.pow(C , 2);
        var CIRCULO = quadrado * PI;

        var TRAPEZIO = (A + B) * C / 2;

        var aoQuadrado = Math.pow(B , 2);
        var QUADRADO = aoQuadrado;

        var RETANGULO = A * B;

        System.out.printf("TRIANGULO: %.3f\n",TRIANGULO );
        System.out.printf("CIRCULO: %.3f\n",CIRCULO );
        System.out.printf("TRAPÉZIO: %.3f\n",TRAPEZIO );
        System.out.printf("QUADRADO: %.3f\n", QUADRADO);
        System.out.printf("RETANGULO: %.3f\n", RETANGULO);

    }
}
