import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entities.Employee2;
import entities.OutsourcedEmployee2;

public class Exercicio27 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        

        List<Employee2>employeeList = new ArrayList<>();

        System.out.println("Enter the number of employees: ");
        int tam = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i<tam; i++){
            System.out.printf("Employee #%s data:\n", (i+1));
            System.out.println("Outsourced(y/n): ");
            String employeeType = sc.nextLine();
            if(employeeType.equalsIgnoreCase("y")){
                OutsourcedEmployee2 oem2 = new OutsourcedEmployee2();
                System.out.println("Name: ");
                oem2.setName(sc.nextLine());
                System.out.println("Hours: ");
                oem2.setHours(sc.nextInt());
                System.out.println("Value Per Hour: ");
                oem2.setValuePerHour(sc.nextDouble());
                sc.nextLine();
                System.out.println("Additional Charge: ");
                oem2.setAdditionalCharge(sc.nextDouble());
                sc.nextLine();
                employeeList.add(oem2);
            } else{
                Employee2 em2 = new Employee2();
                
                System.out.println("Name: ");
                em2.setName(sc.nextLine());
                System.out.println("Hours: ");
                em2.setHours(sc.nextInt());
                System.out.println("Value Per Hour: ");
                em2.setValuePerHour(sc.nextDouble());
                sc.nextLine();
                employeeList.add(em2);
            }

        }

            System.out.println();
            System.out.println("PAYMENTS: ");

            for(Employee2 emp : employeeList){
                System.out.println(emp.getName() + " - $" + String.format("%.2f", emp.payment()));
    }
  
    sc.close();
}
}
