//remove a perticular character from string?
import java.util.Scanner;

public class RemoveCharacter {
    public static StringBuilder remchar(StringBuilder  str1,String ch,int i,int n)
    {
        String s1= String.valueOf(str1.charAt(i));
        String s2=String.valueOf(ch);
        if(i>=n-1)
            return str1;
        if(s1.equals(s2)) {
            str1.deleteCharAt(i);
            n=n-1;
            return remchar(str1,ch,i,n);
        }
        return remchar(str1,ch,i+1,n);
    }
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        String str=s.next();
        StringBuilder str1=new StringBuilder(str);
        String ch=s.next();
        int  n=str1.length();
        StringBuilder res=remchar(str1,ch,0,n);
        System.out.println(res);
    }
}
