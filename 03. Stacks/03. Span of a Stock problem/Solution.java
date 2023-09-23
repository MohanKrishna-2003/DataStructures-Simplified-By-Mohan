// Naive appraoch 
import java.util.*;
public class Main 
{
    public static void main (String[] args) 
    {
        int arr[] = {15, 10, 8, 9, 12, 17};    
        int currIndex;
        for(int i=0; i<arr.length; i++)
        {
            currIndex = 1;
            for(int j=i-1; j>=0&&arr[j]<=arr[i]; j--)
                currIndex++;
            System.out.print(currIndex + " ");
        }
    }
}


// Optimized Approach
import java.util.*;
public class Main 
{
    public static void main (String[] args) 
    {
        int arr[] = {15, 10, 8, 9, 12, 17};
        Stack<Integer> s = new Stack<>();
        s.push(0);
        System.out.print(1 +" ");
        for(int i=1; i<arr.length; i++)
        {
            while(s.isEmpty()==false && arr[s.peek()]<=arr[i])
            {
                s.pop();
            }
            int span = s.isEmpty()?i+1 : i-s.peek();
            System.out.print(span + " ");
            s.push(i);
        }
    }
}
