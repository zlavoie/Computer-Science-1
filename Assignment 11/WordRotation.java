import java.util.*;

public class WordRotation
{
 public static void main(String[] args)
      { 
   int  numSwitch;
   
     Scanner scan = new Scanner(System.in);
   System.out.println("Enter number of rotations: ");
   numSwitch = scan.nextInt(); 
   System.out.println();
    System.out.println("Please enter the String you want to scramble: ");
    System.out.println("Note: press 'ctrl-d' to end entries");
   
    int i=0;
   String [] line = new String [10];
    while(scan.hasNext())
   {
  line [i]=scan.next();
  i++;
   }
    
       String [] newline = new String [i];
    
       for(int y=0;y<i;y++)
       {
         newline[y]=line[y];
       }
   
   System.out.println("Original: ");
   for(int x=0;x<i;x++)
   {
     System.out.print(line[x]+ " ");
   }
   System.out.println();
   
    System.out.println("Scramble: ");
  
String [] Scrambline = scrambles(newline, numSwitch);
 
for(int a=0;a<i;a++)
   {
     System.out.print(Scrambline[a]+ " ");
   } 
 }

 public static String [] scrambles(String [] newline, int numSwitch)
{
    for(int i = 0; i<numSwitch; i++)
    {
      for(int j = newline.length-1; j>0; j--)
      {
               String temp = newline[j];
               newline[j] = newline[j-1];
               newline[j-1] = temp;
}
    }
    return newline;
 }
}