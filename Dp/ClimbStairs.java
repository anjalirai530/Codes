import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
    
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans = tab(n);
        System.out.println(ans);
        
    }
    public static int climbStairs(int n,int qb[]){
        if(n == 0){
            return 1;
        } else if(n < 0){
            return 0;
        }
        if(qb[n] != 0){
            return qb[n];
        }
        int t1 = climbStairs(n - 1,qb);
        int t2 = climbStairs(n - 2,qb);
        int t3 = climbStairs(n - 3,qb);
        int res = t1 + t2 + t3;
        qb[n] = res;
        return res;
        
    }
    public static int climbPath(int n){
        if(n == 0){
            return 1;
        } else if(n < 0){
            return 0;
        }
        
        
        int t1 = climbPath(n - 1);
        int t2 = climbPath(n - 2);
        int t3 = climbPath(n - 3);
        int res = t1 + t2 + t3;
        return res;
    }
    public static int tab(int n){
        int dp[] = new int[n + 1];
        dp[0] = 1;
        
        for(int i = 1; i <= n; i++){
            if(i == 1){
                dp[i] = dp[i - 1];
            } else if(i == 2){
                dp[i] = dp[i - 1] + dp[i -2];
            } else{
                dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
            }
         }
         
         return dp[n];
    }

}