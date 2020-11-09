import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        
        for(int i = 0; i < n ; i++){
            arr[i] = scn.nextInt();
        }
        
        int bd = 0;
        int sd = 0;
        int tp = 0;
        
            for(int i = 1; i < n; i++){
            
            if(arr[i] >= arr[i - 1]){
                sd++;
            } else {
                tp += arr[sd] - arr[bd];
                 bd = sd =i;
            }
            
        }
         tp += arr[sd] - arr[bd];
         System.out.println(tp);
    }

}