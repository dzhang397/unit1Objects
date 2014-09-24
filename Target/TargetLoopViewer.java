import javax.swing.JFrame;

public class TargetLoopViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        
        frame.setSize(300, 400);
        frame.setTitle("Target");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        TargetLoopComponent component = new TargetLoopComponent();
        frame.add(component);
        
        frame.setVisible(true);
    }
}