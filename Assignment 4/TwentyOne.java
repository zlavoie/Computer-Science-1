//By Zoe Lavoie
//TwentyOne

import java.util.*;

public class TwentyOne
{
  
  public static void main(String[] args)
  {
    int wins=0;
    int losses=0;
    int dicenum=0;
    int current=0;
    int digit;
    int score=0;
    int roll=0;
    int response=0;
    
    do
    {
      do
      {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter 1 to roll 2 to quit: ");
        digit = scan.nextInt();
        
        if (digit==1)
        {
          dicenum =(int) ((Math.random()*6)+1);
          current=(current+dicenum);
          System.out.println("You rolled a "+dicenum+". Score is "+current);
        }
      }
      while((dicenum<=21)&&(digit==1));
      
      
      if(dicenum>21)
      {
        bust(dicenum, current);
      }
      
      if (digit==2)
      {
        quit(dicenum, current);
      }
      
      System.out.println("Computer rolls");
      CompScore(roll,score);
      
      if(score>=21)
      {
        System.out.println("Computer stops. Score is "+score);
      }
      if((current>score)&&(current<=21))
      {
        PlayerWin();
        wins=wins+1;
      }
      else if((current<score)&&(score>21))
      {
        PlayerWin();
        wins=wins+1;
      }
      else if((score>current)&&(score<=21))
      {
        CompWin();
        losses=losses+1;
      }
      else if((score<current)&&(current>21))
      {
        CompWin();
        losses=losses+1;
      }
      
      System.out.println("Play again? Enter 1 for yes and 2 for no: ");
      Scanner scan = new Scanner(System.in);
      response = scan.nextInt();
      
    }
    while(response==1);
    
    if (response==2)
    {
      System.out.println("Games Lost: "+losses);
      System.out.println("Games Won: "+wins);
    }
  }
  
  public static int CompScore(int roll,int score) //Calculates Computer Score
  {
    roll =(int)((Math.random()*6)+1);
    score=(score+roll);
    System.out.println("Computer rolls "+roll+". Score is "+score);
    if (score<21)
    {
      CompScore(roll,score);
    }
    return score;
  }
  
  public static int bust(int dicenum, int current) //Declares a bust on the player
  {
    System.out.println("You rolled a "+dicenum+". Score is "+current+". It's a bust!");
    return dicenum;
  }
  
  public static int quit(int dicenum,int current) // Player decides to quit, gives remaining score
  {
    System.out.println("Your score is "+current+".");
    System.out.println();
    return dicenum;
  }
  
  public static void PlayerWin() 
  {
    System.out.println();
    System.out.println("Player wins.");
  }
  
  public static void CompWin()
  {
    System.out.println();
    System.out.println("Computer wins.");
  }
}