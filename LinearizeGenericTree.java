import java.util.*;

public class Main{
    private static class Node{
    int data;
    ArrayList<Node> children = new ArrayList<>();
}
 public static void display(Node node) {
    String str = node.data + " -> ";
    for (Node child : node.children) {
      str += child.data + ", ";
    }
    str += ".";
    System.out.println(str);

    for (Node child : node.children) {
      display(child);
    }
  }

public static void mirror(Node node) {
    for (Node child : node.children) {
      mirror(child);
    }
    Collections.reverse(node.children);
  }

   public static void linearize(Node node){
      for(Node child : node.children){
          linearize(child);
      }
      while(node.children.size() > 1){
          Node ln = node.children.remove(node.children.size() - 1);
          Node sl = node.children.get(node.children.size() - 1);
          Node sln = getLast(sl);
          sln.children.add(ln);
      }
    // write your code here
  }
public static Node getLast(Node node){
    while(node.children.size() >= 1){
      node = node.children.get(0);
    }
    return node;
}


public static void main(String[] args) {
int arr[] = {10,20,50,-1,60,-1,-1,30,70,-1,80,110,
            -1,120,-1,-1,90,-1,-1,40,
             100,-1,-1,-1};
              Node root = null;
             Stack<Node> st = new Stack<>();
            
             for(int i=0;i<arr.length;i++){
                 if(arr[i] == -1){
                     st.pop();
                 }else{
                      Node t = new Node();
                      t.data = arr[i];
                     if(st.size() > 0){
                        st.peek().children.add(t);
                     }else{
                         root=t;
                     }
                     st.push(t);
                 }
             }
              linearize(root);
    display(root);
// write your code here.

 }
}