//A child is running up a staircase with N steps and can hop either 1 step, 2 steps or 3 steps at a time. Implement a method to count how many possible ways the child can run-up to the stairs. You need to return the number of possible ways W.
//
//Sample Input :
//4
//Sample Output  :
//7

import java.util.Scanner;
public class StairAQuestion {
    public static int stairs(int n)
    {
        if(n==0)
            return 1;
        else if(n<0)
            return 0;
        else
            return stairs(n-3)+stairs(n-2)+stairs(n-1);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int res=stairs(n);
        System.out.println(res);
    }
}
