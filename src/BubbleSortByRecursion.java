import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSortByRecursion {
    public static void bubblesort(int[] arr, int i, int n)
    {
        if(n==0)
            return;
        if(i<n) {
            if (arr[i] > arr[i + 1]) {
                int t = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = t;
            }
            bubblesort(arr, i + 1, n);
        }
          bubblesort(arr,0,n-1);
    }
    public static void main(String[] args) {
        int[] arr=new int[]{4,5,3,6,2,1};
        int n=arr.length;
        bubblesort(arr,0,n-1);
            System.out.println(Arrays.toString(arr));
        }
    }
