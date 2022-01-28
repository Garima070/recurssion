import java.util.Scanner;

public class Fibonacciseries {
    public static int fib(int n)
    {
        if(n==0 || n==1)
            return n;
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
       int t= fib(n);
        System.out.println(t);
    }
}
//0 1 1 2 3 5 8 13 21 34