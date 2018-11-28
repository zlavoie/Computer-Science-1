//Zoe Lavoie
//GcdAndLcm

import java.util.*;

public class GcdAndLcm
{
public static void main(String[] args)
{
  int a=0;
  int b=0;
  int LCM=0;
  int GCD=0;
  int Final=0;
  int response=0;
 
  do
  {
  Scanner scan = new Scanner(System.in);
  System.out.println("Enter two positive integers:");
  a = scan.nextInt();
  b = scan.nextInt(); 
  
  if(b>a)
{
 int temp=b;
 b=a;
 a=temp;
}
  int Great = gcd(a,b);
  System.out.println("The greatest common denomenator is: "+Great);
  int Low = lcm(a,b,Great, LCM);
    System.out.println("The lowest common multiple is: "+Low);
  
  Final = End(response);
  }
  while(Final!=2);
  System.out.println("Bye!");
}

public static int gcd (int a,int b) // returns the greatest common divisor of positive integers a and b  
{
 if (b==0)
 {
   return a;
 }
else 
       {
  return gcd(b, a%b);
}
}
  
public static int lcm (int a,int b,int Great, int LCM) // returns the least common multiple of positive integers  a and b
{
  LCM=((a*b)/Great);
  return LCM;
}

public static int End (int response) //Include a main method that tests these two methods.  The main method should include a loop so that a user can repeat the test.
{
  Scanner scan = new Scanner(System.in);
  System.out.println("");
  System.out.println("Do you want to play again? (Enter 1 for yes and 2 for no): ");
  response = scan.nextInt();
  
  return response;
}
}