
package banksystem_project;


public class BankAccount {
    
    private double balance;

    public BankAccount(double initialBalance){
        if(initialBalance >= 0){
            balance = initialBalance;
        }
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Invalid withdrawal.");
        }
    }

    public double getBalance(){
        return balance;
    }
}



