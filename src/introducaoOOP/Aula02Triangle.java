package introducaoOOP;

import introducaoOOP.entities.Triangle;

import java.util.Scanner;

public class Aula02Triangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Triangle x,y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X: ");
        x.a = scan.nextDouble();
        x.b = scan.nextDouble();
        x.c = scan.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        y.a = scan.nextDouble();
        y.b = scan.nextDouble();
        y.c = scan.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Triangle X = %.4f\n", areaX);
        System.out.printf("Triangle Y = %.4f\n", areaY);

        if (areaX > areaY){
            System.out.println("Higher is: X");
        }else System.out.println("Higher is: Y");
    }
}
