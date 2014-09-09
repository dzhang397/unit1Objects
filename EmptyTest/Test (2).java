import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class Test
{
    public static void main(String[] args) throws Exception
        {
            URL imageLocation = new URL(
                "http://www.clubtuzki.com/wp-content/uploads/2012/12/tuzki_tie.png");
            JOptionPane.showMessageDialog(null, "Hi I'm Tuzki", "Tuzki",
                JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
        }
}