import java.util.Scanner;

public class XtoPowerN {
    public static int power(int x,int n,int i,int m)
    {

        if(i>=n)
            return m;
        m=m*x;
        i=i+1;
        return power(x,n,i,m);
    }/*
    public static int power(int x,int n)
    {
        if(n==0)
            return 1;
        if(x==0)
            return 0;
        return x*power(x,n-1);
    }*/
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int n=s.nextInt();
        int res=power(x,n,1,x);
        System.out.println(res);
    }
}
