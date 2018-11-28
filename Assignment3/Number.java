//By Zoe Lavoie
//Hw Number
import java.util.*;

public class Number
{
  public static void main (String[]args)
  {
    int count =0;
  long newdigit;
    int x;
   Scanner scan = new Scanner(System.in); 
   {
   System.out.println("Welcome to Toll Free Call Checker!");
   System.out.println("Enter your 10 digit number: ");
  long digit = scan.nextLong();
  
 newdigit=digit;
 for (x=10;x>0;x--)
 {
   if ((newdigit%x)==0)
 {
   count=count+1;
 }
   newdigit=newdigit/10;
 }
 
 if (count==10)
 {
    System.out.println("This is a perfect number!");
            }
 if(count!=10)
 {
      System.out.println("Number of divisions:"+count);
 }
}
}
}
