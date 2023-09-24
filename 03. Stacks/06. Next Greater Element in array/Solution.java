// NAIVE APPRAOCH
import java.util.*;
public class Main 
{
    public static void main (String[] args) 
    {
        int arr[] = {30, 50, 20, 15, 25};
        int n=arr.length;
        for(int i=0; i<n; i++)
        {
            boolean flag = false;
            for(int j=i+1; j<n; j++)
            {
                if(arr[j]>arr[i])
                {
                    System.out.print(arr[j] + " ");
                    flag = true;
                    break;
                }
            }
            if(flag==false)
            {
                System.out.print(" - ");
            }
        }
    }
}

// OPTIMIZED APPROACH
