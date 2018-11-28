//By Zoe Lavoie
//Popeye Hw Question #1
import java.util.Scanner;

public class Popeye
{
  public static void main (String[]args)
  {
    double NauticalMiles;
    double TopSpeed;
    double AvgSpeed;
    double Miles;
    double TSpeed;
    double ASpeed;
   Scanner scan = new Scanner(System.in); 
   
   System.out.println("Enter the distance to travel in nautical miles: ");
   NauticalMiles = scan.nextDouble();
   System.out.println("Enter the top speed of the boat in knots: ");
   TopSpeed = scan.nextDouble();
   System.out.println("Enter the average speed of the boat in knots: ");
   AvgSpeed = scan.nextDouble();
   Miles = (NauticalMiles*1.1508);
     TSpeed = (NauticalMiles/TopSpeed);
     ASpeed = (NauticalMiles/AvgSpeed);
    System.out.println("The distance to travel in regular miles is: " +Miles +"Miles");
 
    System.out.println();
    System.out.println("The best case travel time is: " +TSpeed + "hours at "  +TopSpeed + "knots");
    System.out.println();
    System.out.println("The average case travel time is: " +ASpeed + "hours at "  +AvgSpeed + "knots");
  }
}