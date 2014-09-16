import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        turtle.setPenColor(Color.RED);
        turtle.penDown();
        turtle.turn(90);
        turtle.forward(100);
        turtle.turn(240);
        turtle.forward(100);
        turtle.turn(240);
        turtle.forward(100);
        turtle.turn(60);
    }
}
