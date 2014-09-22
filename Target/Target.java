

/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;

public class Target
{
    private int xPos;
    private int yPos;
    private int radius;
    private int ringWidth;
    
    public Target(int x, int y, int r, int w)
    {
        xPos = x;
        yPos = y;
        radius = r;
        ringWidth = w;
    }
    
    public void draw (Graphics2D g2)
    {
        g2.setColor(Color.RED);
        Ellipse2D.Double outer = new Ellipse2D.Double(xPos, yPos, radius, radius);
        g2.fillOval(xPos, yPos, radius, radius);
        g2.setColor(Color.WHITE);
        xPos = xPos + ringWidth/2;
        yPos = yPos + ringWidth/2;
        radius = radius - ringWidth;
        Ellipse2D.Double ring1 = new Ellipse2D.Double(xPos, yPos, radius, radius);
        g2.fillOval(xPos, yPos, radius, radius);
        g2.setColor(Color.RED);
        xPos = xPos + ringWidth/2;
        yPos = yPos + ringWidth/2;
        radius = radius - ringWidth;
        Ellipse2D.Double ring2 = new Ellipse2D.Double(xPos, yPos, radius, radius);
        g2.fillOval(xPos, yPos, radius, radius);
        g2.setColor(Color.WHITE);
        xPos = xPos + ringWidth/2;
        yPos = yPos + ringWidth/2;
        radius = radius - ringWidth;
        Ellipse2D.Double ring3 = new Ellipse2D.Double(xPos, yPos, radius, radius);
        g2.fillOval(xPos, yPos, radius, radius);
        g2.setColor(Color.RED);
        xPos = xPos + ringWidth/2;
        yPos = yPos + ringWidth/2;
        radius = radius - ringWidth;
        Ellipse2D.Double ring4 = new Ellipse2D.Double(xPos, yPos, radius, radius);
        g2.fillOval(xPos, yPos, radius, radius);
        g2.setColor(Color.WHITE);
        xPos = xPos + ringWidth/2;
        yPos = yPos + ringWidth/2;
        radius = radius - ringWidth;
        Ellipse2D.Double ring5 = new Ellipse2D.Double(xPos, yPos, radius, radius);
        g2.fillOval(xPos, yPos, radius, radius);
        g2.setColor(Color.RED);
        xPos = xPos + ringWidth/2;
        yPos = yPos + ringWidth/2;
        radius = radius - ringWidth;
        Ellipse2D.Double ring6 = new Ellipse2D.Double(xPos, yPos, radius, radius);
        g2.fillOval(xPos, yPos, radius, radius);
        g2.setColor(Color.WHITE);
        xPos = xPos + ringWidth/2;
        yPos = yPos + ringWidth/2;
        radius = radius - ringWidth;
        Ellipse2D.Double ring7 = new Ellipse2D.Double(xPos, yPos, radius, radius);
        g2.fillOval(xPos, yPos, radius, radius);
        g2.setColor(Color.RED);
        xPos = xPos + ringWidth/2;
        yPos = yPos + ringWidth/2;
        radius = radius - ringWidth;
        Ellipse2D.Double ring8 = new Ellipse2D.Double(xPos, yPos, radius, radius);
        g2.fillOval(xPos, yPos, radius, radius);
        g2.draw(outer);
        g2.draw(ring1);
        g2.draw(ring2);
        g2.draw(ring3);
        g2.draw(ring4);
        g2.draw(ring5);
        g2.draw(ring6);
        g2.draw(ring7);
        g2.draw(ring8);
    }
}
