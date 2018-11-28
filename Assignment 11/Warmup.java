import java.util.*; 
import java.io.*;

public class Warmup
{ 
    public static void main(String[] args) throws FileNotFoundException
  {
    
      File inputFile = new File("input.txt");
      Scanner input = new Scanner (inputFile);
      String line;
     
      while (input.hasNext())
      {
        line = input.nextLine();
        System.out.println(line);
      }
       input.close();
}
}