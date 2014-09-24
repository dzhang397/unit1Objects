import javax.swing.JFrame;

public class RandTViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        
        frame.setSize(300, 400);
        frame.setTitle("Target");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        RandTComponent component = new RandTComponent();
        frame.add(component);
        
        frame.setVisible(true);
    }
}