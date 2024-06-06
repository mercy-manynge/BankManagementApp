public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber){
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }
    public double getBalance (){
        return balance;
    }
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else{
            System.out.println("Deposited amount should be positive");
        }
    }
    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdrew " + amount);
        }else if(amount > balance){
            System.out.println("Insuficient Funds");
        }else{
            System.out.println("Withdrawal amount should be positive");
        }

    }
}
