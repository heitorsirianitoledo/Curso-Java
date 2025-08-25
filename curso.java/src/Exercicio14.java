import java.util.Locale;
import java.util.Scanner;
import entities.student;


public class Exercicio14 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        student student = new student();

        System.out.println("Name: ");
        student.name = sc.nextLine();
        System.out.println("First Grade: ");
        student.firstgrade = sc.nextDouble();
        System.out.println("Second Grade: ");
        student.secondgrade = sc.nextDouble();
        System.out.println("Third Grade: ");
        student.thirdgrade = sc.nextDouble();
        System.out.println();
        System.out.printf("Final Grade: %.2f%n" , student.finalgrade());
        if (student.finalgrade() < 60.00){
            System.out.println("FAILED");
            System.out.printf("MISSING POINTS: %.2f%n", student.Missingpoints());
        }
        else{
            System.out.println("PASSED");
            
        }
        sc.close();
        }


        
    }
    

