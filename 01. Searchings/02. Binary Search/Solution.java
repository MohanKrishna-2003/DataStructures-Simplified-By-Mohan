import java.util.*;
public class Main 
{
    public static void main (String[] args) 
    {
        int arr[] = {12, 13, 14, 15, 16, 17, 18};
        int item = 18;     
        int res = binarySearch(arr, item);
        if(res==-1)
            System.out.println("The Element " + item + " is not present in the array");
        else 
            System.out.println("The Element " + item + " is present at the index " + res);
    }
    
    public static int binarySearch(int[] arr, int item)
    {
        int low=0, high=arr.length-1;
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if(arr[mid]==item)
                return mid;
            else if(arr[mid]>item)
                high = mid-1;
            else 
                low = mid+1;
        }
        return -1;
    }
}
