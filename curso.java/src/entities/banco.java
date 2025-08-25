package entities;

public class banco {

    private int numberAccount;
    private String name;
    private double deposit;

    

    public banco(int numberAccount, String name, double deposit) {
        this.numberAccount = numberAccount;
        this.name = name;
        this.deposit = deposit;
    }

    

    public banco(int numberAccount, String name) {
        this.numberAccount = numberAccount;
        this.name = name;
    }



    public int getNumberAccount() {
        return numberAccount;
    }



    public void setNumberAccount(int numberAccount) {
        this.numberAccount = numberAccount;
    }



    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }



    public double getDeposit() {
        return deposit;
    }



    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }



    public void DepositValue(double depositValue){
        this.deposit += depositValue;
    }

    public void WithDraw(double deposit){
        this.deposit -= deposit + 5;
    }

    public String toString() {
        return "Account "
                + numberAccount
                + ", Holder: "
                + name
                + ", Balance: $"
                + String.format("%.2f", deposit);
    }
  
}




    

