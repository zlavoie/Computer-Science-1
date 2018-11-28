import java.util.*;

public class Sequence
{
public static void main(String[] args)
{  
    int array[] = new int [100];
  int list=0;
  Scanner scan = new Scanner(System.in);
  System.out.println("Enter numbers end with -999: ");
   
  for(int k=0;k<100;k++)
   {
  list=scan.nextInt();
  array[k] = list;
   }
            int n = array.length;
            System.out.println("Length of longest increasing subsequence is " + (seq( array, n )-1));
    }

    public static int seq(int array[],int n)
    {
          int array2[] = new int[n];
          int a=0;
           int b=0;
            int max = 0;
 
           for ( a = 1; a < n; a++ )
           {
              for ( b = 0; b < a; b++ )
              {
                 if ( array[a] > array[b] && array2[a] <array2[b] + 1)
                 {
                    array2[a] = array2[b] + 1;
                 }
              }
           }
           for ( a = 0; a< n; a++ )
           {
              if ( max < array2[a] )
           {
                 max = array2[a];
           }
           }
           for(int r=0; r<max;r++)
           {
           System.out.print(array2[r]+", ");
           }
            return max;
           }
}