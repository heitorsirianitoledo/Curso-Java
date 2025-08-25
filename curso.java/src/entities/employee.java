package entities;

public class employee {
    
    public String Name;
    public Double GrossSalary;
    public Double Tax;

    public double netSalary(){
        return GrossSalary - Tax;

    }
    public void IncreaseSalary(Double percentage){
       GrossSalary += GrossSalary * percentage / 100.0;

    }
    public String toString(){
        return Name + ", $" + String.format("%.2f", netSalary());

    }
    
}   
