//  find array is sorted or not??
import java.util.Scanner;
public class Sortedarray {
     static boolean sort(int[] arr,int i)
    {
        if(i==arr.length-1) {
            return true;
        }
        return  arr[i] <= arr[i + 1] && sort(arr, i + 1);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int [] arr=new int[]{1,2,9,4,5};
        boolean t=sort(arr,0);
        if(t==true)
        System.out.println("array is sorted");
        else
            System.out.println("array is not sorted");
    }
}
