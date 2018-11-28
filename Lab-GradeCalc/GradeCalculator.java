
public class GradeCalculator
{ 
  public static void main (String[] args)
  {
    int [] [] board = new int [5][4];
    initializeboard(board);
    AverageStudent(board);
    System.out.println();
    AverageTest(board);
    System.out.println();
    HighScore(board);
  } 
  
  public static int[][] initializeboard(int [][] board)
  {
    board[0][0]=80;
    board[0][1]=90;
          board[0][2]=100;
          board[0][3]=100;
          board[1][0]=70;
          board[1][1]=80;
          board[1][2]=90;
          board[1][3]=90;
          board[2][0]=60;
          board[2][1]=70;
          board[2][2]=80;
          board[2][3]=80;
          board[3][0]=100;
          board[3][1]=100;
          board[3][2]=90;
          board[3][3]=80;
          board[4][0]=90;
          board[4][1]=90;
          board[4][2]=80;
          board[4][3]=70;
          return board;
          }
           
public static void AverageStudent(int [][]board)
{
  System.out.println("Average for Each Student: ");
  int grades=0;
  for (int row=0;row<5;row++)
  {
    for (int col=0;col<4;col++)
    {
      grades=grades+board[row][col];
    }
    int avg=grades/4;
    System.out.println("row"+row+": "+avg);
    grades=0;
  }
}

public static void AverageTest(int [][]board)
{
  System.out.println("Average for Each Test: ");
  int grades=0;
  for (int col=0;col<4;col++)
  {
    for (int row=0;row<5;row++)
    {
      grades=grades+board[row][col];
    }
    int avg=grades/5;
    System.out.println("col"+col+": "+avg);
    grades=0;
  }
}

public static void HighScore(int [][]board)
{
  System.out.println("High Score for Each Test: ");
  int hscore=0;
  for (int col=0;col<4;col++)
  {
    for (int row=0;row<5;row++)
    {
      if(board[row][col]>hscore)
      {
        int temp=board[row][col];
        hscore=temp;
      }
    }
    System.out.println("col"+col+": "+hscore);
  }
}

}