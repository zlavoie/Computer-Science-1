//By Zoe Lavoie
//Hw MathMagic
import java.util.*;

public class MathMagic
{
  public static void main (String[]args)
  {
    
   Scanner scan = new Scanner(System.in); 
   
   int digit1;
   int digit2;
   int digit3;
   int SecretDigit;
   int Total;
   int Factor;
   
   System.out.println("Please pick four digits. With these digits make two numbers. ");
   System.out.println("Now subtract the smaller number from the larger number.");
   System.out.println("Secretly pick a non-zero digit from the difference. ");
   System.out.println("Enter the remaining three digits, one per line");
   
    digit1 = scan.nextInt();
    System.out.println(digit1);
    digit2 = scan.nextInt();
    System.out.println(digit2);
    digit3 = scan.nextInt();
    System.out.println(digit3);
    
   Total=(digit1+digit2+digit3);
   Factor=((digit1+digit2+digit3)%9);
   SecretDigit= (9-Factor);
   
   System.out.println("The secret digit is " + SecretDigit);
      }
}