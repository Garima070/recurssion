import java.util.Scanner;

public class RotatingBinarySearch {
    public static  int rotatingbinarysearch(int arr[],int i,int n,int target)
    {
        if(n<i) {
            return -1;
        }
            int mid = i + (n - i) / 2;
            if (target == arr[mid]) {
                return mid;
            }
             if (arr[i] <=arr[mid]) {
                if (target >= arr[i] && target <= arr[mid]) {
                    return rotatingbinarysearch(arr, i, mid - 1, target);
                }
                else {
                    return rotatingbinarysearch(arr, mid + 1, n, target);
                }
            }
            if(target>=arr[mid] && arr[n]>=target) {
                return rotatingbinarysearch(arr, mid + 1, n, target);
            }
            return rotatingbinarysearch(arr,i,mid-1,target);
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int[] arr=new int[]{4,3,5,1,6,5,9,7,8};
        int n=arr.length;
        int target=6;
        int t=rotatingbinarysearch(arr,0,n-1,target);
        System.out.println(t);
    }

}