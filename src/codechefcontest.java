import java.util.Scanner;

public class codechefcontest {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int t=s.nextInt();
        for (int i = 0; i < t; i++) {
            int a=s.nextInt();
            int x=s.nextInt();
            int y=s.nextInt();
            int c=1;
            int[] str1=new int[a];
            int[] str2=new int[a];
            for (int j = 0; j < a; j++) {
                str1[j]=s.nextInt();
            }
            for (int j = 0; j < a; j++) {
                str2[j]=s.nextInt();
            }
            for (int j = 0; j < a; j++) {
                if (((str1[j] + x)!= str2[j]) && ((str1[j] + y)!= str2[j])) {
                    c = 0;
                    break;
                }
            }
            if(c!=0)
                System.out.println("Yes");
            else
                System.out.println("No");

            }
    }
}
