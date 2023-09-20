import java.util.*;
public class Main 
{
    public static void main (String[] args) 
    {
        int arr[] = {70, 50, 10, 44, 20, 8, 15};    
        System.out.println("Before sorting the array: ");
        printArray(arr);
        mergeSort(arr, 0, arr.length-1);
        System.out.println("\nAfter sorting the array: ");
        printArray(arr);
    }
    
    public static void printArray(int[] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void mergeSort(int[] arr, int low, int high)
    {
        if(low<high)
        {
            int mid = low+(high-low)/2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid+1, high);
            merge(arr, low, mid, high);
        }
    }
    
    public static void merge(int[] arr, int low, int mid, int high)
    {
        int temp[] = new int[7];
        int i=low, j=mid+1, index = low;
        while(i<=mid && j<=high)
        {
            if(arr[i]<arr[j])
            {
                temp[index]  = arr[i];
                i++;
            }
            else 
            {
                temp[index] = arr[j];
                j++;
            }
            index++;
        }
        if(i>mid)
        {
            while(j<=high)
            {
                temp[index] = arr[j];
                index++;
                j++;
            }
        }
        else 
        {
            while(i<=mid)
            {
                temp[index] = arr[i];
                index++;
                i++;
            }
        }
        int p = low;
        while(p<index)
        {
            arr[p] = temp[p];
            p++;
        }
        
    }
}
