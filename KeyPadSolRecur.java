import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        ArrayList<String> res = getKPC(s);
        System.out.println(res);
        

    }
   static String input[] = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static ArrayList<String> getKPC(String str) {
        
        if(str.length() == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rres = getKPC(ros);
        
        ArrayList<String> mres = new ArrayList<>();
        
        String mychar = input[ch - '0'];
        for(int i = 0 ; i < mychar.length(); i++){
            char ch1 = mychar.charAt(i);
            for(String val : rres){
                mres.add(ch1 + val);
            }
        }
        return mres;
        
    }

}