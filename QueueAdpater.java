import java.io.*;
import java.util.*;

public class Main {

  public static class LLToQueueAdapter {
    LinkedList<Integer> list;

    public LLToQueueAdapter() {
      list = new LinkedList<>();
    }

    int size() {
        return list.size();
      // write your code here
    }

    void add(int val) {
        //list.addFirst(val);
        list.addLast(val);
      // write your code here
    }

    int remove() {
        if(size() == 0){
            System.out.println("Queue underflow" );
            return -1;
        }
        //return list.removeLast();
        return list.removeFirst();
      // write your code here
    }

    int peek() {
        if(size() == 0){
            System.out.println("Queue underflow" );
            return -1;
        }
        //return list.getLast();
                return list.getFirst();

      // write your code here
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    LLToQueueAdapter qu = new LLToQueueAdapter();

    String str = br.readLine();
    while (str.equals("quit") == false) {
      if (str.startsWith("add")) {
        int val = Integer.parseInt(str.split(" ")[1]);
        qu.add(val);
      } else if (str.startsWith("remove")) {
        int val = qu.remove();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("peek")) {
        int val = qu.peek();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("size")) {
        System.out.println(qu.size());
      }
      str = br.readLine();
    }
  }
}