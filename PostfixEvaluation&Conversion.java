import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();
    Stack <Integer> eval = new Stack<>();
    Stack <String> infix = new Stack<>();
    Stack <String> prefix = new Stack<>();
    for(int i = 0; i <exp.length() ; i++){
        char ch = exp.charAt(i);
        if(Character.isDigit(ch)){
            eval.push(ch - '0');
            infix.push(ch + "");
            prefix.push(ch + "");
        }else if(ch == '+' || ch == '-'
        || ch == '*' || ch == '/'){
            int v2 = eval.pop();
            int v1 = eval.pop();
            int result1 = evaluate(v1,v2,ch);
            eval.push(result1);
            String v4 = infix.pop();
            String v3 = infix.pop();
            String result2 = "(" + v3 + ch + v4 + ")";
            infix.push(result2);
            String v6 = prefix.pop();
            String v5 = prefix.pop();
            String result3 = ch + v5 + v6;
            prefix.push(result3);
        }
    }
    System.out.println(eval.peek());
    System.out.println(infix.peek());
    System.out.println(prefix.peek());

    

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