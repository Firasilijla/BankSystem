
package banksystem_project;

public class BankSystem_Project {

   
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        account.deposit(500);
        account.withdraw(200);
          account.withdraw(300);
        System.out.println("Current Balance: " + account.getBalance()); 

    }
    
}
