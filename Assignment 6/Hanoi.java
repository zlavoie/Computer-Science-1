//Zoe Lavoie
//Warmup

import java.util.*;

public class Hanoi
{
public static void main(String[] args)
{
   Scanner scan = new Scanner(System.in);
   System.out.println("Enter number of disks:");

   int disks = scan.nextInt();
 int source=1;
 int target=3;
 int extra=2;
 int numberMoves=0;
 
   numberMoves = move(disks, source, target, extra, numberMoves);
    System.out.println("Number of moves is: "+numberMoves);
  
}

public static int move(int disks, int source,int target,int extra, int numberMoves)
{
 //System.out.println(disks+"!"); 
  if (disks==1)
  {
    numberMoves++;
    System.out.println("D"+source+": "+source+" -->"+target);
   // System.out.println(num+"!");
  }
  else
  {
    //System.out.println(num);
    move(disks-1,source, extra, target, numberMoves); 
numberMoves++;
     System.out.println("D"+disks+": "+source+" -->"+target);
  //  System.out.println(num);
    move(disks-1, extra, target, source, numberMoves);

     //System.out.println(num);
   
}

  return numberMoves;
}
}