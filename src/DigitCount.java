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
