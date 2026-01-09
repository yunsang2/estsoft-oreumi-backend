package day6;

public class Day6_4 {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("Harry potter", 13275);


        myAccount.print();
        myAccount.deposit(10000).printBalance();
        myAccount.withdraw(-5000).printBalance();

    }
}
