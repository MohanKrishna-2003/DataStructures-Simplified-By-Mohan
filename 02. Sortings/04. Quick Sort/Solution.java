import java.util.*;
public class Main 
{
    public static void main (String[] args) 
    {
        int arr[] = {70, 90, 10, 30, 50, 20, 60};
        System.out.println("Before sorting the array: ");
        printArray(arr);
        quickSort(arr, 0, arr.length-1);
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
    
    public static void quickSort(int arr[], int low, int high)
    {
        if(low<high)
        {
            int partitionIndex = parition(arr, low, high);
            quickSort(arr, low, partitionIndex-1);
            quickSort(arr, partitionIndex+1, high);
        }
    }
   
    public static int parition(int[] arr, int low, int high)
    {
        int pivot = arr[high];
        int swapIndex = low-1;
        for(int i=low; i<high; i++)
        {
            if(arr[i]<pivot)
            {
                swapIndex++;
                int temp = arr[swapIndex];
                arr[swapIndex] = arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[swapIndex+1];
        arr[swapIndex+1] = arr[high];
        arr[high] = temp;
        
        return swapIndex+1;
    }
}
