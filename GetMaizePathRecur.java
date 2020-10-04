import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
         Scanner scn = new Scanner(System.in);
         int n = scn.nextInt();
         int m = scn.nextInt();
         ArrayList<String> res = getMazePaths(1,1,n,m);
         System.out.println(res);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        
        
        if(sr == dr && sc == dc){
          ArrayList<String> ans = new ArrayList<>();
          ans.add("");
          return ans;
        }
      
        
        ArrayList<String> res1 = new ArrayList<>();
        ArrayList<String> res2 = new ArrayList<>();
        ArrayList<String> res = new ArrayList<>();

        if(sr < dr){
          res1 = getMazePaths(sr+1,sc,dr,dc);
        }
        if(sc < dc){
            res2 = getMazePaths(sr,sc+1,dr,dc);
        }
        
        
        for(String val : res2){
            res.add("h" + val);
        }
        for(String val : res1){
            res.add("v" + val);
        }
        return res;
    }

}