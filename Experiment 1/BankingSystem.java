import java.util.Scanner;

class BankAccount {
    String name;
    int accountNumber;
    double balance;

    public BankAccount(String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful! Current Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw successful! Current Balance: " + balance);
        } else {
            System.out.println("Error: Insufficient funds. Current Balance: " + balance);
        }
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Create Account:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Account Number: ");
        int accountNumber = scanner.nextInt();
        
        System.out.print("Initial Balance: ");
        double balance = scanner.nextDouble();
        
        BankAccount account = new BankAccount(name, accountNumber, balance);
        
        System.out.print("Deposit: ");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);
        
        System.out.print("Withdraw: ");
        double withdrawAmount = scanner.nextDouble();
        account.withdraw(withdrawAmount);
    }
}
