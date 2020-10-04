import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
     Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();
     ArrayList<String> res = getStairPaths(n);
     System.out.println(res);
    
    }

    public static ArrayList<String> getStairPaths(int n) {
         
         if(n == 0){
             ArrayList<String> response = new ArrayList<>();
             response.add("");
             return response;
         }
         if(n < 0){
             ArrayList<String> response = new ArrayList<>();
             return response;
         }
         
         ArrayList<String> res1 = getStairPaths(n-1);
         ArrayList<String> res2 = getStairPaths(n-2);
         ArrayList<String> res3 = getStairPaths(n-3);
         
         ArrayList<String> res = new ArrayList<>();
         
         for(String val : res1){
             res.add(1 + val);
         }
          for(String val : res2){
             res.add(2 + val);
         }
          for(String val : res3){
             res.add(3 + val);
         }
         return res;
    }

}