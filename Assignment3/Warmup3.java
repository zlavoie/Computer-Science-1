//By Zoe Lavoie
//Hw Warmup for Assignment3

public class Warmup3
{
  public static void main (String[]args)
  {
    int degreeC;
    System.out.println("Celcius: ");
   for (degreeC=0;degreeC<101;degreeC++)
   {
     System.out.println(degreeC);
   }
   double degreeF;
   System.out.println();
   System.out.println("Fahrenheit: ");
     for (degreeC=0;degreeC<101;degreeC++)
     {
       degreeF=((degreeC*(1.8))+32);
     System.out.println(degreeF);  
   }
  }
}