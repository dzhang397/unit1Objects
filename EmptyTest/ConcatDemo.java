public class ConcatDemo
{
    public static void main(String[] args)
    {
        String animal1 = "quick brown fox";
        String animal2 = "lazy dog";
        String article = "the";
        String action = "jumped over";
        String message = "";
        message.concat(article);
        message.concat(animal1);
        message.concat(action);
        message.concat(article);
        message.concat(animal2);
        System.out.println(message);
    }
}