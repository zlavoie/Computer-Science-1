//By Zoe Lavoie
//Hw RightTriangle
import java.util.*;

public class RightTriangle
{
  public static void main (String[]args)
  {
    int a;
    int b;
  Scanner scan = new Scanner(System.in);
  System.out.println("What integer would you like to use to form the triangle?"); 
    int n= scan.nextInt();
    
    for(a=1;a<=n;a++)
{
    for (b=0; b<a; b++)
    {
        System.out.print("*");
    }
    System.out.println();
}
  }
}