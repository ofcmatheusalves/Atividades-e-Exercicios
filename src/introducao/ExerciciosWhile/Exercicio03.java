package introducao.ExerciciosWhile;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alcool = 0;
        int disel = 0;
        int gasolina = 0;

        int codigo = sc.nextInt();

        while(codigo != 4 ){
            if (codigo == 1){
                alcool = alcool + 1;
                codigo = sc.nextInt();

            } else if (codigo == 3) {
                disel = disel + 1;
                codigo = sc.nextInt();

            } else if (codigo == 2) {
                gasolina = gasolina +1;
                codigo = sc.nextInt();

            }else codigo = sc.nextInt();
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("alcool: "+alcool);
        System.out.println("gasolina: "+gasolina);
        System.out.println("disel: "+disel);
        sc.close();
    }
}
