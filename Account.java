
    
public class Account {
    private double balance;

    // No-argument constructor
    public Account() {
        this.balance = 0.0;
    }

    // Two-argument constructor
    public Account(double balance) {
        this.balance = balance;
    }

    // Method to deposit the amount to the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Method to withdraw the amount from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount");
        }
    }

    // Method to display the Balance
    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        Account account = new Account(1000.0);
        account.displayBalance();
        account.deposit(500.0);
        account.displayBalance();
        account.withdraw(200.0);
        account.displayBalance();
    }
}

