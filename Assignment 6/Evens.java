//Zoe Lavoie
//Evens

import java.util.*;
public class Evens
{
public static void main (String[] args)
{
int num = 0;
        Scanner input = new Scanner(System.in);
         System.out.println("Enter a positive integer or 0 to end: ");
         int n = input.nextInt();

         while (n != 0)
        {
               System.out.print("The number of even integers between 0 and " + n + " is: ");

              evens(n, num);
              
               System.out.println("Enter a positive integer or 0 to end: ");
                n = input.nextInt();

           } 
         System.out.println("Bye");
}

public static int evens (int n, int num) 
{

  if((n>0)||(n==0))
  {
  if ((n%2)==0)
  {
    System.out.print(n+", ");
    num=(num+1);
    evens((n-1), num);
  }
  else
  {
    //System.out.println("THIS IS NUM:"+num);
    evens((n-1), num);
  }
  }
  else
  {

    System.out.print("... "+ num);
    System.out.println();
}
  return num;
}

} 