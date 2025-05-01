package introducaoOOP.entities;

public class Calculadora {

    public double num1;
    public double num2;
    public double calc;

    public void RESULT(double calc) {
        this.calc = calc;

        if (calc == 1) {
            double adicao = num1 + num2;
            System.out.printf("Resultado igual: %.1f", adicao);
        } else if (calc == 2) {
            double subtracao = num1 - num2;
            System.out.printf("Resultado igual: %.1f", subtracao);
        } else if (calc == 3) {
            double multiplicacao = num1 * num2;
            System.out.printf("Resultado igual: %.1f", multiplicacao);
        } else if (calc == 4) {
            double divisao = num1 / num2;
            System.out.printf("Resultado igual: %.1f", divisao);
        }
    }
}
