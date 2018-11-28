//HW #4
//Assignment #2
import java.util.*;

public class Stocks
{
  public static void main (String[]args)
  {
   double Stock;
    double Commission;
    
   Scanner scan = new Scanner(System.in); 
   
   System.out.println("Enter the stock sale: ");
   Stock = scan.nextDouble();

if (Stock<100) 
{
 Commission = 20;
}
  else
  {
    if ((Stock>=100)&&(Stock<=999))
    {
     Commission = 20 + ((1/99)*100);
    }
      else
      {
        if ((Stock>=1000)&&(Stock<=9999))
        {
          Commission = 30 + ((.5/999)*100);
        }
          else
          {
            if ((Stock >= 10000)&&(Stock<=99999))
                  {
                  Commission = 75 + ((.25/9999)*100);
                }
}
}
}
}
}


  