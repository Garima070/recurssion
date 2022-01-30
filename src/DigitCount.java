// Write a program to find out and return the number of digits present in a number recursively.
//
//Sample Input 1 :
// 156
//Sample Output 1 :
//3
//Sample Input 2 :
// 7
//Sample Output 2 :
//1
import java.util.Scanner;

public class DigitCount {
    public static int count(int n,int i)
    {
        if(n/10==0)
            return i;
        n=n/10;
        return count(n,i+1);

    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int res=count(n,1);
        System.out.println(res);
    }
}
