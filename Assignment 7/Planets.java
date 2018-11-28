import java.util.*;

public class Planets
{
  public static void main(String[] args)
  {
    int Choice=0;
    do
    {
  Choice=Case4();
    System.out.println("Choice: "+Choice);
      double [] data = new double[9];
    
      data[0]=.39;
     data[1]=.91;
      data[2]=1.00;
     data[3]=.38;
     data[4]=2.87;
     data[5]=1.32;
     data[6]=.93;
     data[7]=1.23;
     data[8]=0.03;
     
     String[ ] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"};
        
    if (Choice==1)  
    {
      Case1(data);
    }
    else if (Choice==2)
    {
      Case2(data);
    }
    else if (Choice==3)
    {
      Case3(data, planets);
  }
   else if (Choice==4)
    {
      Case4();
    }
    
    }
    while((Choice==1)||(Choice==2)||(Choice==3)||(Choice==4));
      System.out.println("Bye!");
  }
  
  public static void Case1(double [] data)
    {
    Scanner scan = new Scanner(System.in);
      System.out.println("Enter your weight on Earth, in pounds: ");
      int weight=scan.nextInt();
      System.out.println("Enter the code number of the planet you want : ");
      int code=scan.nextInt();
      System.out.println("Your weight on Jupiter is "+(data[code]*weight)+" pounds.");
    }
    
    public static void Case2(double [] data)
    {
    for (int x=0; x<9;x++)
    {
      System.out.println("Your weight for the planet: "+x+"is: "); 
      for (int y=0; y<9;y++)
      {
      System.out.print(data[x]+" pounds.");
      }
    }
    }
    
     public static void Case3(double [] data, String [] planets)
    {
  System.out.println("The planets and gravity factors are: ");
  for(int x=0;x<9;x++)
  {
    System.out.println(x+"            "+planets[x]+"           "+data[x]);
  }
  }
     
     public static int Case4()
     {
     Scanner scan = new Scanner(System.in);
    System.out.println("Welcome to the Planet Calculator!");
    System.out.println("Enter 1 to find your weight on a given planet.");
    System.out.println("Enter 2 to see your weight on all planets.");
    System.out.println("Enter 3 to display  all planets and gravity factors,");
    System.out.println("Enter 4 to show this menu at any time.");
    System.out.println("Enter any other number to exit.");
    
    int choice = scan.nextInt();
    return choice;
     }
     
}