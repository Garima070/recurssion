import java.util.*;
public class Binarysearch {
    public static  int bin(int arr[],int i,int n,int target)
    {
        if(n>=i) {
            int mid = i + (n - i) / 2;
            if (target == arr[mid])
                return mid;
            else if (target > arr[mid])
                return bin(arr,mid+1, n, target);
            return bin(arr,i, mid - 1, target);
        }
        return -1;
    }
    public static void main(String[] args)
    {
         Scanner s=new Scanner(System.in);
         int[] arr=new int[]{1,2,3,4,5};
         int n=arr.length;
         int target=s.nextInt();
         int t=bin(arr,0,n-1,target);
         if(t==-1)
             System.out.println("element not found");
         else
        System.out.println(t);
    }
}
