package entities;

public class ImportedProduct2 extends Product2{

    private Double customsFee;

    public ImportedProduct2() {
        super();
    }

    public ImportedProduct2(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    @Override

    public String priceTag(){
        return getName() + " $ " + totalPrice() + "(CustomFee: $ " + getCustomsFee() + ")";

    }

    public Double totalPrice(){
        return getPrice() + getCustomsFee();
    }

    
    
}
