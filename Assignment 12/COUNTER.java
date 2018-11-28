//Zoe Lavoie

public class COUNTER
{
  int counter;
  
  public int IncrementOne() //adds one to the counter
  {
    this.counter++;
    return this.counter;
  }

  public void ValueZero()//sets the counter back to 0
  {
    this.counter=0;
  }
 
  public void DisplayValue() //shows the value of the counter
  {
    System.out.println(this.counter);
  }
  
  public void newCounterSetZero() //new counter starting from 0
  {
    this.counter=0;
  }
  public void DefaultCounter(int N) //new counter starting from N
  {
    this.counter=N;
  }
  
}

  