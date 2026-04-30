class Account {
    int accNo;
    double balance;

    Account(int accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }
}

class SavingsAccount extends Account {
    double interestRate; // in %

    SavingsAccount(int accNo, double balance, double interestRate) {
        super(accNo, balance); // initialize parent data
        this.interestRate = interestRate;
    }

    double calculateInterest() {
        return balance * interestRate / 100;
    }

    void display() {
        System.out.println("Account No: " + accNo);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Interest: " + calculateInterest());
        System.out.println("Total Balance after Interest: " + (balance + calculateInterest()));
    }
}

public class p5 {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount(12345, 10000, 5);
        s.display();
    }
}