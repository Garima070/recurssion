//Remove Duplicates Recursively
//
//Q. In a string S, remove consecutive duplicates from it recursively.
//
//Sample Input 1 :
//aabccba
//Sample Output 1 :
//abcba
import java.util.Scanner;
public class RemoveDuplicateElements {
    public static StringBuilder remove(StringBuilder str,int i,int n)
    {
        if(i>=n-1)
            return str;
        String f1= String.valueOf(str.charAt(i));
        String f2= String.valueOf(str.charAt(i+1));
        if(f1.equals(f2))
        {
            str.deleteCharAt(i+1);
            return remove(str,i,n-1);
        }
         return remove(str,i+1,n);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str1=s.next();
        StringBuilder str=new StringBuilder(str1);
        int n=str.length();
        StringBuilder ans=remove(str,0,n);
        System.out.println(ans);
    }
}
