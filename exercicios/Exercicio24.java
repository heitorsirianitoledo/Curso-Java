import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entities.Funcionarios;
import java.util.Locale;
public class Exercicio24 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        List<Funcionarios> list = new ArrayList<>();
    

        System.out.println("Quantos funcionários serão cadastrados? ");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i<n ; i++){
            System.out.println("Funcionário " + (i+1) + ":");
            System.out.print("ID: ");
            Integer id = sc.nextInt();
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Salario: ");
            Double salario = sc.nextDouble();
            Funcionarios funcionario = new Funcionarios(id, nome, salario);

            list.add(funcionario);
        }
    
        System.out.println("Digite o ID do funcionario que tera um aumento de salario: ");
        int acharID = sc.nextInt();

        Funcionarios funcionarios = list.stream().filter(x -> x.getId() == acharID).findFirst().orElse(null);
        if (funcionarios == null){
            System.out.println("Id nao encontrado");
        }
    else{
        System.out.println("Porcentagem de aumento: \n");
        Double aumento = sc.nextDouble();
        funcionarios.aumentarSalario(aumento);
    }

        System.out.println("Lista dos Funcionarios: \n");
        int m = list.size();
    for (int i=0; i<m; i++) {
      System.out.printf("Funcionário %d: \n%s\n", (i+1), list.get(i));
    }

    }



        
        
        


        








}
