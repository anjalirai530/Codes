import java.util.*;

public class Main{
private static class Node{
    int data;
    ArrayList<Node> children = new ArrayList<>();
}
public static void display(Node node){
    String str = node.data + "->" + "";
    for(Node child : node.children){
        str = str + child.data + ",";
        
    }
    str = str + ".";
    System.out.println(str);
    for(Node child : node.children){
       display(child);
        
    }
}
static int  size = 0;
static int max = Integer.MIN_VALUE;
static int min = Integer.MAX_VALUE;
static int ht = 0;

public static void multisolver(Node node,int depth){
    size++;
    max = Math.max(node.data,max);
    min = Math.min(node.data,min);
    ht = Math.max(ht,depth);
    
    for(Node child : node.children){
        multisolver(child,depth+1);
    }
}
public static void main(String[] args) {
Stack <Node> st = new Stack<>();

int arr[] = {10,20,50,-1,60,-1,-1,30,70,-1,80,110,
            -1,120,-1,-1,90,-1,-1,40,
             100,-1,-1,-1};
             Node root = null;
             
             for(int i = 0 ; i < arr.length ;i++){
                 if(arr[i] == -1){
                     st.pop();
                 }else{
                     Node temp = new Node();
                     temp.data = arr[i];
                     if(st.size() > 0){
                         st.peek().children.add(temp);
                     }else{
                         root = temp;
                     }
                     st.push(temp);
                 }
             }
            //  display(root);
             multisolver(root,0);
             System.out.println("size " + size);
             System.out.println("max " + max);
             System.out.println("min " + min);
             System.out.println("ht " + ht);
// write your code here.


 }
}