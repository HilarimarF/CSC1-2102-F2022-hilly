package week6;

/*
 *  This is Java Docs
 *  This is a multi-line commnet
 * 
 * Our BankAccount will represent a bank account
 * It will have a balance and a name
 * It will have methods to deposit and withdraw money
 * It will have a method to pring out balance
 * It will have a menu that the user can interact with 
 * 
 */

public class BankAccount {
    private double balance; 
    private String name; 

    // Constructor 
    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
    public BankAccount(String name) {
        this.name = name;
        this.balance = 0;
    }
    public BankAccount(double balance) {
        this.balance = balance;
        this.name = "No Name";
    }
    // Deafult constructor 
    // Make a BankAccount without Specifying any parameters
    public BankAccount(){
        this.balance = 0;
        this.name = "No Name";
        }
    // Create getters and setters for balance
    public double getBalance() {
        return balance;
    }

    //create a method for printing the balance as a string 
    public String printBalance() {
        return "Your balance is: $" + balance;
    }

    //public void setBalance(double balance) {
    //   this.balance = balance;
    // }
    // set balance is flawed in that we would never 
    // be able to actually set the balance. Instead we need
    // to create methods to deposit and withdraw money

    // Create getters and setters for name 
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Create a method to deposit money
    public void deposit(double amount) {
        this.balance += amount;
        // above is the same as this.balance = balance + amount; 
        // balance is 10,000
        // balance is 2,000
        // balance = balance + amount
        // 10000 = 10000 + 2000   
    }


// create a method to withdraw money
public void withdraw(double amount) {
    this.balance -= amount; 
            // above is the same as this.balance = balance - amount; 
        // balance is 10,000
        // balance is 2,000
        // balance = balance - amount
        // 10000 = 10000 - 2000  
    }
    // create a method that will subtract a monthly fee from the balance 
    // this method will take a double as an argument 
    // this method will subtract the fee from the balance 
    public void monthlyFee(double fee) {
        withdraw(fee);

        
    }

    
}