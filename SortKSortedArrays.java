import java.io.*;
import java.util.*;

public class Main {

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      int[] arr = new int[n];

      for (int i = 0; i < n; i++) {
         arr[i] = Integer.parseInt(br.readLine());
      }

      int k = Integer.parseInt(br.readLine());
      // write your code here
      Arrays.sort(arr);
       HashMap<Integer,Integer> hm = new HashMap<>();
        
        for(int val : arr){
            if(!hm.containsKey(val)){
                System.out.println(val);
            }
            hm.put(val,1);
        }

      
   }

}