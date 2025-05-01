package introducao.Exercicios;

import java.util.Scanner;
public class Exercicio04 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int numeroDoFuncionario, horasTrabalhadas;
        double valorHora;

        System.out.println("Digite seu numero de funcionário:");
        numeroDoFuncionario = sc.nextInt();

        System.out.println("Digite suas horas trabalhadas: ");
        horasTrabalhadas = sc.nextInt();

        System.out.println("Digite quanto recebe por hora trabalhada: ");
        valorHora = sc.nextDouble();

        var salarioDoFuncionario = horasTrabalhadas * valorHora;
        System.out.printf("NUMBER = %d\nSALARY = R$ %.2f\n", numeroDoFuncionario, salarioDoFuncionario);
    }
}
