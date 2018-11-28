//Zoe Lavoie
import java.util.*;
public class SuperDie
{
  int random; 
  int value;
  int numrolls;
  
  public int SixSide () 
  {
      random=(int)(Math.random()*6+1);
      return random;
  }
  
  public int NsidedDie (int nums)
  {
      value=(int)(Math.random()*nums+1);
      return value;
  }
  
  public int ChangeSides (int faces)
  {
    return NsidedDie(faces);
  }
  
  
  public void RollDie (int choice) 
  {
    int numrolls=0;
     int input=2;
    Scanner scan = new Scanner(System.in);
    
    if (choice!=6)
    {
    while (input>0) 
    {
    DisplayNSided(choice);
    
    System.out.println("The number rolled is: "+NsidedDie (choice));
    System.out.println("Do you want to roll again? (0=no, any other positive number for yes)");
    input= scan.nextInt();
   
    numrolls++;
    System.out.println("you have rolled: "+ThrownDice(numrolls)+" times");
    }
    }
    
    if (choice==6)
    {
    while (input>0)
    {
   
      DisplaySixSided();
    System.out.println("The number rolled is: "+SixSide ());
    System.out.println("Do you want to roll again? (0=no, any other positive number for yes)");
    input= scan.nextInt();
   
    numrolls++;
    System.out.println("you have rolled: "+ThrownDice(numrolls)+" times");
    }
    }
  }
  
  public static int ThrownDice (int value)
  {
    return value;
  }

 public void DisplaySixSided ()
  {
    System.out.println("This die has six sides.");
  }
  
  public void DisplayNSided (int nums)
  {
    System.out.println("This die has "+nums+" sided die");
  }
}
    