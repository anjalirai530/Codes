import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
          Scanner scn =  new Scanner(System.in);
        int n  = scn.nextInt();
        
        int arr[] = new int[n];
        for(int i = 0; i< arr.length;i++){
            arr[i] = scn.nextInt();
        }
        int x  = scn.nextInt();
        int index = lastIndex(arr,n-1,x);
        System.out.println(index);
    }

    public static int lastIndex(int[] arr, int idx, int x){
     if(idx < 0){
           return -1;
       }
       int misa = lastIndex(arr,idx-1,x);
       if(x == arr[idx])
           return idx;
       else
           return misa ;
    }

}