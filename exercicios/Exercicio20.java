import java.util.Locale;
import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        Double[]vect = new Double[n];

        for(int i=0;i<vect.length;i++){
            System.out.println("Digite um número: ");
            vect[i] = sc.nextDouble();

        }

       Double maior = vect[0];
       int posmaior = 0;
        

        for(int i=0;i<vect.length;i++){
            if(vect[i] > maior){
                maior = vect[i];
                posmaior = i + 1;

            }
        }

        System.out.printf("MAIOR VALOR = %.1f\n", maior);
	    System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posmaior);

		sc.close();

    }
}
