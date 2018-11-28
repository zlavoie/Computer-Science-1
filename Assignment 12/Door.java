//Zoe Lavoie

public class Door
{
  String inscription;
  boolean locked;
  boolean closed;
  
  public void door(String inscription) 
  {
    this.inscription=inscription;
    System.out.println("Door: "+inscription);
  }
  
  public void showDoor()
  {
        if (isClosed()==true)
    {
      System.out.println("Door is closed");
    }
    else if (isClosed()==false)
    {
      System.out.println("Door is open");
    }
    if (isLocked()==true)
    {
      System.out.println("Door is locked");
    }
    else if (isLocked()==false)
    {
      System.out.println("Door is unlocked");
    }
  }
  
  public boolean isClosed() 
  {
    return this.closed;
  }
  
  public boolean isLocked()
  {
    return this.locked;
  }
  
  public boolean open() 
  {
      this.closed=false;
      return this.closed;
  }
  
  public boolean close() 
  {
    this.closed=true;
    return closed;
  }
  
  public boolean lock() 
  {
    this.locked=true;
    return locked;
  }
  
  public boolean unlock() 
  {
    this.locked=false;
    return locked;
  }
}