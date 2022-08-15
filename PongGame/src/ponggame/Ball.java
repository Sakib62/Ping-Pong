package ponggame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

public class Ball extends Rectangle
{
    
   Random random;

    
    Ball(int x,int y,int width,int height)
    {
        super(x,y,width,height);
        random = new Random();

    }
    
    public void setXDirection(int randomXDirection)
    {
        
    }
    
    public void setYDirection(int randomYDirection)
    {
        
    }
    
    public void move()
    {
        
    }
    
    public void draw(Graphics g)
    {
        g.setColor(Color.WHITE);
        g.fillOval(x,y,width,height);
    }

}
