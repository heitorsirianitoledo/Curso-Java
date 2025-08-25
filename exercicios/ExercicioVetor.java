import java.util.Locale;
import java.util.Scanner;
import entities.Altura;

public class ExercicioVetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Ask the user how many people will be entered
        System.out.println("Quantas pessoas serão digitadas?");
        int n = sc.nextInt();
        Altura[] vect = new Altura[n];

        // Collect data for each person
        for (int i = 0; i < vect.length; i++) {
            sc.nextLine(); // Consume leftover newline
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            Double altura = sc.nextDouble();
            vect[i] = new Altura(name, idade, altura);
        }

        // Calculate the average height
        Double som = 0.00;
        for (int i = 0; i < vect.length; i++) {
            som += vect[i].getAltura();
        }
        Double media = som / vect.length;
        System.out.printf("Altura média: %.2f%n", media);

        // Count people under 16 years old
        Double midade = 0.00;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getIdade() < 16) {
                midade++;
            }
        }

        // Calculate and print the percentage of people under 16
        Double porcentagem = ((double) midade / n) * 100.0;
        System.out.printf("Porcentagem de pessoas com menos de 16 anos: %.2f%n", porcentagem);

        // Print the names of people under 16
        System.out.println("Nome das pessoas com menos de 16 anos: ");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getIdade() < 16) {
                System.out.println(vect[i].getName());
            }
        }

        // Close the scanner after usage
        sc.close();
    }
}