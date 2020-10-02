import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n1 = scn.nextInt();
    int arr1[] = new int[n1];
    for(int  i = 0; i<arr1.length ;i++){
        arr1[i] = scn.nextInt();
    }
    
    int n2 = scn.nextInt();
    int arr2[] = new int[n2];
    for(int  i = 0; i<arr2.length ;i++){
        arr2[i] = scn.nextInt();
    }
    
    HashMap<Integer,Integer> hm = new HashMap<>();
    for(int val : arr1){
        if(hm.containsKey(val)){
            int of = hm.get(val);
            int nf = of + 1;
            hm.put(val,nf);
        }else{
            hm.put(val,1);
        }
    }
    
    for(int val : arr2){
        if(hm.containsKey(val)){
            System.out.println(val);
            hm.remove(val);
        }
    }
    }

}