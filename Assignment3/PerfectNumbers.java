//By Zoe Lavoie
//Hw PerfectNumbers

public class PerfectNumbers
{
  public static void main (String[]args)
  {
  
  System.out.println("These numbers are perfect: ");
  {
    
  int num1;
     int x;
    int sum1;
  x=1;
  
 do
 {
      for (num1=2;x<num1;num1++)
    {
        sum1=0;
        for(x=1;x<num1;x++)
        {
        if  ((num1%x)==0)
  {
    sum1=sum1+x;
        }
      }
        
        if ((sum1==num1))
  {
   System.out.println(num1); 
    }
 }
 }
  while (num1<10001);
  }
}
}
