

/**
 * Draws a target
 * 
 * @Davis Zhang
 * @9.18.2014
 */

import java.awt.Graphics2D;
import java.awt.Graphics;
import javax.swing.JComponent;

public class TargetComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;

        int x = getWidth()/2;
        int y = getHeight()/2;
        
        Target target2 = new Target(x, y, 100, 10);
        
        target2.draw(g2);
    }
}
   