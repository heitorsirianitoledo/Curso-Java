import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.WorkerLevel;

public class Exercicio25 {
    public static void main(String[]args)throws ParseException{
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter department name: ");
        String departmentName = sc.nextLine();
        System.out.println("Enter worker data: ");
        System.out.println("Name: ");
        String workerName = sc.nextLine();
        System.out.println("Level: ");
        String workerLevel = sc.nextLine();
        System.out.println("Base Salary: ");
        Double baseSalary = sc.nextDouble();

        Worker worker = new Worker(workerName,WorkerLevel.valueOf(workerLevel),baseSalary,new Department(departmentName));

        System.out.println("How many contracts to this worker: ");
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            System.out.println("Enter Contract #" + (i+1) + ":");
            System.out.println("Date (DD/MM/YY): ");
            Date contractDate = sdf.parse(sc.next());
            System.out.println("Value per hour: ");
            Double valuePerHour = sc.nextDouble();
            System.out.println("Duration(hours): ");
            int hours = sc.nextInt();
            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);

        }

        System.out.println("Enter month and year to calculate income(MM/YY)");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: " + workerName);
        System.out.println("Department: " + departmentName);
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));





        


    }
}
