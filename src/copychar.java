//Given an input string S and two characters char1 and char2, you need to replace every occurrence of character c1 with character c2 in the given string. Do this recursively.
//
//Sample Input :
//abaca
//a x
//Sample Output :
//xbxcd
import java.util.Scanner;

public class copychar {
    public static StringBuilder copy(StringBuilder str, String c1, String c2, int i)
    {
        String str1=c1;
        String str2= String.valueOf(str.charAt(i));
        String str3=c2;
        if(str2.equals(str1))
            str.setCharAt(i, str3.charAt(0));
        if(i>=str.length()-1)
            return str;
        return copy(str,c1,c2,i+1);

    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String istr=s.next();
        String c1=s.next();
        String c2=s.next();
        StringBuilder str=new StringBuilder(istr);
        StringBuilder res=copy(str,c1,c2,0);
        System.out.println(res);
    }
}
