package entities;

public class student {
    public String name;
    public Double firstgrade;
    public Double secondgrade;
    public Double thirdgrade;

    public Double finalgrade(){
        return (firstgrade + secondgrade + thirdgrade)/3;
    }
    public Double Missingpoints(){
        if (finalgrade() < 60.00){
            return 60.00 - finalgrade();
        }
        else {
            return 0.0;
        }

        }
    }


    

