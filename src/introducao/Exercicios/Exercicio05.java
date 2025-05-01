package introducao.Exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        String pecaOne, pecaTwo;
        int codeOne, codeTwo, numberPecasOne, numberPecasTwo;
        double valorUnitarioOne, valorUnitarioTwo;

        System.out.println("Digite o código da peça um: ");
        codeOne = sc.nextInt();

        System.out.println("Digite a quantidade da peça um: ");
        numberPecasOne = sc.nextInt();

        System.out.println("Digite o valor da peça um: ");
        valorUnitarioOne = sc.nextDouble();

        System.out.println("Digite o código da peça dois: ");
        codeTwo = sc.nextInt();

        System.out.println("Digite a quantidade da peça dois: ");
        numberPecasTwo = sc.nextInt();

        System.out.println("Digite o valor da peça dois: ");
        valorUnitarioTwo = sc.nextDouble();

        double valorPecaOne = numberPecasOne * valorUnitarioOne;
        double valorPecaTwo = numberPecasTwo * valorUnitarioTwo;
        double valorPago = valorPecaOne + valorPecaTwo;

        System.out.printf("VALOR A PAGAR É: R$ %.2f\n", valorPago);
        sc.close();
    }
}
