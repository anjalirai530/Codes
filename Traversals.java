import java.util.*;

public class Main{
public static class Node{
    int data;
    Node left;
    Node right;
    
    Node(int data,Node left,Node right){
        this.data = data;
        this.left = left;
        this.right = right;
    }
}

public static class Pair{
    Node node;
    int state;
    
    Pair(Node node, int state){
        this.node = node;
        this.state = state;
    }
}
public static void display(Node node){
    if(node == null){
        return;
    }
   String str = "";
   str += node.left == null ? "." : node.left.data + "";
   str += "<-" + node.data + "->";
   str += node.right == null ? "." : node.right.data + "";
   
    System.out.println(str);
    
    display(node.left);
    display(node.right);
    
}
public static void pre(Node node){
    if(node == null){
        return;
    }
    System.out.print("preorder -> " + node.data + " ");
    pre(node.left);
    
    pre(node.right);
     
}
public static void post(Node node){
    if(node == null){
        return;
    }
    
    post(node.left);
    
    post(node.right);
     System.out.print("postorder -> " + node.data + " ");
}
public static void inorder(Node node){
    if(node == null){
        return;
    }
    
    inorder(node.left);
     System.out.print("inorder -> " + node.data + " ");
    inorder(node.right);
     
}
public static void main(String[] args) {
Integer arr[] = {50,25,12,null,null,37,30,null,null,null,75,62,
            null,70,null,null,57,null,null};
            
            Stack <Pair> st = new Stack<>();
            Node root = new Node(arr[0],null,null);
            Pair rt = new Pair(root,1);
            st.push(rt);
            //st.push(new Pair(root,1));
            
            int idx = 0;
            
            while(st.size() != 0){
                Pair top = st.peek();
                if(top.state == 1){
                    idx++;
                    if(arr[idx] != null){
                        Node ln = new Node(arr[idx],null,null);
                        top.node.left = ln;
                      
                      Pair lp = new Pair(ln,1);
                      st.push(lp);
                    }else{
                        top.node.left = null;
                    }
                    top.state++;
                }else if(top.state == 2){
                    idx++;
                    if(arr[idx] != null){
                        Node rn = new Node(arr[idx],null,null);
                        top.node.right = rn;
                      
                      Pair rp = new Pair(rn,1);
                      st.push(rp);
                    }else{
                        top.node.right = null;
                    }
                    top.state++;
                }else{
                    st.pop();
                }
            }
            //display(root);
            pre(root);
            inorder(root);
            post(root);
            //System.out.println(root.data);
// write your code here.

 }
}