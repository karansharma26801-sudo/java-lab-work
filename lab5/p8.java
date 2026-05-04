class Bank {
    private double balance;

    public Bank(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws Exception {
        if (amount > balance) {
            throw new Exception("Insufficient Funds");
        } else {
            balance -= amount;
            System.out.println("Withdrawal of amount: " + amount + " is successful.\nYour Remaining balance: " + balance);
        }
    }
}
public class p8 {
    public static void main(String[] args) {
        Bank bank = new Bank(1000);
        double amountToWithdraw = 800;

        try {
            bank.withdraw(amountToWithdraw);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}