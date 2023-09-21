import java.util.*;
public class Main 
{
    public static void main (String[] args) 
    {
        String str = "{{}}";
        if(checkBalanced(str))
            System.out.println("The given string is balanced");
        else 
            System.out.println("The given string is not balanced");
    }
    
    public static boolean checkBalanced(String str)
    {
        Stack<Character> s = new Stack<>();
        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch=='{' || ch=='[' || ch=='(')
            {
                s.push(ch);
                continue;
            }
            
            // Base Condition
            if(s.isEmpty())
                return false;
            
            char x;
            switch(ch)
            {
                case '}': 
                x = s.pop();
                if(x==']' || ch==')')
                    return false;
                break;
                
                case ']':
                x = s.pop();
                if(x==')' || x=='}')
                    return false;
                break;
                
                case ')':
                x = s.pop();
                if(x=='}' || x==']')
                    return false;
                break;
                    
            }
        }
        return (s.isEmpty());
    }
}
