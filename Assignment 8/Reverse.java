import java.util.*;

public class Reverse
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter the size of the list you are entering: ");
    int total=scan.nextInt();
    System.out.println("Enter the elements of your list when prompted....");
    int [] num = new int[total];
    for (int i =0; i<total;i++)
    {
      System.out.println("Please enter number: ");
      num[i]=scan.nextInt();
    }
    int high=total-1;
    int low = 0;
    int [] newarray= reverse(num,low,high);
    DisplayArray(newarray, total);
  }
  
  public static int [] reverse(int[] num, int low, int high)
  {
    if(high==low)
    {
      return num;
    }
    else if((high-low)==1)//two elements
    {
      int temp=num[low];
      num[low]=num[high];
      num[high] = temp;
      return num;
    }
    //first and last elements swap
    int temp=num[low];
    num[low]=num[high];
    num[high] = temp;
    reverse(num, low+1, high-1);
    return num; 
  } 
  
  
  public static void DisplayArray(int[] newarray, int total)
  {
    System.out.println("Reversed Array: ");
    for (int y=0;y<total;y++)
    {
      System.out.print(newarray[y]+ ", ");
    }
  }
}
