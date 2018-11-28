//Zoe Lavoie

public class Shuffle1
{
  public static void main(String[] args) 
  {
    //Declare Arrays of suits, ranks, and deck9
    int count=0;
    boolean truth = false;
    int[] Deck1 = new int[26];
  int[] Deck2 = new int[26];
    int[] deck = new int[52];
    int[] originaldeck = new int[52];
    int[] newdecks = new int[52];
    //String[] suits = {"Diamonds", "Hearts", "Spades", "Clubs"};
    //String[] numbers = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

Initialize(deck);
originaldeck = deck;

while(truth==false)
{
 
  
Shuffle(deck,Deck1, Deck2, newdecks);
booleans(originaldeck, newdecks, truth);
/*System.out.println(" deck: ");
for (int y=0;y<52;y++)
{
  System.out.print(deck[y]+" ");
}
  System.out.println(" ");
  
   System.out.println("newdeck: ");
for (int z=0;z<52;z++)
{
  System.out.print(newdecks[z]+" ");
}

  System.out.println(" ");
   System.out.println(" ");
   */
   for(int y=0; y<52;y++)
   {
deck[y]=newdecks[y];
   }
   count=count+1;
}

System.out.println("For shuffle 1 it takes "+count+" shuffles to restore the deck.");
  }


  public static int [] Initialize(int [] deck) //Initializes deck
  {
    int x=0;
        for (int y = 1; y < 53; y++) 
    {
      deck[x] = y;
      x++;
    }
        return deck;
  }
                              
  
public static void DisplayCards(String [] suits, String [] numbers, int [] deck) //Prints Cards
{
 for (int index = 0; index < 52; index++) 
    {
      String suit = suits[deck[index] / 13];
      String number = numbers[deck[index] % 13];
      System.out.println( number + " of " + suit);
    }
}

public static int [] Shuffle(int [] deck, int [] Deck1, int [] Deck2, int [] newdecks)
{
   for (int i = 0; i <26; i++) //Splits deck into two
   {
     Deck1[i] = deck[i];
   }
     
 
    int p =0;
         for (int y =26; y<52;y++)
   {
      Deck2[p] = deck[y];
     p++;
     }
  
         //shuffle deck
   for (int x=0; x<Deck1.length;x++)
   {
     newdecks[x*2]=Deck1[x];
     newdecks[(x*2)+1]=Deck2[x];
   }
      return newdecks;
}

public static boolean booleans (int [] originaldeck, int newdecks [], boolean truth)
{
  if (originaldeck==newdecks)
  {
   truth = true;
   return truth;
  }
  else
  {
    truth=false;
  }
return truth;
}
   }

   
   

