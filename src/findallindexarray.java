import java.util.ArrayList;
import java.util.Scanner;

public class findallindexarray {
    public static ArrayList<Integer> allindex(int[] arr, int i, int target)
    {
        ArrayList<Integer> list=new ArrayList<>();
        if(i==arr.length)
            return list;
        if(target==arr[i])
            list.add(i);
        ArrayList<Integer> ans= allindex(arr,i+1,target);
        list.addAll(ans);
        return list;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] arr=new int[]{2,3,4,5,6,4};
        int target=4;
        ArrayList<Integer> ans=allindex(arr,0,target);
        System.out.println(ans);

    }
}