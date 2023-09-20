import java.util.*;
public class Main 
{
    public static void main (String[] args) 
    {
        int arr[] = {70, 50, 10, 44, 8, 20};
        System.out.println("Before sorting the array: ");
        printArray(arr);
        selectionSort(arr);
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
    
    public static void selectionSort(int[] arr)
    {
        for(int i=0; i<arr.length-1; i++)
        {
            int minIndex = i;
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[minIndex]>arr[j])
                    minIndex = j;
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        
    }
}
