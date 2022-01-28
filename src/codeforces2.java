import java.util.*;
public class codeforces2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a,b = 0,c;
        for(int i=0;i<n;i++)
        {
            int ans;
            a = s.nextInt();
            b= s.nextInt();
            c= s.nextInt();
            if(c%2==1) {
                b--;
                a--;
            }
            if(b%2==1) {
                a -= 2;
            }
            ans=Math.abs(a%2);
            System.out.println(ans);

        }
    }
}