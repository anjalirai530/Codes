import java.util.*;

public class Main{
    private static class Node{
    int data;
    ArrayList<Node> children = new ArrayList<>();
}
 
public static void levelOrderLinewiseZZ(Node node) {
        // write your code here
        Stack < Node > mainS = new Stack < > ();
        Stack < Node > helperS = new Stack < > ();
        mainS.push(node);
        int flag=1;
        while (mainS.size() > 0) {
            node = mainS.pop();
            System.out.print(node.data + " ");
            if (flag % 2 == 1) {
                for (int i = 0; i < node.children.size(); i++) {
                    Node child = node.children.get(i);
                    helperS.push(child);
                }

            } else {
                for (int i = node.children.size() - 1; i >= 0; i--) {
                    Node child = node.children.get(i);
                    helperS.push(child);
                }
            }
            if(mainS.size() == 0){
                mainS = helperS;
                helperS = new Stack<>();
                flag++;
                System.out.println();
            }
        }
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
             levelOrder(root);
// write your code here.

 }
}