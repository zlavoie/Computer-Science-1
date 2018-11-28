//By Zoe Lavoie
//Hw CoinFlips
import java.util.*;

public class CoinFlips
{
  public static void main (String[]args)
  {
  Scanner scan = new Scanner(System.in);
  {
  System.out.println("How many times do you want to flip the coin?"); 
 int digit = scan.nextInt();
 
 int num;
 int heads;
 heads=0;
 int best;
 int newbest;
 newbest=0;
 best=0;
 int total=0;
 
 for (num=1; num<=digit;num++)
 {
  int x = (int)(Math.random()+.5);
   if (x==0)
 {
   System.out.print(0);
   best=best+1;
   total=total+1;
 }
 if (x==1)
 {
   System.out.print(1);
   if(best>newbest)
   {
   newbest=best;
   }
   else
   {
     best=0;
 }
  }
 }
 System.out.println();
 System.out.println("The longest sequence of heads is of length "+newbest);
 System.out.println("The total number of heads was "+total+" and there were "+(digit-total)+" tails.");
}
}
}
 