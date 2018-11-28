//By Zoe Lavoie
//Hw TollFreeCall
import java.util.*;

public class TollFreeCall
{
  public static void main (String[]args)
  {
    
 
    long digit3;
    long digitmiddle1;
     long digitmiddle2;
     long digitmiddle3;
     long enddigit1;
     long enddigit2;
     long enddigit3;
     long enddigit4;
 
   Scanner scan = new Scanner(System.in); 
   {
   System.out.println("Welcome to Toll Free Call Checker!");
   System.out.println("Enter your 10 digit telelphone number: ");
  long digit = scan.nextLong();
  
  digitmiddle1 = (digit /1000000)%10;
  digitmiddle2 = (digit /100000)%10;
  digitmiddle3 = (digit /10000)%10;
  enddigit1 = (digit/1000)%10;
  enddigit2 = (digit/100)%10;
  enddigit3 = (digit/10)%10;
  enddigit4 = (digit/1)%10;
  digit3 = (digit /10000000);
  
 if ((digit3 == 800)||(digit3==888)||(digit3==877)||(digit3==866))
 {
 System.out.println(digit3+"-"+digitmiddle1+digitmiddle2+digitmiddle3+"-"+enddigit1+enddigit2+enddigit3+enddigit4+" is a toll free number");
  }
else
 {
System.out.println(digit3+"-"+digitmiddle1+digitmiddle2+digitmiddle3+"-"+enddigit1+enddigit2+enddigit3+enddigit4+" is not a toll free number");
}
}
}
}