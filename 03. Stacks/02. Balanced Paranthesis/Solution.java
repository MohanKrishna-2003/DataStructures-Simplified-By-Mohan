import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        String str = "{[[{]]}";
        if (checkBalancedParanthesis(str))
            System.out.println("The string is balanced");
        else
            System.out.println("The string is not balanced");
    }

   public static boolean checkBalancedParanthesis(String str)
   {
       Stack<Character> s = new Stack<>();
       for(int i=0; i<str.length(); i++)
       {
           char ch = str.charAt(i);
           if(ch=='{' || ch=='[' || ch=='(')
                s.push(ch);
                
            else if(ch=='}' || ch==')' || ch==']')
            {
                if(s.isEmpty())
                    return false;
                
                char x = s.pop();
                if(ch=='}' && x!='{' || ch==']'&& x!='[' || ch==')'&&x!='(')
                    return false;
            }
       }
       return s.isEmpty();
   }
}
