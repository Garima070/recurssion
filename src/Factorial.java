import java.util.Scanner;

public class Factorial {
    /*public static int fact(int f,int p)
    {
        if(f==1)
            return p;
        p=p*f;
        return fact(f-1,p);
    }
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n=s.nextInt();
        int f=fact(n,1);
        System.out.println(f);
    }*/
    public static int fact(int f)
    {
        if(f==1)
            return 1;

        return  f*fact(f-1);
    }
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n=s.nextInt();
        int f=fact(n);
        System.out.println(f);
    }
}
