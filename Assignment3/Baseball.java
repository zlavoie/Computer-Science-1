//By Zoe Lavoie
//Hw Baseball
import java.util.*;

public class Baseball
{
  public static void main (String[]args)
  {
  Scanner scan = new Scanner(System.in);
  System.out.println("What integer would you like to calculate?"); 
    double n= scan.nextDouble();
    
   double x;
   double y;
   double calculation;
   calculation=1;
   double games;
   
   if (n<1)
   {
     System.out.println("Please input an amount of greater than zero.");
                         n = scan.nextDouble();
                        }
   
  games = ((2*n)+1);

    for (x=1;x<games;x++)
    {
      y=(((2*x)-1)/(2*x));
      calculation=(calculation*y);
      System.out.println(calculation);
    }
    System.out.println("The probability that a competition of "+games+" games will go all the way is "+(calculation*100)+"%");
  }
}
                          