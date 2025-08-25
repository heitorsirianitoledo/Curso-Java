import java.util.Locale;
import java.util.Scanner;



public class Exercicio19 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        Double[]vect = new Double[n];
        System.out.println();

        for(int i = 0; i<vect.length;i++){
            System.out.println("Digite um número: ");
            vect[i] = sc.nextDouble();
        }
        System.out.println("Números Pares: ");
        
        Double qtdpares = 0.00;
        for(int i=0;i<vect.length;i++){
            if(vect[i] % 2 == 0){
                System.out.println(vect[i]);
                qtdpares++;
            }
            }

            System.out.println("Quantidade de números pares: " + qtdpares);
        

        
    }
}
