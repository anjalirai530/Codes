import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        
        for(int i = 0 ; i < n ; i++) {
            arr[i] = scn.nextInt();
        }
        
        int min = Integer.MAX_VALUE;
        int tsp = 0;
        int maxp = 0;
        for(int i = 0; i < n ; i++){
            if(min > arr[i]) { 
                min = arr[i];
            }
            
             tsp = arr[i] - min;
            
            if(tsp > maxp) {
                maxp = tsp;
            }
            
        }
        System.out.println(maxp);
        
    }

}