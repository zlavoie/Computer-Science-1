//Zoe Lavoie

import java.util.*;
public class TestDoor
{
  
  public static void main(String[]args)
  {
    Door Enter= new Door();
    Door Exit= new Door();
    Door Treasure= new Door();
    
    Enter.door("Enter ");
    Enter.open();
    Enter.unlock();
    Enter.showDoor();
    
    Exit.door("Exit ");
    Exit.close();
    Exit.lock();
    Exit.showDoor();
    
    Treasure.door("Treasure ");
    Treasure.open();
    Treasure.lock();
    Treasure.showDoor();    
  }
}

    
    
  