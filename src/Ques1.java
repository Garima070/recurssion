//minimum no of operations performed on given no to convert it zero
import java.util.Scanner;

public class Ques1 {
    static int c=0;
    public static int ope(int n)
{
    if(n==0)
        return c;
    if(n%2==0)
    {
        c++;
        return ope(n/2);
    }
    else {
        c++;
        return ope(n - 1);
    }
}
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int t=ope(n);
        System.out.println(t);
    }
}
