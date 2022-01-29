import java.util.Scanner;

public class codeforces {
   /* public static int bitwise(int m,int j)
    {
        if(m!=0) {
            return m--;
        }
        m=m&(m-j);
        j=j+1;
        return bitwise(m,j);
    }*/
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++)
        {
           /* int m=s.nextInt();
            int k=0;
            int t=0;
           while(m>k)
            {
                t=k;
                k=2*k+1;
            }
            System.out.println(t);
           */
            int m=s.nextInt();
            int t=m;
            int j=1;
            while((m&(m-j))!=0)
            {
                m=m&(m-j);
                j++;
            }
            System.out.println(m-1);
          /*  int m=s.nextInt();
            int t=bitwise(m,1);
            System.out.println(t-2);*/
        }
    }
}