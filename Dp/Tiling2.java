import java.io.*;
import java.util.*;

public class Main {
    public static int call(int m,int n){
        if(n < m){
            return 1;
        } else if(n == m){
            return 2;
        } else{
            int t1 = call(m,n-1);
            int t2 = call(m,n-m);
            return t1+t2;
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        System.out.println(call(m,n));
    
        // int dp[] = new int[n + 1];
        // for(int i = 1; i <= n;i++){
        //     if(i < m){
        //         dp[i] = 1;
        //     } else if(i == m){
        //         dp[i] = 2;
        //     } else{
        //         dp[i] = dp[i - 1] + dp[i -m];
        //     }
        // }
        // System.out.println(dp[n]);
    }
}