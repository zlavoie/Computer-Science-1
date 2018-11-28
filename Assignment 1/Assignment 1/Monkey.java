//By Zoe Lavoie
//Hw Monkey #3
import java.util.*;

public class Monkey
{
  public static void main (String[]args)
  {
    int original;
    int CM1;
    int CM2;
    int CM3;
    int CM4;
    int CM5;
  int Monkey = 1;
  int Overall;
    
   Scanner scan = new Scanner(System.in); 
   
   System.out.println("Enter the initial amount of coconuts: ");
   original = scan.nextInt();
   System.out.println("Initial Number of Coconuts: " + original);
   
   CM1 = ((original*1)/5); 
  Overall = (original-CM1 - 1);
   System.out.println("Man1: " + CM1 + " coconuts; Monkey: " + Monkey + " Coconut.");
     CM2= (Overall/5);
  int Overall2 = (Overall-CM2 - 1);
   System.out.println("Man2: " +CM2 + " coconuts; Monkey: " + Monkey+ " Coconut.");
  
   CM3 = (Overall2/5);
  int Overall3 = (Overall2-CM3 - 1);

   System.out.println("Man3: " +CM3 + " coconuts; Monkey: " + Monkey+ " Coconut.");

   CM4 = (Overall3/5);
   int Overall4 = (Overall3-CM4 - 1);
System.out.println("Man4: " +CM4 + " coconuts; Monkey: " +Monkey+ " Coconut.");

CM5 = (Overall4/5);
  int Overall5 = (Overall4-CM5 - 1);
System.out.println("Man5: " +CM5 + " coconuts; Monkey: " +Monkey+ " Coconut.");

int SplitUp=(Overall5/5);
System.out.println(Overall5 + " coconuts remain, each gets " +SplitUp + " and 5 for the Monkey");
      }
}