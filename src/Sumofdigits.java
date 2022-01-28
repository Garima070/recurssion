import java.util.Scanner;

public class Sumofdigits {
    public static int sum(int n)
    {
        if(n==0)
            return 0;
        return (n%10)+sum(n/10);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int t=sum(n);
        System.out.println(t);
    }
}
