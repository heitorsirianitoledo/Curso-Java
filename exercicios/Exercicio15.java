import java.util.Locale;
import java.util.Scanner;
import entities.banco;


public class Exercicio15 {
public static void main(String[] args) {
    
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    banco Banco;

    System.out.print("Enter account number: ");
    int numberAccount = sc.nextInt();
    System.out.print("Enter account holder: ");
    sc.nextLine();
    String name = sc.nextLine();
    System.out.print("Is there a initial deposit (y/n): ");
    char response = sc.next().charAt(0);
    if (response == 'y'){
        System.out.print("Enter initial deposit value: ");
        double deposit = sc.nextDouble();
        Banco = new banco(numberAccount, name, deposit);
        
    }

    else{
        
        Banco = new banco(numberAccount, name);
       
    }

    System.out.println();
    System.out.println("Account data: " );
    System.out.println(Banco);
    System.out.println();
    System.out.print("Enter a deposit value: ");
    double depositValue = sc.nextDouble();
    Banco.DepositValue(depositValue);
    System.out.println("Uptaded account data: " );
    System.err.println(Banco);
    System.out.println();
    System.out.print("Enter a withdraw value: " );
    double withdrawValue = sc.nextDouble();
    Banco.WithDraw(withdrawValue);
    System.out.println("Uptaded account data: " );
    System.out.println(Banco);


    
    

    sc.close();






}

    
}
