package entities;
import java.util.Date;

public class HourContract {
    Date date;
    Double valuePerHour;
    int hours;
    
    public HourContract(Date date, Double valuePerHour, int hours) {
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    


    public Date getDate() {
        return date;
    }




    public void setDate(Date date) {
        this.date = date;
    }




    public Double getValuePerHour() {
        return valuePerHour;
    }




    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }




    public int getHours() {
        return hours;
    }




    public void setHours(int hours) {
        this.hours = hours;
    }




    public Double totalValue(){
        return valuePerHour * hours;

    }

    
}
