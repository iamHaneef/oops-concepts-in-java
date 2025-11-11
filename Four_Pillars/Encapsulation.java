package Oops.Four_Pillars;

// bank account

import java.util.Currency;

class Bank_Account {

    // define balance -- private
    int balance;

    //constructor
    Bank_Account (int value)
    {
        balance = value;
    }

    // deposit
    public void deposit(int amount)
    {
        if(amount > 0)
        {
            balance = balance + amount;
            System.out.println("After Deposit " + amount + " Current Balance is : " + balance);
        }
        else {
            System.out.println("Invalid fund");
        }
    }

    // withdraw
    public void withdraw (int amount)
    {
        if(amount > 0 && balance > amount)
        {
            balance = balance - amount;
            System.out.println("After withdrawl  " + amount + "  Current Balance is : " + balance);

        }
        else {
            System.out.println("Insufficient fund");
        }
    }

    // check balance
    public int check_balance()
    {
        return balance;
    }


}

public class Encapsulation {

    public static void main(String[] args)
    {
        // object for Bank_Account
        Bank_Account bank = new Bank_Account(1000);
        System.out.println("Initial Account Balance : " + bank.check_balance());
        bank.deposit(500);
        bank.withdraw(300);
        bank.check_balance();
    }

}
