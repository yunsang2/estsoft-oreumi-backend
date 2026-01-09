package day6;

public class BankAccount {
    private String owner;
    private int accountNumber;
    private int balance;

    public BankAccount(String owner, int accountNumber) {
        setOwner(owner);
        setAccountNumber(accountNumber);

        balance = 0;
    }

    private void setOwner(String name) {
        this.owner = name;
    }
    private void setAccountNumber(int n) {
        this.accountNumber = n;
    }

    public String getOwner(){return owner;}
    public int getAccountNumber(){return accountNumber;}
    public int getBalance(){return balance;}

    public BankAccount deposit(int n){
        if(n < 0)
            return null;
        else {
            System.out.printf("You have deposited %d won.\n", n);
            this.balance += n;
        }
        return this;
    }
    public BankAccount withdraw(int n){
        if(n < 0 || balance < n){
            System.out.println("You have not enough money!!");
            return this;
        }
        else
            System.out.printf("You have withdrawn %d won.\n", n);
        this.balance -= n;
        return this;
    }

    public void printBalance(){
        System.out.println("Balance: " + this.balance);
    }
    public void print(){
        System.out.println("Owner: " + this.owner);
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Balance: " + this.balance);
    }


}
