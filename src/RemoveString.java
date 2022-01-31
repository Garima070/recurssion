import java.util.Scanner;

public class RemoveString {
    public static String remstring(String str1)
    {
        if(str1.isEmpty())
            return "";
        if(str1.startsWith("apple")) {
            return remstring(str1.substring(5));
        }
        else
        return str1.charAt(0)+remstring(str1.substring(1));
    }
    public static void main(String[] args) {
        System.out.println(remstring("bcdapplegf"));
    }
}
