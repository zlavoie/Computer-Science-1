//HW #1
//Assignment #2
import java.util.*;

public class PhoneCall
{
  public static void main (String[]args)
  {
    int Length;
    int Rate;
    Double Conversion;
   Scanner scan = new Scanner(System.in); 
   
   System.out.println("Enter the length of the call: ");
   Length = scan.nextInt();
   System.out.println("Enter the rate code: ");
   Rate = scan.nextInt();
   
   switch (Rate)
   {
   
    case 0:
      Conversion = Length*.15;
      System.out.println("The cost of the call is $ " + Conversion); 
     break;
     
    case 1:
    Conversion = Length*.07;
    System.out.println("The cost of the call is $ " + Conversion); 
     break;
    
    case 2:
      Conversion= Length*.05;
      System.out.println("The cost of the call is $ " + Conversion); 
      break;
     
    default:
     System.out.println("Illegal Rate Code");
    break;
   }
  }
}