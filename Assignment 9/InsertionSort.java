//Zoe Lavoie
 
import java.util.*; 
 
public class InsertionSort
{ 
  public static void main (String[] args) 
  {
    int []array={95, 80, 99, 79, 77};
        int temp=0;
    int endPos=array.length;
    int index=endPos-1;
    int [] array2=insertionSoft(array, index, temp, endPos);
    arrayPrint(array2);
     
  }
  public static int [] insertionSoft (int[]array, int index, int temp, int endPos) 
  {
    if(endPos<array.length)
    {
        temp=array[endPos];
        index=endPos;
        insertionSoft(array, index, temp, endPos++);
    }
   
    while ((index>0)&&(array[index-1]>temp))
    {
      array[index]=array[index-1];
        index--;
      }
    array[index]=temp;
    
    return array;
  }
        
  public static void arrayPrint(int[]array2)
  {
for(int x=0;x<array2.length;x++)
{
    System.out.print(array2[x]+", ");
    
    }
  } 
}