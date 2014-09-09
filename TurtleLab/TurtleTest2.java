import java.awt.Color;
import java.util.Random;

public class TurtleTest2
{
    public static void main(String args[])
    {        
        World turtleWorld = new World();
        Turtle turtle1 = new Turtle(turtleWorld);
        for(int j=1; j<37; j++)
        {
            turtle1.forward(5);
            turtle1.turn(10);
        }
    }
}