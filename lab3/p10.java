
class Recharge {
    String mobileNumber;
    double planAmount;

    // Constructor
    Recharge(String mobileNumber, double planAmount) {
        this.mobileNumber = mobileNumber;
        this.planAmount = planAmount;
    }
}


class DataRecharge extends Recharge {
    double dataLimit; // in GB

    
    DataRecharge(String mobileNumber, double planAmount, double dataLimit) {
        super(mobileNumber, planAmount); // initialize parent data
        this.dataLimit = dataLimit;
    }

    
    void showBenefits() {
        System.out.println("Benefits:");
        System.out.println("- Data Limit: " + dataLimit + " GB");
        System.out.println("- Unlimited Calls");
        System.out.println("- 100 SMS/day");
    }

   
    void display() {
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Plan Amount: " + planAmount);
        showBenefits();
    }
}


public class p10 {
    public static void main(String[] args) {
        DataRecharge r = new DataRecharge("9876543210", 299, 1.5);
        r.display();
    }
}

