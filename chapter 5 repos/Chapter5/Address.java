//********************************************************************
//  Address.java       Author: Lewis/Loftus/Cocking
//
//  Represents a street address.
//********************************************************************

public class Address implements Comparable
{

   private String streetAddress, city, state;
   private int zipCode;

   //-----------------------------------------------------------------
   //  Sets up this Address object with the specified data.
   //-----------------------------------------------------------------

   public Address(){}

   public Address (String streetAddress, String town, String st, int zip)
   {
      this.streetAddress = streetAddress;
      city = town;
      state = st;
      zipCode = zip;
   }
   
   /**
    * copy constructor
    */
   public Address (Address obj)
   {
      this.streetAddress = new String(obj.streetAddress);
      this.city = new String(obj.city);
      this.state = new String(obj.state);
      this.zipCode = (int) obj.zipCode;
   }
   
   /**
    * returns -1, 0, 1 if I am less than, equal, or greater than object
    * @return int result
    */
   public int compareTo(Object obj) //must follow rules - very general
   {
       Address other = (Address) obj; //cast other to the object
       
       //finds first space in address
       int num = this.streetAddress.indexOf(" ");
       int other_num = other.streetAddress.indexOf(" ");
       
       //eliminates numbers to compare street
       String street = this.streetAddress.substring(num);
       String other_street = other.streetAddress.substring(other_num);
       
       int result = street.compareTo(other_street);
       
       if (result == 0)
       {
           int num2 = Integer.parseInt(this.streetAddress.substring(0,num));
           int other_num2 = Integer.parseInt(other.streetAddress.substring(0,other_num));
           
           result = num2 - other_num2;
       }

       
       return result;
   }


   public void setState(String state)
   {
       this.state = state;
    }
    
   //-----------------------------------------------------------------
   //  Returns this Address object as a string.
   //-----------------------------------------------------------------
   public String toString()
   {
      String result;

      result = streetAddress + "\n";
      result += city + ", " + state + "  " + zipCode;

      return result;
   }
}
