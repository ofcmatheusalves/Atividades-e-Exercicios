package introducao.ExerciciosCondicao;

import java.util.Scanner;
public class Exercicio07 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        double X = scan.nextDouble();
        double Y = scan.nextDouble();

        if (X > 0.0 && Y > 0.0){
            System.out.println("Q1");
        } else if (X < 0.0 && Y > 0.0) {
            System.out.println("Q2");
        } else if (X < 0.0 && Y < 0.0) {
            System.out.println("Q3");
        } else if ( X > 0.0 && Y < 0.0) {
            System.out.println("Q4");
        }else System.out.println("Origem");

        scan.close();
    }
}
