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

   public int compareTo(Object obj)
   {
	   int result = 0;
	   result = this.streetAddress.compareTo(obj.streetAddress);
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
