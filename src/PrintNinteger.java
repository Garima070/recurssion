import java.util.Scanner;

public class PrintNinteger {
    public static void print(int n,int i)
    {
        System.out.println(i);
       if(i==n)
           return;
        print(n,i+1);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        print(n,1);
    }
}
