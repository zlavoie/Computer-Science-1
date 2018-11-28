//Zoe Lavoie
//Monty

import java.util.*;

public class Monty
{
public static void main (String[] args)
{
  int winning=0;
 int choice=0;
 int other=0;
 int response=0;
 int Final=0;
 
do
{
         Welcome();
         int winningDoor=SetDoors(winning);

         int PickFirst=FirstPick(choice);
         
          int DoorOther=OtherDoor(winningDoor, other, PickFirst);

        int Changes=Change(PickFirst, DoorOther);
         Final=End(PickFirst, winningDoor, DoorOther);
}
while ( Final!=2);
 System.out.println("Bye");
}
 


public static void Welcome () 
{
  System.out.println(" Hello, I am Monty Hall and welcome to 'Let's Make a Deal.' Here is our first contestant.");  
  System.out.println("Welcome to the show.  Now, in front of you are three doors.");
  System.out.println("Behind two of these doors is a goat but behind the third door is a shiny new Jaguar.");
  System.out.println("");
}

public static int SetDoors(int winning)
{
  winning = (int)((Math.random()*3)+1);
 // System.out.println(winning);
  return winning;
}

public static int OtherDoor (int winningDoor, int other, int PickFirst)
{
  other = (int)(( Math.random()*3)+1);
  if((other==winningDoor)||(other==PickFirst))
  {
  OtherDoor(winningDoor, other, PickFirst);
  }
  return other; 
}  

public static int FirstPick(int choice)
{
  Scanner input = new Scanner(System.in);
  System.out.println("You may choose one of the doors. Which will it be : 1, 2, or 3?");
  choice = input.nextInt();
   
   return choice;
}

public static int Change(int PickFirst, int DoorOther)
{
  Scanner input = new Scanner(System.in);
  System.out.println("OK , you choose door "+PickFirst+".  But before I show you what is behind door "+PickFirst+", ");
System.out.print("let's take a look behind door "+ DoorOther+".  Let's open door "+DoorOther+".  ");
System.out.print("That's right, behind door "+ DoorOther+" is a goat.");
System.out.println("");
System.out.println(" Now do you want to keep door "+PickFirst+" or switch to door "+DoorOther+"?");
int changer=input.nextInt();

if (changer==PickFirst)
{
System.out.println("You are keeping door "+PickFirst+".  Let's open door "+PickFirst+" and see what is there.");
}
else
{
System.out.println("You are changing to door "+changer+".  Let's open door "+changer+" and see what is there.");
}
PickFirst=changer;
return PickFirst;
}

public static int End(int Changes, int winningDoor, int DoorOther)
{
  Scanner input = new Scanner(System.in);
  if (winningDoor==Changes)
  {
  System.out.println("Congratulations! You won a new car!");
  }
  else
  {
    System.out.println("Sorry, you got the goat.");
  }
System.out.println("Want to play again? (Press 1 for yes and 2 for no): ");
int response = input.nextInt();

return response;
}
}