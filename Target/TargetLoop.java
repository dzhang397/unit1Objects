

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
import java.util.Random;

public class TargetLoop
{
    private int xPos;
    private int yPos;
    private int radius;
    private int ringWidth;
    
    public TargetLoop(int x, int y, int r, int w)
    {
        xPos = x;
        yPos = y;
        radius = r;
        ringWidth = w;
    }
    
    public void draw (Graphics2D g2)
    {
        Random rand = new Random();
        int r = rand.nextInt(255);
        int g = rand.nextInt(255);
        int b = rand.nextInt(255);
        Color newColor = new Color(r, g, b);
        int colorid = 0;
        while(radius > 0){
            if((colorid % 2) == 0){
                g2.setColor(Color.WHITE);
            }
            else{
                g2.setColor(newColor);
            }
            colorid = colorid + 1;
            Ellipse2D.Double outer = new Ellipse2D.Double(xPos, yPos, radius, radius);
            g2.fillOval(xPos, yPos, radius, radius);
            xPos = xPos + ringWidth/2;
            yPos = yPos + ringWidth/2;
            radius = radius - ringWidth;
        }
    }
}
