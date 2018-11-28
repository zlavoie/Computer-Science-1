import java.util.*;

public class CoinFlips
{
  public static void main (String[]args)
  {
  
 int digit = 100000;
 int num;
 int best;
 best=0;
 int total=0;
 
  int [] array = new int [9];
 
 for (num=1; num<=digit;num++)
 {
  int x = (int)(Math.random()+.5);
   
  if (x==0)
 {
     System.out.print("H");
   best=best+1;
   total=total+1;
 }
 else if (x==1)
 {
   System.out.print("T");
   
   if (best==1)
   {
     array[0]=array[0]+1;
   }
   else if (best==2)
   {
     array[1]=array[1]+1;
   }
   else if (best==3)
   {
     array[2]=array[2]+1;
   }
   else if(best==4)
   {
     array[3]=array[3]+1;
   }
   else if (best==5)
   {
     array[4]=array[4]+1;
   }
   else if (best==6)
   {
     array[5]=array[5]+1;
   }
   else if (best==7)
   {
     array[6]=array[6]+1;
   }
   else if (best==8)
   {
     array[7]=array[7]+1;
   }
   best=0;
 }
  }
   System.out.println("");

    System.out.println(1+"          "+array[0]);
    System.out.println(2+"          "+array[1]);
    System.out.println(3+"          "+array[2]);
    System.out.println(4+"          "+array[3]);
    System.out.println(5+"          "+array[4]);
    System.out.println(6+"          "+array[5]);
    System.out.println(7+"          "+array[6]);
    System.out.println(8+"          "+array[7]);
}
}

 