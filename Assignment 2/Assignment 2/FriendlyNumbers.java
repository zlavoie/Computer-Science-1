//By Zoe Lavoie
//Hw FriendlyNumbers
import java.util.*;

public class FriendlyNumbers
{
  public static void main (String[]args)
  {
    int digit;
    int digit1;
    int digit2;
    int digit3;
    int digit4;
    int digit5;
    
   Scanner scan = new Scanner(System.in); 
   {
   System.out.println("Welcome to Friendly Number!");
   System.out.println("Enter your five number digit: ");
   digit = scan.nextInt();
   
   digit1 = digit / 1;
   digit2 = (digit / 10 );
   digit3 = (digit /100);
   digit4 = (digit /1000);
   digit5 = (digit /10000 )% 10;
   //if 5 number digit is 12345
  //digit1:12345
  //digit2:1234
  //digit3:123
  //digit4:12
 //digit5:1
 
   if (((digit5%1)==0)&&((digit4%2)==0)&&((digit3%3)==0)&&((digit2%4)==0)&&((digit1%5)==0)) 
   {
    System.out.println("This is a friendly number!");
   }
   else
   {
     System.out.println("This is not a friendly number.");
   }
}
}
}