//Zoe Lavoie
import java.util.*; 

public class MagicSquare 
{
    public static void main(String[] args) 
    { 
      int num =0;
int nums = Info(num);
int [] [] arrays=MakeArray(nums);
PrintArray(arrays, nums);
                }
                
    public static int Info(int num)
    {
      Scanner scan = new Scanner(System.in);
      
      System.out.println("What is the (n) size of your magic square?: "); //Get User Input
      num = scan.nextInt();
      do 
      {
      if(num%2==0)
      {
        System.out.println("Please enter an odd number.");
         num = scan.nextInt();
      }
      }
      while(num%2==0);
      
      return num;
    }
    
    public static int [][] MakeArray(int nums)
    {
            int row;
            int col;
            int dimension;
       int array[][]=new int[nums][nums]; //Initialize array
            
            for(row=0;row<nums;row++)
                {
                    for(col=0;col<nums;col++)
                        {
                      array[row][col] = 0;
                        }
                }
 
                row=0; 
                col = nums/2;
                dimension = 1;
               
                while(dimension<=(nums*nums))
                {
                    array[row][col] = dimension++;
                    row--; // Move up
                    col++; // Move right
 
                    if(row<0 && col>nums-1) 
                    {
                        row = row+2;
                        col--;
                    }
 
                    if(row<0) // Out of Bounds Row
                    {
                      row= nums-1;
                    }
               
                    if(col>nums-1) // Out of Bounds Col
                    {  
                      col = 0;
                    }
 
                    if(array[row][col]>0) // Cell Filled?
                    {
                        row = row+2;
                        col--;
                    }
                }
           return array;       
    }
    
    public static void PrintArray (int [][] arrays, int nums)
    {
      
     System.out.println("Magic Square "+nums+"x"+nums+" is:");
            for(int row=0;row<nums;row++)
                {
                    for(int col=0;col<nums;col++)
                        {
                      System.out.print(arrays[row][col]+ "\t");
                        }
                 System.out.println();
                }        
    }
    
}
            