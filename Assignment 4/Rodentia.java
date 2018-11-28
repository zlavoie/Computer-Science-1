//By Zoe Lavoie
//Rodentia

import java.util.*;

public class Rodentia
{
  public static void main(String[] args)
  {       
    int face=0;
    int num=10;
    int bet=0;
    
    do
    {
      bet=getBet(num, bet);
      if (bet==0)
      {
        Exit(num);
      }
      else
      {
        int digit=rollDie(face);
        System.out.print("Rolling dice-> D1: ");
        faceToScreen(digit);
        int die1=digit;
        
        digit=rollDie(face);
        System.out.print(" D2: ");
        faceToScreen(digit);
        int die2=digit;
        
        digit=rollDie(face);
        System.out.print(" D3: ");
        faceToScreen(digit);
        System.out.println();
        int die3=digit;
        
        num=computeNutPayout(die1, die2, die3, bet, num);
        if(num==0)
        {
          Exit(num);
        }
      }
    }
    while(((bet>=1)||(num!=0))&&(num>0));
  }
  
  public static int rollDie(int face) //rolls a six sided die
  {
    face =(int)((Math.random()*6)+1);
    return face;
  }
  
  public static void faceToScreen(int digit)
  {
    if(digit==1)
    {
      System.out.print("Mercury");
    }
    else if(digit==2)
    {
      System.out.print("Venus");
    }
    else if(digit==3)
    {
      System.out.print("Earth");
    }
    else if(digit==4)
    {
      System.out.print("Mars");
    }
    else if(digit==5)
    {
      System.out.print("Jupiter");
    }
    else if(digit==6)
    {
      System.out.print("Sun");
    }
  }
  
  
  public static int getBet(int num, int bet) //- prompts the squirrel for the bet, then returns the number of nuts the squirrel wants to bet
  {
    Scanner scan = new Scanner(System.in);
    System.out.println();
    System.out.println("Welcome squirrel!  You have "+num+" nuts.  How many would you like to throw up in the air (0 to quit)?");
    bet=scan.nextInt();
    //System.out.println(bet);
    return bet;
  }
  
  
  public static int computeNutPayout(int die1, int die2, int die3, int bet, int num) // given the face values for the dice and the bet, return the payout to the squirrel
  {
    //System.out.println(die1+" "+die2+" "+die3+" "+num+" "+bet);
    if((die1==6)&&(die2==6)&&(die3==6))
    {
      num=num+128;
      System.out.println("Congratulations! You won 128 nuts!");
    }
    else if((die1==5)&&(die2==6)&&((die3==5)||(die3==6)))
    {
      num=num+64;
      System.out.println("Congratulations! You won 64 nuts!");
    }
    else if((die1==4)&&(die2==4)&&((die3==4)||(die3==6)))
    {
      num=num+32;
      System.out.println("Congratulations! You won 32 nuts!");
    }
    else if((die1==3)&&(die2==3)&&((die3==3)||(die3==6)))
    {
      num=num+16;
      System.out.println("Congratulations! You won 16 nuts!");
    }
    else if((die1==1)&&(die2==1)&&(die3==1))
    {
      num=num+8;
      System.out.println("Congratulations! You won 8 nuts!");
    }
    else if((die1==1)&&(die2==1)&&((die3<7)&&(die3>0)))
    {
      num=num+4;
      System.out.println("Congratulations! You won 4 nuts!");
    }
    else if((die1==1)&&((die2>0)&&(die2<7))&&((die3<7)&&(die3>0)))
    {
      num=num+2;
      System.out.println("Congratulations! You won 2 nuts!");
    }
    else
    {
      num=num-bet;
      System.out.println("Sorry Squirrel! You Lost!");
    }
    return num;
  }
  
  public static void Exit(int num)
  {
    System.out.println("Bye squirrel! You started with 10 nuts and you ended with "+num+" nuts. Caw! Caw!");
  }
  
  
}