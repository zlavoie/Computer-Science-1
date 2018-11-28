
//By Zoe Lavoie
//Inspid

import java.util.*;

public class Inspid
{

  public static void main(String[] args)
{      
    int digit1=0;
    int digit2=0;
    int digit3=0;
    int newdigit;
    
     Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a number between 1 and 99: ");
        int digit = scan.nextInt();
        
        
        System.out.println("The sequence starting at "+digit+" is: ");
        newdigit=digit;
        System.out.print(digit+" ");
       do
        {
         Check(newdigit);
         
        
         if (newdigit>99)
            {
              digit1= ((newdigit/100)%10);
              digit2= (newdigit/10)%10;
              digit3= (newdigit/1)%10;
              newdigit=((digit1*digit1)+(digit2*digit2)+(digit3*digit3));
              //System.out.println("Test");
            }
           else if ((newdigit<100)&&(newdigit>9))
           {
              digit1= ((newdigit/10)%10);
              digit2= (newdigit)%10;
              newdigit=((digit1*digit1)+(digit2*digit2));
              //System.out.println(digit1+""+digit2+"qwertyuio");
           }
           else if (newdigit<=9)
           {
             digit1=(newdigit);
             newdigit=(digit1*digit1);
             //System.out.println("Test");
           }
             System.out.print(newdigit+" ");
           Check(newdigit);
         
            } 
    while ((newdigit!=58)&&(newdigit!=1));
  
  } 
  
  
    public static int Check(int newdigit)
    {
      if (newdigit==58)
        {
          System.out.println("Not Insipid");
          End();
        }
else if (newdigit==1)
        {
          System.out.println("Insipid");
        }
return newdigit;
    }
   
     public static void End()
    {
    }
     
}

