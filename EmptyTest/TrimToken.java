import java.util.StringTokenizer;

public class TrimToken
{
    public static void main(String[] args)
    {
        String sentence1 = "      abc   ";
        String sentence2 = "   def";
        String sentence3 = "ghi         ";
        StringTokenizer s1 = new StringTokenizer(sentence1);
        StringTokenizer s2 = new StringTokenizer(sentence2);
        StringTokenizer s3 = new StringTokenizer(sentence3);
        System.out.println(s1.nextToken() + s2.nextToken() + s3.nextToken());
    }
}