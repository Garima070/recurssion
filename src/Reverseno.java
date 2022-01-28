import java.util.Scanner;

public class Reverseno {
    static int s=0;
    public static int reverse(int n)
    {
        if(n==0) {
            return s;
        }
        s=s*10+n%10;
        reverse(n/10);
        return s;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int t=reverse(n);
        System.out.println(t);
    }
}
