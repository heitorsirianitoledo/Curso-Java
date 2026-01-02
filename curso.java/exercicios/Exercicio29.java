import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entities.PessoaJuridica;
import entities.Employee2;
import entities.PessoaFisica;
import entities.PessoaN;

public class Exercicio29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<PessoaN>list = new ArrayList<>();

        System.out.println("Enter the number of tax payers: ");
        int num =   sc.nextInt();
        sc.nextLine();
    

    for(int i = 0; i<num;i++){
        System.out.println("Tax Payer #" + (i+ 1) + " data: ");
        System.out.println("Individual or Company(i/c)");
        String taxType = sc.nextLine();
        if(taxType.equalsIgnoreCase("i")){
            PessoaFisica pf = new PessoaFisica();
            System.out.println("Name: ");
            pf.setNome(sc.nextLine());
            System.out.println("Anual Income: ");
            pf.setRendaAnual(sc.nextDouble());
            sc.nextLine();
            System.out.println("Health Expenditures: ");
            pf.setGastosSaude(sc.nextDouble());
            sc.nextLine();
            list.add(pf);
        }
        else if(taxType.equalsIgnoreCase("c")){
            PessoaJuridica pj = new PessoaJuridica();
            System.out.println("Name: ");
            pj.setNome(sc.nextLine());
            System.out.println("Anual Income: ");
            pj.setRendaAnual(sc.nextDouble());
            sc.nextLine();
            System.out.println("Numero de Funcionarios: ");
            pj.setnFuncionarios(sc.nextInt());
            sc.nextLine();
            list.add(pj);
        }
        }

        System.out.println();

        System.out.println("Taxes Paid: \n");
        for(PessoaN pn : list){
                System.out.println(pn.getNome() + " - $" + String.format("%.2f", pn.calculoImposto()));
    }
    double sum = 0.0;
    for(PessoaN pn : list){
            sum += pn.calculoImposto();
        }

        System.out.println("Total Taxes: " + String.format("%.2f", sum));

        sc.close();


    }

}

