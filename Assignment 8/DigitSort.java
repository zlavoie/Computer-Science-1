import java.util.*;

public class DigitSort
{
public static void main(String[] args)
{
   int[] array = {1234, 0003, 9876, 3321, 6719};
   int size = array.length;
   
int [] newarray=sortByDigit(array,size);
displayArray(newarray, size);
}

public static int [] sortByDigit(int [] array, int size)
{
 int temp;
    int index;
    for (int endPos=1; endPos<size-1; endPos++)
    {
        temp=array[endPos];
        index=endPos;
   while ((index>0)&&((array[index-1]%10)>(temp%10)))
    {
      array[index]=array[index-1];
        index--;
      }
   if((array[index-1]%10)==(temp%10)&&(index>0))
        {
     if((array[index-1]%100)>(temp%100))
     {
          array[index]=array[index-1];
        index--;
     }
        }
    array[index]=temp;
   }
    return array;
}


public static void displayArray(int [] newarray, int size)
{
  for(int i=0; i < newarray.length; i++){
                        System.out.print(newarray[i] + " ");
}
}
}