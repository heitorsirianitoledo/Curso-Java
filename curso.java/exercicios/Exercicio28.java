import entities.Product2;
import entities.ImportedProduct2;
import entities.UsedProduct2;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;


public class Exercicio28 {
    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);
        List<Product2> list = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter the number of products: ");
        int tam = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i<tam; i++){
            System.out.println("Product #" + (i+1) + ": ");
            System.out.println("Common, Used or Import (c,u,i): ");
            String cui = sc.nextLine();
            if(cui.equalsIgnoreCase("c") ){
                Product2 p2 = new Product2();
                System.out.println("Name: ");
                p2.setName(sc.nextLine());
                System.out.println("Price: ");
                p2.setPrice(sc.nextDouble());
                sc.nextLine();
                list.add(p2);

            } else if(cui.equalsIgnoreCase("i")){
                ImportedProduct2 ip2 = new ImportedProduct2();
                System.out.println("Name: ");
                ip2.setName(sc.nextLine());
                System.out.println("Price: ");
                ip2.setPrice(sc.nextDouble());
                sc.nextLine();
                System.out.println("Customs Fee: ");
                ip2.setCustomsFee(sc.nextDouble());
                sc.nextLine();
                list.add(ip2);
            } else if(cui.equalsIgnoreCase("u")){
                UsedProduct2 up2 = new UsedProduct2();
                System.out.println("Name: ");
                up2.setName(sc.nextLine());
                System.out.println("Price: ");
                up2.setPrice(sc.nextDouble());
                sc.nextLine();
                System.out.println("Manufacture Date (DD/MM/YYYY): ");
                String dateStr = sc.nextLine();
                Date manufactureDate = sdf.parse(dateStr);
                up2.setManufactureDate(manufactureDate);
                list.add(up2);

            }


        }

         System.out.println("Price Tags: ");
            for(Product2 p2: list){
                System.out.println(p2.priceTag());

            }

        

        
    }
}
