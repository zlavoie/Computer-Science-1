//By Zoe Lavoie
//SquareRoot

import java.util.*;

public class SquareRoot
{
  
  public static void main(String[] args)
  {       
    double N=0;
    double New=0;
    double Old=0;
    double difference;
    Scanner scan = new Scanner(System.in);
    do
    {
      System.out.println("For what number would you like the square root?: ");
      N = scan.nextDouble();
      
      System.out.println("Enter your first guess: ");
      Old= scan.nextDouble();
      System.out.println(" ");
      if ((N<0)||(Old<0))
      {
        errors();
      }
    }
    while ((N<0)||(Old<0));
    
    
    
    
    System.out.println("The approximations are: ");   
    System.out.println(Old);
    
    Calc(Old, New, N);
    End();
    
  }
  
  public static void errors()  
  {
    System.out.println("You cannot input a negative number.");
    System.out.println(" ");
  }
  
  public static double Calc(double Old, double New, double N)
  {        
    New = ((Old + N/Old)/2); 
    System.out.println(New);
    if (Math.abs(Old-New)<.0001)
    {
      End();
    }
    else
    {
      Old=New;
      
      Calc(Old, New, N);
    }
    return New;
  }
  
  public static void End()
  {
    System.out.println();
  }
}