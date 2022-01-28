import java.util.Scanner;

public class digitproduct {
    public static int pro(int n)
    {
        if(n%10==n)
            return n;
        return (n%10)*pro(n/10);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int t=pro(n);
        System.out.println(t);
    }
}
