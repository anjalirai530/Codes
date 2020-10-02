import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();
    Stack <Integer> eval = new Stack<>();
    Stack <String> infix = new Stack<>();
    Stack <String> postfix = new Stack<>();
    for(int i = exp.length() - 1 ; i >= 0 ; i--){
        char ch = exp.charAt(i);
        if(Character.isDigit(ch)){
            eval.push(ch - '0');
            infix.push(ch + "");
            postfix.push(ch + "");
        }else if(ch == '+' || ch == '-'
        || ch == '*' || ch =='/'){
            int v1 = eval.pop();
            int v2 = eval.pop();
            int result1 = evaluate(v1,v2,ch);
            eval.push(result1);
            String v4 = infix.pop();
            String v3 = infix.pop();
            String result2 = "(" + v4 + ch + v3 + ")";
            infix.push(result2);
            String v6 = postfix.pop();
            String v5 = postfix.pop();
            String result3 = v6 + v5 + ch;
            postfix.push(result3);
        }
    }
    System.out.println(eval.peek());
    System.out.println(infix.peek());
    System.out.println(postfix.peek());

    // code
 }
   public static int evaluate(int v1,int v2, char oprtr){
          if(oprtr == '+'){
              return v1+v2;
          }else if(oprtr == '-'){
              return v1-v2;
          }else if(oprtr =='*'){
              return v1*v2;
          }else{
              return v1/v2;
          }
          
      }
 
}