import java.util.Locale;
import java.util.Scanner;
import entities.Product;;
public class Exercicio11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

       
        System.out.println("Enter Product Data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        Double price = sc.nextDouble();
        System.out.print("Quantity in Stock: ");
        int quantity = sc.nextInt();

        Product product = new Product(name, price, quantity);
        System.out.println();
        System.out.println("Product Data: " + product.ToString());
        System.out.println();
        System.out.println("Enter the number of the products to be added in stock: ");
        quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Updated Data: " + product.ToString());

        System.out.println();
        System.out.println("Enter the number of the products to be removed in stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated Data: " + product.ToString());

        sc.close();
       

        



        

    }
}
