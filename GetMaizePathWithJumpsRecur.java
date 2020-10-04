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
            ArrayList<String> ans =  new ArrayList<>();
            ans.add("");
            return ans;
       }
       
       
       
       ArrayList<String> res =  new ArrayList<>();
        
        //horizontal path
       for(int i = 1 ;i <= dc -sc ;i++){
           ArrayList<String> hpaths = getMazePaths(sr,sc+i,dr,dc);
           for(String hpath : hpaths){
               res.add("h" + i + hpath);
               
           }
       }
       
       
       
       
       //vertical path
       for(int i = 1 ;i <= dr -sr ;i++){
           ArrayList<String> vpaths = getMazePaths(sr+i,sc,dr,dc);
           for(String vpath : vpaths){
               res.add("v" + i + vpath);
               
           }
       }
       
       
       //diagonal path
       
       for(int i = 1 ;i <= dc -sc && i <=dr - sr ;i++){
           ArrayList<String> dpaths = getMazePaths(sr+i,sc+i,dr,dc);
           for(String dpath : dpaths){
               res.add("d" + i + dpath);
               
           }
       }
       return res;
    }

}