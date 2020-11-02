import java.util.*;

public class Main{
public static class Node{
    int data;
    Node left;
    Node right;
    
    Node(Node left , Node right , int data){
       this.left = left;
       this.right = right;
       this.data = data;
    }
}

public static Node construct(int arr[],int l,int h){
    
    if(l > h){
        return null;
    }
    int mid = (l + h)/2;
    int data = arr[mid];
    
    Node ln = construct(arr,l,mid-1);
    Node rn = construct(arr,mid+1,h);
    
    Node root = new Node(ln,rn,data);
    return root;
    
    
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
public static void main(String[] args) {
int arr[] = {12,25,37,50,62,75,87};
Node root = construct(arr,0,arr.length - 1);
display(root);
// write your code here.

 }
}