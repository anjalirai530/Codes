import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();
    Stack<String>postfix = new Stack<>();
    Stack<String>prefix = new Stack<>();
    Stack<Character>oprtr = new Stack<>();
    for(int i = 0; i < exp.length(); i++){
        char ch = exp.charAt(i);
        if(ch == '('){
            oprtr.push(ch);
        }else if((ch >= '0' && ch <= '9') 
        || (ch >= 'a' && ch <= 'z') 
        || (ch >= 'A' && ch <='Z')){
            postfix.push(ch + "");
            prefix.push(ch + "");
        // }else if(Character.isDigit(ch)){
        //   oprtr.push(ch - '0');
        }else if(ch == ')'){
            while(oprtr.peek() != '('){
                char temp = oprtr.pop();
                String v2 = postfix.pop();
                String v1 = postfix.pop();
                String result1 = v1 + v2 + temp;
               
                postfix.push(result1);
                
                String v4 = prefix.pop();
                String v3 = prefix.pop();
                String result2 = temp + v3 + v4 ;
                
                prefix.push(result2);
            }
            oprtr.pop();
        }else if(ch == '+' || ch == '-'
        || ch == '*' || ch == '/'){
            while(oprtr.size() > 0 
            && oprtr.peek() != '('
        && precidence(ch) <= precidence(oprtr.peek())){
               char temp = oprtr.pop();
                String v2 = postfix.pop();
                String v1 = postfix.pop();
                String result1 = v1 + v2 + temp;
               
                postfix.push(result1);
                
                String v4 = prefix.pop();
                String v3 = prefix.pop();
                String result2 =  temp + v3 + v4 ;
                
                prefix.push(result2);
        }
        
         oprtr.push(ch);   
        }
    }
    while(oprtr.size() != 0){
    
                 char temp = oprtr.pop();
                String v2 = postfix.pop();
                String v1 = postfix.pop();
                String result1 = v1 + v2 + temp;
               
                postfix.push(result1);
                
                String v4 = prefix.pop();
                String v3 = prefix.pop();
                String result2 = temp + v3 + v4 ;
                
                prefix.push(result2);
    }
    System.out.println(postfix.peek());
     System.out.println(prefix.peek());

    // code
 }
  public static int precidence(char oprtr){
          if(oprtr == '+' 
          ||oprtr == '-'){
              return 1;
          }else if(oprtr == '*'
          ||oprtr == '/'){
              return 2;
          }else{
              return 0;
          }
      }
      
}