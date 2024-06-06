import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //create a new bank acount
        System.out.println("Create a new bank account: ");
        String accountNumber = scanner.nextLine();
        BankAccount account = new BankAccount(accountNumber);

        while (true) {
        System.out.println("1. Choose an option: ");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Check balance");
        System.out.println("5. Exit");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                // Deposit
                System.out.print("Enter amount to deposit: ");
                double depositAmount = scanner.nextDouble();
                account.deposit(depositAmount);
                break;
            case 2:
                // Withdraw
                System.out.print("Enter amount to withdraw: ");
                double withdrawAmount = scanner.nextDouble();
                account.withdraw(withdrawAmount);
                break;
            case 3:
                // Check balance
                System.out.println("Current balance: " + account.getBalance());
                break;
            case 4:
                // Exit
                System.out.println("Exiting...");
                return;
            default:
                System.out.println("Invalid option. Try again.");
            }
        }

    }
}
