import java.util.Random;
public class DieSimulator
{
    public static void main(String[] args)
    {
        Random numbgen = new Random();
        System.out.println(numbgen.nextInt(6) + 1);
    }
}        