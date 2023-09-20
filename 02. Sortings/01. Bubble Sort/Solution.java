import java.util.*;
public class Main 
{
    public static void main (String[] args) 
    {
        int arr[] = {12, 11, 34, 23, 56, 3};
        System.out.println("Before sorting the array: ");
        printArray(arr);
        bubbleSort(arr);
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
    
    public static void bubbleSort(int[] arr)
    {
        int n = arr.length;
        // first loop is for number of passes
        for(int i=0; i<n-1; i++)
        {
            // here we checking whether the second for loop enters or not. If not the array is already sorted.
            boolean swapped = false; 
            
            // second for loop is for number of iterations
            for(int j=0; j<n-i-1; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(swapped==false)
                break;
        }
    }
}
