import java.util.*;

public class PokerHand
{
 public static void main(String[] args)
      { 
     int num=0;
   for(int z=0;z<1000000;z++)
  {  
       int n=5;
int [] deck=getDeck();
 shuffle(deck);
 int [] card = GetHand(deck, n);
int [] counter=PrintFace(card, n);
num = FullHouse(counter, z);
 }
   System.out.println("Probability of Full House: "+(num/1000000));
  System.out.println("Bye!");
 }
 
public static int [] getDeck()
{
  int [] deck = new int [52];
  for(int i=0;i<52;i++)
  {
    deck[i]=i;
  }
  return deck;
}

public static int [] GetHand(int [] deck, int n)
{
  int [] hand = new int [n];
  shuffle(deck);
  for(int i=0; i<n; i++)
  {
    hand[i]=deck[i];
  }
  return hand;
}

public static void shuffle(int [] deck)
{
  for (int i=0; i<deck.length;i++)
  {
    int rand=(int)(Math.random()*52);
    int temp=deck[i];
    deck [i]=deck[rand];
    deck[rand]=temp;
  }
}

public static int [] PrintFace(int [] card, int n)
{
  int [] count = new int [13];
  for(int x=0;x<n;x++)
  {
  int face=((card[x]%13)+2);
  switch(face)
  {
    case 0:
      //System.out.print("2 of ");
      count[0]=count[0]+1;
      //PrintSuit(card, n, x);
     // System.out.println(" ");
     break;
    case 1:
      //System.out.print("3 of ");
      count[1]=count[1]+1;
     // PrintSuit(card, n, x);
     // System.out.println(" ");
      break;
    case 2:
     // System.out.print("4 of ");
      count[2]=count[2]+1;
     // PrintSuit(card, n, x);
      //System.out.println(" ");
      break;
    case 3:
      //System.out.print("5 of ");
      count[3]=count[3]+1;
      //PrintSuit(card, n, x);
      //System.out.println(" ");
      break;
    case 4:
      //System.out.print("6 of ");
      count[4]=count[4]+1;
     // PrintSuit(card, n, x);
     // System.out.println(" ");
      break;
    case 5:
      //System.out.print("7 of ");
      count[5]=count[5]+1;
     // PrintSuit(card, n, x);
     // System.out.println(" ");
      break;
    case 6:
     // System.out.print("8 of ");
      count[6]=count[6]+1;
    //  PrintSuit(card, n, x);
     // System.out.println(" ");
      break;
    case 7:
     // System.out.print("9 of ");
      count[7]=count[7]+1;
      //PrintSuit(card, n, x);
      //System.out.println(" ");
    break;
    case 8:
     // System.out.print("10 of ");
      count[8]=count[8]+1;
     // PrintSuit(card, n, x);
      //System.out.println(" ");
      break;
    case 9:
      //System.out.print("Jack of ");
      count[9]=count[9]+1;
     // PrintSuit(card, n, x);
      //System.out.println(" ");
      break;
    case 10:
     // System.out.print("Queen of ");
      count[10]=count[10]+1;
      //PrintSuit(card, n, x);
     // System.out.println(" ");
      break;
    case 11:
      //System.out.print("King of ");
      count[11]=count[11]+1;
     // PrintSuit(card, n, x);
     // System.out.println(" ");
      break;
    case 12:
      //System.out.print("Ace of ");
      count[12]=count[12]+1;
      //PrintSuit(card, n, x);
      //System.out.println(" ");
      break;
  }
  }
  return count;
}
      
public static void PrintSuit(int [] card, int n, int x)
{
  int suit=card[x]/13;
  switch(suit)
  {
  case 0:
    System.out.print("Spades");
    break;
    
  case 1:
    System.out.print("Clubs");
    break;
    
  case 2:
    System.out.print("Hearts");
    break;
    
  case 3:
    System.out.print("Diamonds");
    break; 
  }
}

public static int FullHouse(int [] counter, int z)
{
  int count=0;
for  (int a=0; a<13;a++)
  {
  for(int b=0;b<13;b++)
  {
    if((counter[a]==3)&&(counter[b]==2))
    {
      count=count+1;
    }
  }
}
return count;
}

}