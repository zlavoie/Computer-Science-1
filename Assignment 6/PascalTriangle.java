//Zoe Lavoie
//Pascal

import java.util.*;

public class PascalTriangle
{

     public static void main(String[] args) {
       int num = 9;
       show(num);
   }
  
 public static void show(int num)
    {
        for (int r = 0; r <= num; r++)
        {
            for (int e = 0; e < r; e++)
            {
                System.out.print(Pascal(r, e) + " ");
            }
            System.out.println("");
        }
    }
 
  public static int Pascal(int r, int e)
    {
        int first=0;
        int second=0;
        
        if ((r == 0) || (e == 0) || (r == e + 1))
        {
            return 1;
        }
        first = Pascal(r - 1, e - 1);
        second= Pascal(r - 1, e);
        return first +second;
    }
}