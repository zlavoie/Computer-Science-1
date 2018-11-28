// Zoe Lavoie
//Hanoi4

import java.util.*;

public class Hanoi4
{
 public static void main(String[] args)
      {
   int answer=0;
   
   Scanner scan = new Scanner(System.in);
   
   do
   {
     
    System.out.println("Enter number of disks: ");
      int disk=scan.nextInt();
      
       int extra=2;
      int extra2=3;
      int target=4;
      int source=1;
      
      if (disk<=3)
      {
        source=1;
        target=3;
        extra=2;
        move(disk, source, target, extra);
      }
      else 
      {
      move2(disk,source,target,extra,extra2);
      }
      System.out.println("Again? Enter 1 for Yes, any other number for No: ");
      answer=scan.nextInt();
   }
   while(answer==1);
   System.out.println("Bye!");
 }
  
  public static void move(int disks, int source,int target,int extra)
{
  if (disks==1)
  {
    System.out.println(source+" ----> "+target);
  }
  else
  {
    move(disks-1,source, extra, target); 
     System.out.println(source+" ----> "+target);
    move(disks-1, extra, target, source);
}
  }
  
  public static void move2(int disk, int source, int target, int extra, int extra2)
  {
             if (disk==1)
    {
  System.out.println(source+" ----> "+target);
    }
    else if (disk==2)
    {
      System.out.println(source+" ----> "+extra2);
      System.out.println(source+" ----> "+target);
      System.out.println(extra2+" ----> "+source);
    }
    else
    {
      move2(disk-2,source,extra, extra2,target);
      System.out.println(source+" ----> "+extra2);
      System.out.println(source+" ----> "+target);
      System.out.println(extra2+" ----> "+target);
      move2(disk-2,extra, target, extra2, source);
    }
  }
   
   
}