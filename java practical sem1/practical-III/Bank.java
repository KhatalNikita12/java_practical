import java.util.Scanner;
public class Bank {
     String accountHolder;
     double balance;

    public Bank(String nm) {
        accountHolder = nm;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + " into the account of " + accountHolder);
        } 
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount + " from the account of " + accountHolder);
        } 
    }

    public double getBalance() {
        System.out.println("Account balance for " + accountHolder + ": $" + balance);
        return balance;
    }

    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       System.out.println("Enter ur Name");
       String nam=input.nextLine();
       Bank myAccount = new Bank(nam);
       while(true){
       System.out.println("Enter Your choice");
       System.out.println("1.Deposit ");
       System.out.println("2.Withdraw");
       System.out.println("3.GetBalence");
       int ch=input.nextInt();
       switch(ch){
           case 1:
               System.out.println("Enter Amount For Deposit ");
               double amt=input.nextInt();
               myAccount.deposit(amt);
               break;
           case 2:
               System.out.println("Enter Amount For Withdrawal ");
               double amt2=input.nextInt();
               myAccount.withdraw(amt2);
               break;
           case 3:
             myAccount.getBalance(); 
       }
        
       }
        
        
    }
}
