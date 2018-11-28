//Zoe Lavoie

public class WarmUp
{
  public static void main(String[] args) 
  {
    //Declare Arrays of suits, ranks, and deck
    int[] deck = new int[52];
    String[] suits = {"Diamonds", "Hearts", "Spades", "Clubs"};
    String[] numbers = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

  
Initialize(deck);
DisplayCards(suits, numbers, deck);
  }


  public static int [] Initialize(int [] deck) //Initializes deck
  {
        for (int y = 0; y < 52; y++) 
    {
      deck[y] = y;
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

}