package introducaoOOP.entities;

public class CunrrencyConverter {
    public static double IOF = 0.06;

    public static double real(double amount, double dollarPrice){
        return amount * dollarPrice * (1.0 + IOF);
    }

}
