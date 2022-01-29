import java.util.Scanner;

public class SearchElementIndex {
    public static int sum(int[] arr,int i, int t)
    {
        if(i==arr.length-1)
            return arr.length-1;
        if(arr[i]==t)
            return i;
        return sum(arr,i+1,t);
    }
    public static void main(String[] args) {
        int[]arr=new int[]{1,2,4,3,2};
        int target=2;
        int res=sum(arr,0,2);
        System.out.println(res);
    }
}
