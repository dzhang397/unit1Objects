import java.awt.Color;
import java.util.Random;

public class TurtleLab
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle turtle1 = new Turtle(turtleWorld);
        Turtle turtle2 = new Turtle(turtleWorld);
        
       /* int heading1 = 0;

        Turtle[] turtles1 = new Turtle[12];
        Turtle[] turtles2 = new Turtle[12];
        
        for (int i = 0; i<12; i++)
        {   
            Turtle turtles1[i] = new Turtle(World);
        }
        for (int i = 12; i<24; i++)
        {
            Turtle turtles2[i] = new Turtle(World);
        }

        Turtle[] turtles1 = new Turtle[12];
        Turtle[] turtles1 = new Turtle[12];

        for (int i = 0; i < roster.size(); i++) 
        {
            E element = roster.get(i);
            element.setheading(heading1);
                for(int i = 0; i < 10; i++)
                {
                    Thread.sleep(10);
                    element.forward(5);
                }
            heading1 = heading1 + 10;
        }
        */
       
        Random numbgen = new Random();
        Color myColor = new Color(0, 0, 0);  
        
        for (int i = 1; i<24; i++)
        {
            int move1 = 15;
            turtle1.setHeading(turtle1.getHeading() + 60);
            int r = numbgen.nextInt(155);
            int g = numbgen.nextInt(205);
            int b = numbgen.nextInt(205);
            Color newColor = new Color(r, g + 50, b + 50);
            turtle1.setPenColor(newColor);
            turtle1.penUp();
            turtle1.forward(move1);
            turtle1.penDown();
            for(int j=1; j<37; j++)
            {
                turtle1.forward(7);
                turtle1.turn(10);
            }
            turtle1.setHeading(turtle1.getHeading() + 12);
            turtle1.forward(move1);
            turtle1.penDown();
            for(int j=1; j<37; j++)
            {
                turtle1.forward(5);
                turtle1.turn(10);
            }
            try {
                    Thread.sleep(100);                 //I don't know what this means!
            } catch(InterruptedException ex) {         //I got an error and I got this from Stack Overflow
                    Thread.currentThread().interrupt();
            }
            move1 = (move1 + 2); 
        }

        
        for (int i = 1; i<24; i++)
        {
            int move2 = 15;
            turtle2.setHeading(turtle2.getHeading() + 60);
            int r = numbgen.nextInt(155);
            int g = numbgen.nextInt(205);
            int b = numbgen.nextInt(205);
            Color newColor = new Color(r, g + 50, b + 50);
            turtle2.setPenColor(newColor);
            turtle2.penUp();
            turtle2.forward(move2);
            turtle2.penDown();
            for(int j=1; j<37; j++)
            {
                turtle2.forward(15);
                turtle2.turn(10);
            }
            turtle2.setHeading(turtle2.getHeading() + 12);
            turtle2.forward(move2);
            turtle2.penDown();
            for(int j=1; j<37; j++)
            {
                turtle2.forward(12);
                turtle2.turn(10);
            }
            try {
                    Thread.sleep(100);                 //1000 milliseconds is one second.
            } catch(InterruptedException ex) {
                    Thread.currentThread().interrupt();
            }
            move2 = move2 + 2;
        }

        }

    }
