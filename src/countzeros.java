import java.util.Scanner;

public class countzeros {
    static int c=0;
    public static int count(int n)
    {
        if(n==0)
            return c;
        if(n%10==0)
            c++;
        count(n/10);
        return c;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int t=count(n);
        System.out.println(t);
    }
}
