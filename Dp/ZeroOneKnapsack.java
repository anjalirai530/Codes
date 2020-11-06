import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
     Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();
     int val[] = new int[n];
     for(int i = 0; i < n; i++){
         val[i] = scn.nextInt();
     }
     int wt[] = new int[n];
     for(int i = 0; i < n ;i++){
         wt[i] = scn.nextInt();
     }
     int mwt = scn.nextInt();
     int dp[][] = new int[n + 1][mwt + 1];
     for(int i = 1;i < dp.length; i++){
         for(int j = 1; j < dp[0].length; j++){
            
             if(j >= wt[i-1]){
                int cwt   = j - wt[i-1];
                if(dp[i-1][cwt] + val[i-1] > dp[i-1][j]){
                    dp[i][j] = dp[i-1][cwt] + val[i-1];
                } else{
                     dp[i][j] = dp[i-1][j];
                }
             } else{
                 dp[i][j] = dp[i-1][j];
             }
             
         }
     }
     System.out.println(dp[n][mwt]);
     
    }
}