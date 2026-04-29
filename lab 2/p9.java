class BankAccount {
    String accountHolderName;
    double balance;

    
    BankAccount(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    
    void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposited: " + amount);
        System.out.println("Updated Balance: " + balance);
    }

    
    void display() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}


public class p9 {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Karan", 1000);

        acc1.display();
        System.out.println();

        acc1.deposit(500);
    }
}