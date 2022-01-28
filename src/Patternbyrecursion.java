import java.util.Scanner;

public class Patternbyrecursion {
    public static void pattern1(int r,int c)
    {
        if(r==0)
            return;
        if(r>c)
        {
            System.out.print("* ");
            pattern1(r,c+1);
        }
        else
        {
            System.out.println();
            pattern1(r-1,0);
        }
    }
    public static void pattern2(int r,int c,int i)
    {
        if(i==r)
            return;
        if(i>c)
        {
            System.out.print("* ");
            pattern2(r,c+1,i);
        }
        else
        {
            System.out.println();
            pattern2(r,0,i+1);
        }
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int r=s.nextInt();
        pattern1(r,0);
        pattern2(r,0,1);
    }
}
