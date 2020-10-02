import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        HashMap<Character,Integer> hm = new HashMap<>();
        
        for(int i = 0; i< str.length() ; i++){
            char ch  = str.charAt(i);
            if(hm.containsKey(ch)){
                int oldf = hm.get(ch);
                int newf = oldf + 1;
                hm.put(ch,newf);
            }else{
                hm.put(ch,1);
            }
        }
        
        char hfc = str.charAt(0);
        for(Character key : hm.keySet()){
            if(hm.get(key) > hm.get(hfc)){
                hfc = key;
           }
        }
        System.out.println(hfc);
        // write your code here
    }

}