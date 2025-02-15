import java.util.Scanner;

public class ATM {
    private static final int CORRECT_PIN = 1234;
    private static double balance = 3000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter PIN: ");
        try {
            int enteredPin = scanner.nextInt();
            if (enteredPin != CORRECT_PIN) {
                throw new SecurityException("Error: Invalid PIN.");
            }
            System.out.print("Withdraw Amount: ");
            double amount = scanner.nextDouble();
            if (amount > balance) {
                throw new IllegalArgumentException("Error: Insufficient balance.");
            }
            balance -= amount;
            System.out.println("Withdrawal successful. Current Balance: " + balance);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Current Balance: " + balance);
        }
        scanner.close();
    }
}
