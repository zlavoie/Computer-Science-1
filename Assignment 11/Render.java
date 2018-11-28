import java.awt.*;
import java.util.*;

class Render extends Canvas{

  ArrayList circleList = new ArrayList();
  int circleX;
  int circleY;
  int circleRadius;

  public Render()
  {
    setSize(400, 400);
    setBackground(Color.white);
    Frame aFrame = new Frame();
    aFrame.setSize(400, 400);
    aFrame.add(this);
    aFrame.setVisible(true);

  }

  public void draw()
  {

    try
    {
      Thread.sleep(10);
    } catch (Exception e)
    {
      System.out.println(e);
    }
    paint(getGraphics());
  }

  public void redraw()
  {
    try
    {
      Thread.sleep(10);
    } catch (Exception e)
    {
      System.out.println(e);
    }

    repaint();
  }

  public void addCircle(Circle value)
  {
    circleList.add(value);
  }

  public void removeAllCircles()
  {
    circleList.clear();
  }

  public void paint(Graphics g)
  {
    for (int i=0; i<circleList.size(); i++)
    {
        Circle c = (Circle) circleList.get(i);
        g.setColor(Color.blue);
        g.fillOval(c.getX()-c.getRadius(),c.getY()-c.getRadius(),
                    2*c.getRadius(),2*c.getRadius());
    }
  }

  public static void main(String[] args)
  {
    Render render = new Render();
    Circle c0 = new Circle(120,120,30);
    Circle c1 = new Circle(120,120,40);
    Circle c2 = new Circle(120,120,50);

    render.addCircle(c0);
    render.addCircle(c1);
    render.addCircle(c2);

    int change=-1;

    while (true)
    {

      render.redraw();

      if ((c0.getX()==0)||(c0.getX()==300)) change=change*-1;
      c0.setX(c0.getX()+change);
      c1.setY(c1.getY()+change);
      c2.setX(c2.getX()+change);
      c2.setY(c2.getY()+change);
    }

  }
}
