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
        
        int cost = scn.nextInt();
        
        int obsp = -arr[0];
        int ossp = 0;
        
        
            for(int i = 1; i < n; i++){
             int nbsp = 0;
             int nssp = 0;
             if(ossp - arr[i] > obsp){
                 nbsp = ossp - arr[i];
             } else { 
                 nbsp = obsp;
             }
             
            if(obsp + arr[i] - cost > ossp){
                nssp = obsp + arr[i] - cost;
            } else {
                nssp = ossp;
            }
                ossp = nssp;
                obsp = nbsp;
            }
            System.out.println(ossp);
        
       
    }

}