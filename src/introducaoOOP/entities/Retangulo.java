package introducaoOOP.entities;

public class Retangulo {

    public double altura;
    public double largura;

    public double area() {
        return altura * largura;
    }

    public double perimetro(){
        return (altura * 2) + (largura * 2);
    }

    public double diagonal(){
        double d = (Math.pow(altura, 2)) + (Math.pow(largura,2));
        return Math.sqrt(d);
    }

    public String toString(){
        return String.format("AREA: %.2f",area())
                +"\n"
                +String.format("PERIMETRO: %.2f",perimetro())
                +"\n"
                +String.format("DIAGONAL: %.2f",diagonal());
    }
}
