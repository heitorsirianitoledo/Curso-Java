import java.util.Scanner;
import java.util.Locale;
import entities.triangle;

public class Exercicio10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        triangle x,y;
        x = new triangle();
        y = new triangle();

        System.out.println("Enter the measures of the first triangle:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("\nEnter the measures of the second triangle:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        

        double a1 = x.area();
        double a2 = y.area();

        System.out.printf("\nThe area of the first triangle is: %.4f%n", a1);
        System.out.printf("\nThe area of the second triangle is: %.4f%n", a2);

        if(a1 > a2){
            System.out.println("\nThe first triangle has the larger area");
        }
        else{
            System.out.println("\nThe second triangle has the larger area");
        }



    }
}
