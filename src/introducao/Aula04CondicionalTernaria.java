package introducao;

import java.util.Scanner;

public class Aula04CondicionalTernaria {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double preco = scan.nextDouble();
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;

        System.out.println(desconto);
        scan.close();
    }
}
