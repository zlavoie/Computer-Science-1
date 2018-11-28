//Zoe Lavoie
 
public class RecursiveInsertionSort
{ 
  public static void main (String[] args) 
  {
    
    int []array={95, 80, 99, 79, 77};
    int endPos=array.length-1;
    int index = 0;
insertionSort(array, index, endPos);
for(int x=0;x<array.length;x++)
{
    System.out.print(array[x]+", ");
    }
  }
  
  public static void insertionSort(int[] array, int index, int endPos) 
  {
    if (array [index]>array[endPos])
    {
      int temp = array[index];
     array [index]=array[endPos];
      array[endPos]=temp;
      insertionSort(array, index, endPos);
    }
    else if (array[index] < array[endPos]) 
    {
      insertionSort(array, index, endPos-1);
      insertion(array[endPos],array, index, endPos-1); 
    }
  }
  
   public static int [] insertion(int temp, int [] array, int index, int endPos) 
   {
     if (temp>=array[endPos])
     {
       array[endPos+1]=temp;
     }
     else if (index<endPos)
     {
       array[endPos+1]=array[endPos];
       insertion(temp, array, index, endPos-1);
     }
     else
     {
       array[endPos+1] = array[endPos];
       array[endPos]=temp;
     }
     return array;
   }
       
}