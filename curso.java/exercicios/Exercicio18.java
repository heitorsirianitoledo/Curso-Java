import java.util.Locale;
import java.util.Scanner;
import entities.Altura;



public class Exercicio18 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas pessoas serão digitadas?");
        int n = sc.nextInt();
        Altura[]vect = new Altura[n];

        for(int i = 0;i<vect.length;i++){
            sc.nextLine();
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            Double altura = sc.nextDouble();
            vect[i] = new Altura(name, idade, altura);

        }
        Double som = 0.00;

        for(int i=0;i<vect.length;i++){
            som += vect[i].getAltura();
        }
        
        Double media = som/vect.length;
        System.out.printf("Altura média: %.2f%n", media);
        Double midade = 0.00;
       for(int i=0;i<vect.length;i++){
        if(vect[i].getIdade() < 16){
            midade++;
        }
    }

        Double porcentagem = ((double)midade / n) * 100.0;
        System.out.printf("Porcentagem de pessoas com menos de 16 anos:%.2f%n ", porcentagem);
        
        System.out.print("Nome das pessoas com menos de 16 anos: ");
        for(int f=0;f<vect.length;f++){
            if(vect[f].getIdade() < 16){
                System.out.println( vect[f].getName());
                }
        }
    
         sc.close();
       




        
    
}
}
