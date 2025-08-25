import java.util.Locale;
import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int quarto;
        String name, email;

        Double[]vetor = new Double[n];

        for(int i=0;i<n;i++){
            System.out.println("Name: ");
            name = sc.nextLine();
            System.out.println("E-mail: ");
            email = sc.nextLine();
            System.out.println("Quarto: ");
            quarto = sc.nextInt();


        }


    }
}
