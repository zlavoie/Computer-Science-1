//Zoe Lavoie

import java.math.*;
import java.util.*;

public class counterExample 
{
  public static void main(String[] args) 
  {
    COUNTER r= new COUNTER();
   
    Scanner scan = new Scanner(System.in);
    
    int [] array= new int [50];
    int num=1;
    int a=0;
    
      while (num!=0)
       {
        num=scan.nextInt();
        array[a]=num;
        a++;
       }
      for (a=0;a<array.length;a++)
      {
        if (array[a]!=0)
        {
           r.IncrementOne();
        }
      }
       r.DisplayValue();
  }
}

    
      
  