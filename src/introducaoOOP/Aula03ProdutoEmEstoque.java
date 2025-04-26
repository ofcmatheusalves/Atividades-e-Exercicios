package introducaoOOP;

import introducaoOOP.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Aula03ProdutoEmEstoque {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = scan.nextLine();

        System.out.print("Price: ");
        double price = scan.nextDouble();

        System.out.print("Quantity in stock: ");
        int quantity = scan.nextInt();

        Product product = new Product(name, price, quantity);

        System.out.println();
        System.out.println("Product data: " + product);

        System.out.println();
        System.out.print("Enter the numbers of products to be added in stock: ");
        quantity = scan.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);

        System.out.println();
        System.out.print("Enter the numbers of products to be removed in stock: ");
        quantity = scan.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);

        scan.close();

    }
}
