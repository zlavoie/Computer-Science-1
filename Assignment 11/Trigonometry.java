import java.util.*; 
import java.io.*;

public class Trigonometry // Note: Commented out SineCurve and Rectangle because they do not compile
{ 
    public static void main(String[] args) 
  {
  Enlarge();
  Circles();
  //SineCurve();
  //Rectangle;
    }
  
 /*   private class Rectangle
   { 
  public void main (String [] args)
  {
    int height; 
    int base;
    Rectangle r = new Rectangle ();
    r.SetBase(5);
    r.SetHeight(10);
    System.out.println(r.getBase());;
  }
  public int getBase()
  {
    return  base;
  }
  public int getHeight()
  {
    return height;
  }
  public void SetBase(int base)
  {
    this.base = base;
  }
  public void SetHeight(int height)
  {
    if (height>=0)
    {
      this.height=height;
    }
  }
  
      
    }
    */
  
    
   public static void Enlarge() 
   {
     for(int num=0;num<10;num++)
     {
     Render render = new Render();
    Circle c0 = new Circle(120,120,30);
    render.addCircle(c0);
    
    for(int x=0;x<=25;x++)
   {
      render.draw();
   c0.setRadius(x);
     render.redraw();
    }
 
    for(int y=25;y>0;y--)
    {
      render.draw();
     c0.setRadius(y);
     render.redraw();
    }
     }
   }
 
   /* public static void SineCurve()
    {
int theta = 0;
int h = 12;
int k = 10;
int step = 15;

while(theta<=(2*Math.PI))
        {
  setX = h + r*cos(theta)
      setY = k + r*sin(theta)
      draw a line to x,y
      add step to theta
}      
  }
  */
   
   public static void Circles()
   {
     Render render = new Render();
    Circle c1 = new Circle(120,120,30);
    Circle c2 = new Circle(120,120,30);
    render.addCircle(c1);
     render.addCircle(c2);
    c1.setRadius(50);   
    c1.setX(350);
    c1.setY(350);
   c2.setRadius(5);
   c2.setX(350);
    c2.setY(220);
   render.draw();
  
   while (true)
   {
     for (int f =0; f<10000;f++)
     {
   c2.setX((int)(350+ (Math.cos(f)*100)));
   c2.setY((int)(350 + (Math.sin(f)*100)));
   render.redraw();
     }
   }
   }
   }

/*
draw a single sine curve that starts at x=0 and ends at x=300 and is centered on y=150. 
The curve should start at (0,150), rise to its maximum value at (75,0), intersect (150,0), fall to its minimum value at (225,300), and rise back to (300,0) (so half the time the curve is above y=150, and half the time the curve is below 150).
*/ 