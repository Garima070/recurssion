//Create an array of 5 elements with values {1,2,4,2,6}.search value 2 in the given array and print the first occurrence(index) of search value. Do it recursively
//The prototype of the method is as follows
//public static int find(int arr[ ], int currentIndex, int search_value)
//{
//	// set of statements;
//}
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
