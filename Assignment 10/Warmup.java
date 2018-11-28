
public class Warmup
{ 
  public static void main (String[] args)
  {
    int [] [] board = new int [10][10];
    initializeboard(board);
  } 
  
  public static int[][] initializeboard(int [][] board) //Initializes 10x10 board filled with number corresponding to row number
  {
         for(int x=0; x<10;x++)
         {
           for(int y=0;y<10;y++)
           {
             board[x][y]=x;
             System.out.print(board[x][y]+" ");
           }
           System.out.println();
         }
          return board;
          }
           
}