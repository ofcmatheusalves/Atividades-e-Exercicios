package introducao.ExerciciosCondicao;
import java.util.Scanner;

public class Exercicio06 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        double X = scan.nextDouble();

        if (X >= 0 && X <= 25) {
            System.out.println("Intervalo: [0, 25]");

        } else if (X >= 25.01 && X <= 50) {
            System.out.println("Intervalo: [25, 50]");

        } else if (X >= 50.01 && X <= 75) {
            System.out.println("Intervalo: [50, 75]");

        } else if (X >= 75.01 && X <= 100) {
            System.out.println("Intervalo: [75, 100]");

        } else
            System.out.println("Fora de intervalo");

        scan.close();
    }
}
