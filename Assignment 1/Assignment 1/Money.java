//By Zoe Lavoie
//Money Hw Question #2
import java.util.Scanner;

public class Money
{
  public static void main (String[]args)
  {
    int Cents;
    int Quarters;
    int Dimes;
    int Nickles;
    int Pennies;
    int FiftyPiece;
    int CentsFinal;
    
   Scanner scan = new Scanner(System.in); 
   
   System.out.println("Enter an amount of change in cents: ");
   Cents = scan.nextInt();
   FiftyPiece = (Cents/50);
   CentsFinal = (Cents-(50*FiftyPiece));
   Quarters = (CentsFinal/25);
   CentsFinal = (Cents-(50*FiftyPiece)-(25*Quarters));
   Dimes = (CentsFinal/10);
   CentsFinal = (Cents-(50*FiftyPiece)-(25*Quarters)-(10*Dimes));
   Nickles = (CentsFinal/5);
   CentsFinal = (Cents-(50*FiftyPiece)-(25*Quarters)-(10*Dimes)-(5*Nickles));
   Pennies = (CentsFinal/1);
   System.out.println("Change Inputed (Out of a Dollar): " +Cents);
   System.out.println("Fifty-cent pieces: " +FiftyPiece);
   System.out.println("Quarters: " +Quarters);
   System.out.println("Dimes: " +Dimes);
   System.out.println("Nickles: " +Nickles);
   System.out.println("Pennies: " +Pennies);
   System.out.println("Total Coins: " + (Quarters + Dimes + Nickles + Pennies));
  }
}