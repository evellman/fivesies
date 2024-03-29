
public class Student //implements Comparable
{
    private static int population;
    //public static int population;

    private String firstName, lastName;
    private Address homeAddress;

    private static Address schoolAddress = new Address("440 W. Aurora", "Naperville", "IL", 60540);

    

    /**
    //  Sets up this Student object with the specified initial values.
    */
    public Student (String first, String last, Address home)
    {
        //static var increase pop for ever student created in that school
        population ++; 
        //System.out.println(population  );

        firstName = first;
        lastName = last;
        homeAddress = home;

    }
    
    /**
    //  Copies data from other Student object 
    //  @param Student obj
    */
    public Student (Student obj)
    {
        
        this.firstName = obj.firstName; //alias - doesn't matter cuz strongz r immutable
        this.lastName = new String(obj.lastName); //makes new object - better than alias
        this.homeAddress = new Address(obj.homeAddress);

    }
    
    
    /*------------------------------------------------
    * returns the population = to the amount of student objects created
    */
    public static int get_pop ()
    {
        return population;
    }



    public static Address getSchool()
    {

        return schoolAddress;

    }


     /**
      //  implement Comparable by make the compareTo method
    */

    public int compareTo(Object obj)
    {
        int result = 0;
        Student temp = (Student) obj;

        result = this.lastName.compareTo(temp.lastName);
        if (result == 0)
        {
            result = this.firstName.compareTo(temp.firstName);
        }
        
        return result;
    }



    public String get_name()
    {
        return firstName;

    }



    //returns the amount of studnet obj created
    //public static int get_pop()
    
    //{
       //return population;

    //}
    


    /**
    //  Returns this Student object as a string.
    @return ________
    */
    public String toString()
    {
      String result;

      result = firstName + " " + lastName + "\n";
      result += "Home Address:\n" + homeAddress + "\n";
      //result += "School Address:\n" + schoolAddress;

      return result;
    }
}//end of Student
