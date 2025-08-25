import java.util.Locale;
import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String nome;
        int idade;
        double r;
        nome = sc.nextLine();
        idade = sc.nextInt();
        sc.nextLine();
        r = (Double)Math.sqrt(idade);
        System.out.println("O seu nome é: " + nome + " e a sua idade é igual a: " + idade);
        System.out.printf("A raiz quadrada da sua idade é igual a %.2f", r);
    

    }
}
