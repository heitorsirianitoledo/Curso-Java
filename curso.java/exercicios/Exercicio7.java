import java.util.Scanner;
public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        int comb = sc.nextInt();
         
        while(comb != 4){
            if (comb == 1){
                alcool = alcool + 1;
            }
            else if(comb == 2){
                gasolina = gasolina + 1;
            }
            else if(comb == 3){
                diesel = diesel + 1;
            }
            
            comb = sc.nextInt();

            
        }
        System.out.println("Muito Obrigado");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
    }
}
