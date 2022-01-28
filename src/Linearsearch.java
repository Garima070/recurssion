import java.util.Scanner;

public class Linearsearch {
    public static int search(int[] arr,int target,int i)
    {
     if(i==arr.length)
         return i;
     if(arr[i]==target)
         return i;
     return search(arr,target,i+1);
    }
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int [] arr=new int[]{1,2,15,4,21,3};
        int target=2;
        int t=search(arr,target,0);
        System.out.println(t);
    }
}
