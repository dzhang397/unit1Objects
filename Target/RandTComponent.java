

/**
 * Draws a target
 * 
 * @Davis Zhang
 * @9.18.2014
 */

import java.awt.Graphics2D;
import java.awt.Graphics;
import javax.swing.JComponent;
import java.util.Random;

public class RandTComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;

        int x = getWidth()/2;
        int y = getHeight()/2;
        
        Random newrand = new Random();
        
        RandTLoop target2 = new RandTLoop(newrand.nextInt(200) + 100,newrand.nextInt(300) + 100, newrand.nextInt(50) + 70, newrand.nextInt(10) + 10);
        
        target2.draw(g2);
    }
}
   