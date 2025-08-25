import java.util.Locale;
import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Double [] vect = new Double[n];

        for(int i = 0; i<vect.length ; i++){
            System.out.println("Digite o número: ");
            vect[i] = sc.nextDouble();

        }
        System.out.println("Números Negativos: ");
        for(int i = 0; i<n; i++){
            if(vect[i]<0){
               
                System.out.println(vect[i]);
            }
        }
        
    }
}
