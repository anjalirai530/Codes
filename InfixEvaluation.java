import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    // code
     Stack<Character>oprtr = new Stack<>();
     Stack<Integer>oprnd = new Stack<>();
     for(int i = 0 ;i < exp.length() ; i++){
         char ch = exp.charAt(i);
         if(ch == '('){
             oprtr.push(ch);
         }else if(Character.isDigit(ch)){
             oprnd.push(ch - '0');
         }else if(ch == ')'){
             while(oprtr.peek() != '('){
                 char temp = oprtr.pop();
                 int v2 = oprnd.pop();
                 int v1 = oprnd.pop();
                 int result = evaluate(v1,v2,temp);
                 oprnd.push(result);
             }
            oprtr.pop();
         }else if(ch == '+' || ch =='-' || ch == '*' || ch =='/'){
             while(oprtr.size() > 0 && oprtr.peek() != '(' 
             && precidence(ch) <= precidence(oprtr.peek()))  {
                 char temp = oprtr.pop();
                 int v2 = oprnd.pop();
                 int v1 = oprnd.pop();
                 int result = evaluate(v1,v2,temp);
                 oprnd.push(result);
             }
             oprtr.push(ch);
             
         }
     }
  while(oprtr.size() != 0){
                 char temp = oprtr.pop();
                 int v2 = oprnd.pop();
                 int v1 = oprnd.pop();
                 int result = evaluate(v1,v2,temp);
                 oprnd.push(result);
  }
  System.out.println(oprnd.peek());
    
    
}
      public static int precidence(char oprtr){
          if(oprtr == '+'){
              return 1;
          }else if(oprtr == '-'){
              return 1;
          }else if(oprtr == '*'){
              return 2;
          }else{
              return 2;
          }
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
