import java.util.Scanner;
public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tentativa= 0;
        int num = sc.nextInt();
        while(num != 8){
            tentativa = tentativa + 2;
            num = sc.nextInt();
        }
        System.out.println("Acertou!!!!,  tentativas: " + tentativa);

    }
}
