import java.util.*;

public class Randomize
{
  
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("----- Welcome to the Randomizer -----");
    System.out.println("To display a list of random numbers between 0 and N enter an N: ");
    int num = scan.nextInt();
    
    
    int [] array = new int [num+1];
    
    for (int x=0;x<array.length; x++)
    {
      array[x] = (int)(1+(Math.random() *num));
    }
    
    DisplayArray(num, array);
  }
  
  public static void DisplayArray(int num, int [] array)
  {
    for(int endPos = array.length; endPos> 0; endPos--) 
    {
      for(int index=0;index<endPos;index++)
      {
        if (array[index]==array[index+1])
        {  
          do
          {
            array[index] = (int)(1+(Math.random() * num));
          }
          while(array[index]!=array[index+1]);
        }
        System.out.println(array[index]);
      }
    }
  }
}