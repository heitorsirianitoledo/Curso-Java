import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
         Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();
        String dia;
        switch (num) {
            case 1:
              dia = "Segunda";
            break;
            case 2:
            dia = "Terça";
            break;
            case 3:
            dia = "Quarta";
            break;
            case 4:
            dia = "Quinta";
            break;
            case 5:
            dia = "Sexta";
            break;
            case 6:
            dia = "Sábado";
            case 7:
            dia = "Domingo";
            


            
                
    
    

            break;
        
            default:
            dia = "Valor Inválido";
                break;
                
        }
        System.out.println("O dia de hoje é: " + dia);
        sc.close();
    }
}
        
    

