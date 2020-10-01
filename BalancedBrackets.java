import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        String str = sc.nextLine();
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{')
            {
                stack.push(ch);
            }
            else if(ch == ')' || ch == ']' || ch =='}')
            {
                if(stack.size() == 0)
                {
                   System.out.println("false"); 
                   return;
                }
                else{
                    if((stack.peek() == '(' && ch == ')')
                    ||(stack.peek() =='['&&ch==']')||
                    (stack.peek() == '{' && ch == '}'))
                    {
                        stack.pop();
                    }
                    
                }
            
            }
              
        }
        if(stack.size() == 0)
        System.out.println("true");
        else
        System.out.println("false");
        

    }

}