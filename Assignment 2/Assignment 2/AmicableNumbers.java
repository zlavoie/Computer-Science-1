//By Zoe Lavoie
//Hw AmicableNumbers
import java.util.*;

public class AmicableNumbers
{
  public static void main (String[]args)
  {
    int num1;
    int num2;
    int x;
    int y;
    int sum1;
    int sum2;
    int answer;
    
    Scanner scan = new Scanner(System.in); 
    
    do
    {
      y=1;
      x=1;
      sum1=0;
      sum2=0;
      System.out.println("Welcome to the Amicable Numbers Checker!");
      System.out.println("Enter your first number: ");
      num1 = scan.nextInt();
      
      System.out.println("Enter your second number: ");
      num2 = scan.nextInt();
      {
      do
      {
        if  ((num1%x)==0)
        {
          sum1=sum1+x;
          x = x+1;
        }
        else
        {
          x=x+1;
      }
      }
        while (( x<num1)&&(x != num1));
        
        do
        {
          
          if  ((num2%y)==0)
          {
            sum2=sum2+y;
            y = y+1;
          } 
          else
          {
            y=y+1;
          }
        }
          while (( y<num2)&&(y != num2));
          
          if ((sum1==num2)&&(sum2==num1))
          {
            System.out.println("The numbers are amicable"); 
          }
          else
          {
            System.out.println("The numbers are not amicable"); 
          }
          System.out.println ("Run again? Type 1 for (Yes) any other digit for (No): ");
          answer=scan.nextInt();
    }
    }
    while (answer == 1);
    System.out.println("Bye!");

}
}
