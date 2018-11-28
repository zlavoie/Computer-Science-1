import java.util.*;

public class StringPermuter
{
  public String[] permute(String input)
  {
    ArrayList<String> result = new ArrayList<String>();
    
    permute(input, "", result);
    
    String[] resultArray = new String[result.size()];
    return (String []) result.toArray(resultArray);
  }
  
  public static void permute(String input, String output, ArrayList<String> result) 
  {
    if (input.length()==1)
    {
      result.add(output+input);
    }
    else
    {
      for (int i=0; i<input.length(); i++)
      {
        String newInput=removeChar(input,i);
        String newOutput=output+input.charAt(i);
        
        permute(newInput,newOutput,result);
      }
    }
  }
  
  public static String removeChar(String s, int i) 
  {
    String result= s.substring(0,i) + s.substring(i+1);
    return result;
  }
  
  public static void main(String[] args)
  {
    StringPermuter sp = new StringPermuter();
    String[] result = sp.permute("elloh");
    
    for (int i=0; i<result.length; i++)
    {
      System.out.println(result[i]);
    } 
  }
}