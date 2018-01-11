import java.util.Scanner;

public class Task_test
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        Task one = new Task(1.1,"read psych textbook");
        Task two = new Task(2.1,"finish english homework");
        Task three = new Task(3.1,"sleep");
        
        System.out.println("Do you want to enter a new task? ");
        String choice = scan.nextLine();
        
        if (choice == "yes")
        {
            System.out.println("Enter Priority: ");
            double prior = scan.nextDouble();
            System.out.println("Enter Description: ");
            String desc = scan.nextLine();
            
            Task four = new Task(prior,desc);
        }

    }
}