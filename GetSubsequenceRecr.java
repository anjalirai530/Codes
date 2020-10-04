import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
           Scanner scn = new Scanner(System.in);
           String str = scn.nextLine();
           ArrayList<String> res = gss(str);
           System.out.println(res);
    }

    public static ArrayList<String> gss(String str) {
        
        if(str.length() == 0){
            ArrayList<String> gd = new ArrayList<>();
            gd.add("");
            return gd;
        }
        
        char ch = str.charAt(0);
        String s = str.substring(1);
        ArrayList<String> Res = gss(s);
        
        ArrayList<String> Out = new ArrayList<>();
        
        for(String cal : Res){
            Out.add("" + cal);
        }
        for(String cal : Res){
            Out.add(ch + cal);
        }
        return Out;
    }

}