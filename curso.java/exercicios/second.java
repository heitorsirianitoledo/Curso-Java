import java.util.Locale;

public class second {
    public static void main(String[] args) {
        String product1 = "computer";
        String product2 = "Office Desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.0;
        double measure = 53.234567;
        Locale.setDefault(Locale.US);

        System.out.println("Products:\n" + "Computer, which price is " + price1);
        System.out.println("Office Desk, which price is " + price2);

        System.out.println("Record: " + age + " years old, code " + code + " and gender " + gender);
        System.out.println("Measue with eight decimal places: " + measure);
        System.out.printf("Rouded (three decimal places): %.3f", measure);
        



    }
    
}
