import java.util.Scanner;

public class Task_test
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        Task one = new Task(1.1,"breathe");
        Task two = new Task(2.1,"eat");
        Task three = new Task(3.1,"drink","finished");
        
        System.out.println("Enter a new task.");
        System.out.println("Enter Priority: ");
        double prior = scan.nextDouble();
        System.out.println("Enter Description: ");
        String desc = scan.next();
        Task four = new Task(prior,desc);
        System.out.println("New task created.");
        
        System.out.println();
        
        System.out.println("Add a note to Task one.");
        String note = scan.next();
        one.setNotes(note);
        
        System.out.println();
        
        Task[] descriptions = {three,one,four,two};
        Sorts.insertionSort(descriptions);
        for (Task me: descriptions)
        {
            System.out.println(me);
        }

    }
}