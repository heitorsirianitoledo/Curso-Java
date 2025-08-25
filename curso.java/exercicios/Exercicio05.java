import java.util.Scanner;
public class Exercicio05 {
    public static void main(String[] args) {
        int x;
        int soma = 0;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        while (x != 0) {
            soma += x;
            x = sc.nextInt();

            
        }
        System.out.println(soma);



    }
}
