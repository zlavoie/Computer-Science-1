import java.util.*;

public class Circle
{
  int x;
  int y;
  int radius;
  double PI;
  
  public Circle()
  {
    PI = 3.1415926;
    setX(0);
    setY(0);
    setRadius(0);
  }
  
  public Circle(int valueX, int valueY, int valueRadius)
  {
    PI = 3.1415926;
    setX(valueX);
    setY(valueY);
    setRadius(valueRadius);
  }
  
  public int getX()
  {
    return x;
  }
  
  public int getY()
  {
    return y;
  }
  
  public int getRadius()
  {
    return radius;
  }
  
  public void setX(int value)
  {
    x = value;
  }
  
  public void setY(int value)
  {
    y = value;
  }
  
  public void setRadius(int value)
  {
    radius = value;
  }
  
  public double getArea()
  {
    double result;
    result = PI * getRadius() * getRadius();
    return result;
  }
  
  public double getCircumference()
  {
    double result;
    result = 2 * PI * getRadius();
    return result;
  }
    
  public static void main(String[] args)
  {
    Circle c = new Circle(10,10,2); // declare c of type circle; set x,y location to 10,10 set radius to 2
    
    System.out.println("My area is: " + c.getArea()); 
    System.out.println("My circumference  is: " + c.getCircumference());
    System.out.println("My radius is: " + c.getRadius());
  }
  
  
}