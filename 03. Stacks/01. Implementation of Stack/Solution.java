import java.util.*;

class MyStack
{
    int top;
    int arr[];
    int size;
    
    MyStack(int x)
    {
        top = -1;
        size = x;
        arr = new int[size];
    }
    
    void push(int val)
    {
        if(isFull())
            System.out.println("Stack is Full");
        else 
        {
            top++;
            arr[top] = val;
        }
    }
    
    int pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack is Empty");
            return -1;
        }
        else 
        {
            int val = arr[top];
            top--;
            return val;
        }
    }
    
    boolean isEmpty()
    {
        return (top==-1);
    }
    
    boolean isFull()
    {
        return (top==size-1);
    }
    
    int peek()
    {
        return arr[top];
    }
}

public class Main 
{
    public static void main (String[] args) 
    {
        MyStack s = new MyStack(5);
        s.push(12);
        s.push(24);
        s.push(45);
        s.push(90);
        s.push(68);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.isEmpty());
        System.out.println(s.isFull());
        
    }
}
