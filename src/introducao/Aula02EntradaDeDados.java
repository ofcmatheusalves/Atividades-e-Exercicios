package introducao;
//Aula de entrada de dados
import java.util.Locale;
import java.util.Scanner;

public class Aula02EntradaDeDados {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String x;
        int y;
        double z;

        System.out.println("Digite seu nome:");
        x = sc.nextLine();
        System.out.printf("Nome: %s\n", x);

        System.out.println("\nDigite sua idade:");
        y = sc.nextInt();
        System.out.printf("Idade: %d anos\n", y);

        System.out.println("\nDigite sua altura: ");
        z = sc.nextDouble();
        System.out.printf("Altura é : %.2fm\n", z);

    }
}
