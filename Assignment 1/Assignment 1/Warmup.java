//By Zoe Lavoie
//Hw Warmup
import java.util.Scanner;

public class Warmup
{
  public static void main (String[]args)
  {
    double degreeF;
    double degreeC;
   Scanner scan = new Scanner(System.in); 
   
   System.out.println("Welcome to the Temperature Converter!");
   System.out.println("Enter your temperature degrees Fahrenheit: ");
   degreeF = scan.nextDouble();
   degreeC=(5*(degreeF-32))/9; 
    System.out.println("Ok. That is " +degreeC + " degrees Celcius.");     System.out.println(" Bye!");
  }
}