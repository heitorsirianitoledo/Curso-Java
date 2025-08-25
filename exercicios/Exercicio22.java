import java.util.Locale;
import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        Double[]vect = new Double[n];

        System.out.println("Digite os valores do vetor: ");
        for(int i=0;i<n;i++){
            sc.nextLine();
            vect[i] = sc.nextDouble();
        }
        Double soma = 0.00;
        for(int i=0;i<n;i++){
            soma = soma + vect[i];
        }

        Double media = soma/n;
        System.out.printf("Média dos valores: %.3f%n", media);

        System.out.println("Abaixo da Média: ");
        for(int i=0;i<n;i++){
            if(vect[i] < media){
                System.out.println(vect[i]);
                
            }
        }

    
    }
}
