package introducao.ExerciciosCondicao;

import java.util.Scanner;

public class Exercicio05 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        double itemUm = 4.00;
        double itemDois = 4.50;
        double itemTres = 5.00;
        double itemQuatro = 2.00;
        double itemCinco = 1.50;

        int codigo, quantidade;
        codigo = scan.nextInt();
        quantidade = scan.nextInt();

        if (codigo == 1){
            double valorUm = quantidade * itemUm;
            System.out.printf("TOTAL: R$ %.2f", valorUm);
        } else if (codigo == 2) {
            double valorDois = quantidade * itemDois;
            System.out.printf("TOTAL: R$ %.2f", valorDois);
        } else if (codigo == 3) {
            double valorTres = quantidade * itemTres;
            System.out.printf("TOTAL: R$ %.2f", valorTres);
        } else if (codigo == 4) {
            double valorQuatro = quantidade * itemQuatro;
            System.out.printf("TOTAL: R$ %.2f", valorQuatro);
        } else if (codigo == 5) {
            double valorCinco = quantidade * itemCinco;
            System.out.printf("TOTAL: R$ %.2f", valorCinco);
        }

        scan.close();
    }
}
