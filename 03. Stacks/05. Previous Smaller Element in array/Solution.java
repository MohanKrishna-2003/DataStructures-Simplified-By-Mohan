// NAIVE APPROACH
import java.util.*;
public class Main 
{
    public static void main (String[] args) 
    {
        int arr[] = {12, 10, 20, 22, 15, 14, 18, 32, 20, 22, 19};    
        int n = arr.length;
        for(int i=0; i<n; i++)
        {
            boolean flag = false;
            for(int j=i-1; j>=0; j--)
            {
                if(arr[j]<arr[i])
                {
                    System.out.print(arr[j] + " ");
                    flag = true;
                    break;
                }
            }
            if(flag==false)
                System.out.print(" - ");
        }
    }
}


// OPTIMIZED APPRAOCH
import java.util.*;
public class Main 
{
    public static void main (String[] args) 
    {
        int arr[] = {12, 10, 20, 22, 15, 14, 18, 32, 20, 22, 19}; 
        Stack<Integer> s = new Stack<>();
        s.push(arr[0]);
        System.out.print(" - ");
        for(int i=1; i<arr.length; i++)
        {
            while(s.isEmpty()==false && s.peek()>=arr[i])
            {
                s.pop();
            }
            if(s.isEmpty())
                System.out.print(" - ");
            else 
                System.out.print(s.peek() + " ");
                
            s.push(arr[i]);
        }
    }
}
