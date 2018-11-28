import java.util.*; 
import java.io.*;

public class Unjumbler
{ 
public static void main(String[] args) throws FileNotFoundException 
{  
       File inFile = new File("6of12.txt");
    Scanner input = new Scanner (inFile);
    
  while (input.hasNextLine())
  {  

    StringPermuter sp = new StringPermuter();
    String[] result = sp.permute("elloh");
String line=input.nextLine();
    for (int i=0; i<result.length; i++)
    {
      //System.out.println(result[i]);
    
    if(line.equals(result[i]))
    {
      System.out.println("Possible Jumbled Word: "+result[i]);
      break;
    }
}
    
  }
}
}

