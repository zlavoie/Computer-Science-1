import java.util.*; 
 
public class MovingDay
{ 
    public static void main (String[] args)
{
      System.out.println("---- MovingDay Game ----");
   
      final int rows=7;
    char [] board= new char[rows];
    
    InitializeBoard(board);
    DisplayBoard(board);
    
    while ((Win(board)!=true))
    {
    doPlayer(board);
    }
}

  public static void InitializeBoard(char [] board) // creates board
  {
  for (int row=0;row<3;row++) 
  {
  board[row]='T';
  }
  for (int row=4;row<7;row++) 
  {
  board[row]='F';
  }
  }
  
public static void DisplayBoard(char [] board) //displays the board
{
    System.out.println("  0  1  2  3  4  5  6 ");  
for (int row=0;row<board.length;row++)
{
System.out.print(" |"+(board[row]));
}
}

public static void doPlayer(char[] board)  //Updated Board
{
Move(board);
DisplayBoard(board);
}

public static void Move(char [] board) //allows you to make the move (you put the number you want to move in)
{
Scanner scan = new Scanner(System.in); 
System.out.println();
System.out.println("Choose move:");
int row=scan.nextInt();

AvailableMoveT(board,row);
AvailableMoveF(board,row);
}

public static void AvailableMoveT(char [] board,int row) //sees if you can realize a movement with T
{
if (board[row]=='T')
{
  if ((board[row+1]!='F')&&(board[row+1]!='T'))
  {
board[row]=' ';
board[row+1]='T';
  }
  else if ((board[row+2]!='F')&&(board[row+2]!='T'))
  {
  board[row]=' ';
  board[row+2]='T';
  }
  else
  {
  System.out.println("invalid Move true:");
  }
}
}

public static void AvailableMoveF(char [] board,int row) //sees if you can realize a movement with F
{
if (board[row]=='F')
{
  if ((board[row-1]!='T')&&(board[row-1]!='F'))
  {
board[row]=' ';
board[row-1]='F';
  }
  else if((board[row-2]!='F')&&(board[row-2]!='T'))
  {
  board[row]=' ';
board[row-2]='F';
  }
  else 
  {
  System.out.println("Invalid Move:");
  }
}
}

public static boolean Win(char []board) //win or loss
{
  if ((board[0]=='F')&&(board[1]=='F')&&(board[2]=='F')&&(board[4]=='T')&&(board[5]=='T')&&(board[6]=='T'))
  {
  System.out.println("You Win!");
  return true;
  }
  else if ((board[0]=='T')&&(board[6]=='T'))
  {
  System.out.println("You lost...");
  return true;
  }
  else if ((board[0]=='F')&&(board[6]=='F'))
  {
  System.out.println("You lost...");
  return true;
  }
  return false;
}

}