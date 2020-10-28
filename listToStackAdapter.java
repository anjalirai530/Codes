import java.io.*;
import java.util.*;

public class Main {

  public static class LLToStackAdapter {
    LinkedList<Integer> list;

    public LLToStackAdapter() {
      list = new LinkedList<>();
    }


    int size() {
        return list.size();
      // write your code here
    }

    void push(int val) {
        list.addFirst(val);
      // write your code here
    }

    int pop() {
        if(size() == 0){
            System.out.println("Stack underflow");
            return -1;
        }
        else
       return list.removeFirst();
      // write your code here
    }

    int top() {
         if(size() == 0){
            System.out.println("Stack underflow");
            return -1;
        }
        else
      return  list.getFirst();
      // write your code here
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    LLToStackAdapter st = new LLToStackAdapter();

    String str = br.readLine();
    while(str.equals("quit") == false){
      if(str.startsWith("push")){
        int val = Integer.parseInt(str.split(" ")[1]);
        st.push(val);
      } else if(str.startsWith("pop")){
        int val = st.pop();
        if(val != -1){
          System.out.println(val);
        }
      } else if(str.startsWith("top")){
        int val = st.top();
        if(val != -1){
          System.out.println(val);
        }
      } else if(str.startsWith("size")){
        System.out.println(st.size());
      }
      str = br.readLine();
    }
  }
}