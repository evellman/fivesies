//import BreezySwing.Format;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.*;
import java.util.*;

public class Account_test
{
public static void main (String[] args)
{

    // public Account (String owner, int account, double initial)

    Scanner scan = new Scanner(System.in);
    
    Account myChecking = new Account("Me", 12345, 300.02);
    Account mySaving = new Account("I", 24680, 2000.20);
    Account other = new Account("You", 98765, 500.50);

    System.out.println("Please change the password for account " + myChecking);
    int pass = scan.nextInt();
    myChecking.setkey(pass);
    
    System.out.println("Welcom to APCS bank");
    System.out.println("Choose a Transaction");
    System.out.println("1)Withdraw");
    System.out.println("2)Deposit");
    System.out.println("3)Balance Inquiry");
    System.out.println("4)Print Statement");
    System.out.println("5)Transfer Funds"); //transfer between savings and checking
    System.out.println("6)Unlock");

	System.out.println( myChecking.compareTo(mySaving) ); //neg result
	System.out.println( mySaving.compareTo(myChecking) ); //pos result



}//end of main
}//end of class