import java.util.Locale;
import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números vão ter em cada vetor? ");
        int n = sc.nextInt();
       Double[]vetorA = new Double[n];
       Double[]vetorB = new Double[n];
       Double[]vetorC = new Double[n];

       System.out.println("Digite os valores do vetor A: ");
       for(int i=0;i<n;i++){
        vetorA[i] = sc.nextDouble();

       }

       System.out.println("Digite os valores do vetor B: ");
       for(int i=0;i<n;i++){
        vetorB[i] = sc.nextDouble();
       }

       Double soma;
       System.out.println("Vetores Resultantes: ");
       for(int i=0;i<n;i++){
        soma = vetorA[i] + vetorB[i];
        System.err.println(soma);
       }
    }
}




       
