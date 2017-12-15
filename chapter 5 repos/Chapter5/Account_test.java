public class Account_test
{
    public static void main (String[] args)
    {
        Account acct = new Account("Lizard",22443,1.00);
        
        acct.deposit(100);
        acct.lock(54321);
        acct.withdraw(1000,0);

        acct.setkey(45666);
        acct.unlock(45666);
        
        System.out.println(acct.getBalance());
        
    }
}