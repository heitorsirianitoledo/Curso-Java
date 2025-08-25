import java.util.Locale;
import java.util.Scanner;
public class Exercicio01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int x;
        int y;
        int p;
        Double n;
     
        x = sc.nextInt();
        sc.nextLine();
        y = sc.nextInt();
        sc.nextLine();
        p = x + y;
        n = (Double)Math.sqrt(p);
        System.out.println("O resultado de " + x + " + " + y + " é igual a " + p);
        System.out.printf("A raiz quadrada é igual a: %.2f", n);



    }
    
}
