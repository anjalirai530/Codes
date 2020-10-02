import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int arr[] = new int[n];
     for(int  i = 0; i<arr.length ;i++){
        arr[i] = scn.nextInt();
    }
    
    HashMap<Integer,Boolean> hm  = new HashMap<>();
    for(int val : arr){
        hm.put(val,true);
    }
    for(int val : arr){
        if(hm.containsKey(val -1)){
            hm.put(val,false);
        }
    }
    int maxln = 0;
    int maxval = 0;
    for(int val : arr){
        if(hm.get(val) == true){
            int len = 1;
            int sp = val;
            
            while(hm.containsKey(sp  + len)){
                len++;
               
            }
            if(len > maxln){
            maxln = len;
            maxval = sp;
        }
        
        }
    }
    for(int i = 0 ; i < maxln ;i ++)
    System.out.println(maxval + i);
 }

}