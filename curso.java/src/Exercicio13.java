import java.util.Locale;
import java.util.Scanner;
import entities.employee;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        employee employee = new employee();

        System.out.println("Name: ");
        employee.Name = sc.nextLine();
        System.out.println("Gross Salary: ");
        employee.GrossSalary = sc.nextDouble();
        System.out.println("Tax: ");
        employee.Tax = sc.nextDouble();

        System.out.println();
        System.out.println("Employee: " + employee);
        System.out.println();
        System.out.println("Which percentage to increase salary: ");
        double percentage = sc.nextDouble();
        employee.IncreaseSalary(percentage);
        System.out.println();
        System.out.println("Uptaded Data: " + employee);
        sc.close();
    

        
    }
}
