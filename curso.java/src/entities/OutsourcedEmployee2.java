package entities;

public class OutsourcedEmployee2 extends Employee2{

    private Double additionalCharge;

    public OutsourcedEmployee2() {
        super();
    }

    public OutsourcedEmployee2(String name, int hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

     public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override

    public Double payment(){
        return super.payment() + additionalCharge * 1.1;
    }

}
