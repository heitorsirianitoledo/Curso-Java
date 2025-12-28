package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct2 extends Product2 {

    private Date manufactureDate;

    public UsedProduct2() {
        super();
    }

    public UsedProduct2(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override

    public String priceTag(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return getName() + " (used) $ " + getPrice() + " (Manufacture Date: " + sdf.format(getManufactureDate()) + " )";
    }

    



    
}
