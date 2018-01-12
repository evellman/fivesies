//import BreezySwing.Format;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.*;
import java.util.*;

public class Account_test1 
{
public static void main (String[] args)
{

    // public Account (String owner, int account, double initial)
    
    Scanner scan = new Scanner(System.in);
    
    Account myChecking = new Account("Me", 12345, 300.02);
    Account mySaving = new Account("I", 24680, 2000.20);
    Account other = new Account("You", 98765, 500.50);
    
    System.out.println("Welcome to APCS bank");
    System.out.println("Press 9999 to exit.");
    System.out.println("Choose a Transaction");
    System.out.println("1)Withdraw");
    System.out.println("2)Deposit");
    System.out.println("3)Balance Inquiry");
    System.out.println("4)Print Statement");
    System.out.println("5)Transfer Funds into this account");   //transfer between savings and checking
    System.out.println("6)Lock/Unlock Account");
    
    
    myChecking.setkey(54321);
    
    
    int x = 0;
    
    while (x != 9999)
    {
        System.out.println("What transaction would you like to make? ");
        
        x = scan.nextInt();
        
        if (x == 1)
        {
            System.out.println("How much would you like to withdraw? ");
            
            int y = scan.nextInt();
            
            myChecking.withdraw(y,0);
            
        }
        
        if (x == 2)
        {
            System.out.println("How much would you like to deposit? ");
            
            int y = scan.nextInt();
            
            
            myChecking.deposit(y);
            
            
        }
        
        if (x == 3)
        {
            System.out.println(myChecking.getBalance());
            
        }
        
        if (x == 4)
            {
               System.out.println(myChecking);
            }
        
        if (x == 5)
        {
            System.out.println("How much would you like to transfer? ");
            
            int y = scan.nextInt();
            
            System.out.println("What is the password for your Saving account? ");
            
            int i = scan.nextInt();
            
            mySaving.unlock(i);
            
            mySaving.withdraw(y,0);
            myChecking.deposit(y); //this may break if Saving password is wrong
            
            
        }
        
        if (x == 6)
        {
            if (myChecking.locked() == true)
                {
                    System.out.println("Whats your password? ");
    
                    int w = scan.nextInt();
    
                    myChecking.unlock(w);
                    
                }
            else 
            {
                System.out.println("Whats your password? ");
    
                int w = scan.nextInt();
    
                myChecking.lock(w);
                
            }
            
            
            System.out.println("Locked: " + myChecking.locked());
        }
        
    }
    
    System.out.println(  );
    System.out.println( myChecking.compareTo(mySaving) ); //neg result
    System.out.println( mySaving.compareTo(myChecking) ); //pos result
    
    Account[] customers = {other,myChecking,mySaving};
    
    Sorts.insertionSort(customers);
    
    for (Account me: customers)
    {
        System.out.println(me);
    }



}//end of main
}//end of class