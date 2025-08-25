import java.util.Locale;
import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Double[]vect = new Double[n];
        System.out.println();

        for(int i = 0; i<n; i++){
            System.out.println("Digite um número: ");
            vect[i] = sc.nextDouble();
        }
        System.out.println("Valores: ");
        for(int i = 0; i<n; i++){
            System.out.println(vect[i]);
        }

        Double som = 0.00;

        for(int i = 0; i<vect.length; i++){
            som += vect[i];
        }
        System.out.printf("Soma = %.2f%n", som);
        Double avg = som / vect.length;

        System.out.printf("Média: %.2f%n", avg);
        
    }
}
