import java.util.*;

public class WarmUp7
{
  
  public static void main(String[] args)
  {
    int num=0;
    int [] array = new int [100];
    
    DisplayArray(num, array);
  }
  
  public static void DisplayArray(int num, int [] array)
  {
     for(num= 0; num<  array.length; num++) 
     {
            array[num] = (int)(Math.random() * 100);
            System.out.print(array[num] + "  ");
  }
  }
}
    
    