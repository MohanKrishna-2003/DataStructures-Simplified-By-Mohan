import java.util.*;
public class Main 
{
    public static void main (String[] args) 
    {
        int arr[] = {8, 6, 4, 20, 24, 2, 10, 12};
        System.out.println("Before sorting the array: ");
        printArray(arr);
        insertionSort(arr);
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
    
    public static void insertionSort(int[] arr)
    {
        for(int i=1; i<arr.length; i++)
        {
            int temp = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>temp)
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
        
    }
}
