
public class Sudoku
{ 
  public static void main (String[] args)
  { //hard coded solution, change numbers to check if it works when wrong
int[][] solution =   {{4,2,9,8,1,3,5,6,7},
{5,1,6,4,7,2,9,3,8},
{7,8,3,6,5,9,2,4,1},
{6,7,2,1,3,4,8,5,9},
{3,9,5,2,8,6,1,7,4},
{8,4,1,7,9,5,6,2,3},
{1,5,8,3,6,7,4,9,2},
{9,3,4,5,2,8,7,1,6},
{2,6,7,9,4,1,3,8,5}};

if((CorrectRow(solution)&&CorrectCol(solution)&&CheckSmallerBoxes(solution))==true)
{
    System.out.println("Correct Solution!");
}
   else
   {
    System.out.println("The Solution Is Not Correct...");
   System.out.println();
  }
 }
 
 public static boolean CorrectRow(int[][] solution)
 {
  for(int row = 0; row < 9; row++)
  {
   if(Rows(solution, row)==false)
   {
    return false;
   }
  }
     return true;
  }
  
  public static boolean CorrectCol(int[][] solution)
  {
  for(int col = 0; col < 9; col++)
  {
   if(Col(solution,col)==false)
   {
    return false;
   }
  }
  return true;
}
  
public static boolean CheckSmallerBoxes(int[][] solution)
{
  for(int row = 0; row < 9; row = row+3)
  {
   for(int col = 0; col < 9; col = col+3)
   {
    if (Box(solution,row,col)==false)
    {
     return false;
    }
   }
  }
  return true;
 }
 
 public static boolean Rows(int[][] solution, int row)
 {
  int [] UsedNum = new int [10];
  
  for(int x = 0; x < 10; x++)
  {
    UsedNum[x]=0;
  }
  
  for(int col = 0; col < 9; col++)
  {

   if (UsedNum[solution[row][col]]==2) //Can't have the same number twice
   {
    return false;
   }
   else
   {
   UsedNum[solution[row][col]] = UsedNum[solution[row][col]]+1;
   }
  }
  return true;
 }
 
 public static boolean Col(int[][] solution, int col)
 {
  int [] UsedNum = new int[10];
  
   for(int x = 0; x < 10; x++)
  {
    UsedNum[x]=0;
  }
  
  for(int row = 0; row < 9; row++)
  {
   if (UsedNum[solution[row][col]]==2) //Can't have the same number twice
   {
    return false;
   }
   UsedNum[solution[row][col]] = UsedNum[solution[row][col]]+1;
  }
  return true;
 }
 
 public static boolean Box(int[][] solution, int row, int col)
 {
  int [] UsedNum = new int [10];
  
   for(int x = 0; x < 10; x++)
  {
    UsedNum[x]=0;
  }
  
  for(int a = row; a< row+3; a++) // Looks at the smaller squares of the sudoku
  {
   for(int b = col; b< col+3; b++) 
   {    
    if (UsedNum[solution[a][b]]==2) //Can't have the same number twice
    {
     return false;
    }
    UsedNum[solution[row][col]] = UsedNum[solution[row][col]]+1;
   }
  }
  return true;
 }
 
}