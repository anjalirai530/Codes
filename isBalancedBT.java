import java.io.*;
import java.util.*;

public class Main {
  public static class Node {
    int data;
    Node left;
    Node right;

    Node(int data, Node left, Node right) {
      this.data = data;
      this.left = left;
      this.right = right;
    }
  }

  public static class Pair {
    Node node;
    int state;

    Pair(Node node, int state) {
      this.node = node;
      this.state = state;
    }
  }

  public static Node construct(Integer[] arr) {
    Node root = new Node(arr[0], null, null);
    Pair rtp = new Pair(root, 1);

    Stack<Pair> st = new Stack<>();
    st.push(rtp);

    int idx = 0;
    while (st.size() > 0) {
      Pair top = st.peek();
      if (top.state == 1) {
        idx++;
        if (arr[idx] != null) {
          top.node.left = new Node(arr[idx], null, null);
          Pair lp = new Pair(top.node.left, 1);
          st.push(lp);
        } else {
          top.node.left = null;
        }

        top.state++;
      } else if (top.state == 2) {
        idx++;
        if (arr[idx] != null) {
          top.node.right = new Node(arr[idx], null, null);
          Pair rp = new Pair(top.node.right, 1);
          st.push(rp);
        } else {
          top.node.right = null;
        }

        top.state++;
      } else {
        st.pop();
      }
    }

    return root;
  }

  public static void display(Node node) {
    if (node == null) {
      return;
    }

    String str = "";
    str += node.left == null ? "." : node.left.data + "";
    str += " <- " + node.data + " -> ";
    str += node.right == null ? "." : node.right.data + "";
    System.out.println(str);

    display(node.left);
    display(node.right);
  }
//   static boolean isBalanced = true;
//   public static int Check(Node node){
//       if(node == null){
//           return 0;
//       }
//       int lh = Check(node.left);
//       int rh = Check(node.right);
      
//       int fac = Math.abs(lh - rh);
      
//       if(fac > 1){
//           isBalanced = false;
//       }
      
//       int th = Math.max(lh , rh) + 1;
//       return th;
      
//   }
public static class isPair{
    int ht;
    boolean isBalanced;
}
public static isPair Check(Node node){
    if(node == null){
        isPair sp = new isPair();
        sp.ht = 0;
        sp.isBalanced = true;
        return sp;
    }
    
    isPair lh = Check(node.left);
    isPair rh = Check(node.right);
    
    isPair fp = new isPair();
    fp.isBalanced = Math.abs(lh.ht-rh.ht) <= 1 &&
            lh.isBalanced && rh.isBalanced;
  
      fp.ht = Math.max(lh.ht ,rh.ht)+1;
      return fp;
    
}
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    Integer[] arr = new Integer[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      if (values[i].equals("n") == false) {
        arr[i] = Integer.parseInt(values[i]);
      } else {
        arr[i] = null;
      }
    }

    Node root = construct(arr);
//   Check(root);
//     System.out.println(isBalanced);
    isPair pl = Check(root);
    System.out.println(pl.isBalanced);
    // write your code here
  }

}