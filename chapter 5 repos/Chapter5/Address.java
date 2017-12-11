//********************************************************************
//  Address.java       Author: Lewis/Loftus/Cocking
//
//  Represents a street address.
//********************************************************************

public class Address
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
    * returns -1, 0, 1 if I am less than, equal, or greater than object
    * @return int result
    */
   public int compareTo(Object obj)
   {
	   Address other = (Address) obj; //hayes will explain l8r
	   
	   int num = this.streetAddress.indexOf(" ");
	   int other_num = other.streetAddress.indexOf(" ");
	   
	   String street = this.streetAddress.substring(num);
	   String other_street = other.streetAddress.substring(other_num);
	   
       int result = street.compareTo(other_street);
       
       return result;
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
