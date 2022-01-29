import java.util.Arrays;

public class SelectionSortByRecursion {
    public static void selectionsort(int[] arr, int i, int n,int max)
    {
        if(n==0)
            return;
        if(i<n)
        {
                if(arr[max]>arr[i])
                    selectionsort(arr,i+1,n,max);
                else
                    selectionsort(arr,i+1,n,i);
            }
        else {
            int t = arr[max];
            arr[max]= arr[n-1];
            arr[n-1] = t;
            selectionsort(arr, 0, n -1, 0);
        }
        }
        public static void main(String[] args) {
        int[] arr=new int[]{4,5,3,6,2,1};
        int n=arr.length;
        selectionsort(arr,0,n,0);
        System.out.println(Arrays.toString(arr));
    }
}
