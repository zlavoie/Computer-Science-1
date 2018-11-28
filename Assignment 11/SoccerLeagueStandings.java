import java.util.*; 
import java.io.*;

public class SoccerLeagueStandings
{ 
  public static void main(String[] args) throws FileNotFoundException 
  {
    File inFile = new File("League.txt");
    if(! inFile.exists())
    {
      System.out.println("Error could not open the file");
      return;
    }
    String Panthers="Panthers";
    String Tigers = "Tigers";
    String Sky = "Sky";
    
    int PW=0;
    int PL=0;
    int TW =0;
    int TL = 0;
    int SW=0;
    int SL=0;
    
    Scanner input = new Scanner (inFile);
    while (input.hasNextLine())
    {
      String firstTeam=input.next();
      input.nextInt();
      int firstScore=input.nextInt();
      String secondTeam=input.next();
      input.nextInt();
      int secondScore = input.nextInt();
      if (firstScore>secondScore)
      {
        if (firstTeam.equals(Panthers))
        {
          PW+=1;
          if (secondTeam.equals(Tigers))
          {
            TL+=1;
          }
          if (secondTeam.equals(Sky))
          {
            SL+=1;
          }
        }
        
        if (firstTeam.equals(Tigers))
        {
          TW+=1;
          if (secondTeam.equals(Panthers))
          {
            PL+=1;
          }
          if (secondTeam.equals(Sky))
          {
            SL+=1;
          }
        }
        
        if (firstTeam.equals(Sky))
        {
          SW+=1;
          if (secondTeam.equals(Tigers))
          {
            TL+=1;
          }
          if (secondTeam.equals(Panthers))
          {
            PL+=1;
          }
          
        }
      }
      
      else if (secondScore>firstScore)
      {
        if (secondTeam.equals(Panthers))
        {
          PW+=1;
          if (firstTeam.equals(Tigers))
          {
            TL+=1;
          }
          if (firstTeam.equals(Sky))
          {
            SL+=1;
          }   
        }
        
        if (secondTeam.equals(Tigers))
        {
          TW+=1;
          if (firstTeam.equals(Panthers))
          {
            PL+=1;
          }
          if (firstTeam.equals(Sky))
          {
            SL+=1;
          }
        }
        if (secondTeam.equals(Sky))
        {
          SW+=1;
          if (firstTeam.equals(Panthers))
          {
            PL+=1;
          }
          if (firstTeam.equals(Tigers))
          {
            TL+=1;
          }
        }
      }
      
    }
    System.out.println(" Team        Wins        Losses");
    System.out.println("Panthers    "+PW+"       "+PL);
    System.out.println("Sky            "+SW+"       "+SL);
    System.out.println("Tigers        "+TW+"       "+TL);
    
  }
}