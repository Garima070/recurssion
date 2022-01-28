import java.util.Scanner;

public class codeforces {
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
        }
    }
}
