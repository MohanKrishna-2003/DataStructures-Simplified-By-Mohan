import java.util.*;
public class Main 
{
    public static void main (String[] args) 
    {
        int arr[] = {23, 45, 6, 34, 22};
        int key = 34;
        int res = linearSerach(arr, key);
        if(res==-1)
            System.out.println("The Element " + key + " not found in the array");
        else 
            System.out.println("The Element " + key + " is present at the index " + res);
        
    }
    
    public static int linearSerach(int[] arr, int key)
    {
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==key)
                return i;
        }
        return -1;
    }
}
