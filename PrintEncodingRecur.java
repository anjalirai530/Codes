import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        printEncodings(s,"");
        

    }

    public static void printEncodings(String str,String psf) {
        
        if(str.length() == 0){
            System.out.println(psf);
            return;
        }else if(str.length() == 1){
            char ch = str.charAt(0);
            if(ch == '0'){
                return;
            }else{
                int res = ch - '0';
                char out = (char)('a' + res - 1);
                psf = psf + out;
                System.out.println(psf);
            }
        }else{
            char ch1 = str.charAt(0);
            String roq = str.substring(1);
            if(ch1 == '0'){
                return;
            }else{
                int res = ch1 - '0';
                char out = (char)('a' + res - 1);
               printEncodings(roq,psf+out);
            }
            String st1 = str.substring(0,2);
            String st2 = str.substring(2);
            
            int st1v = Integer.parseInt(st1);
            
            if(st1v <= 26){
                 char code = (char)('a' + st1v - 1);
                 printEncodings(st2,psf+code);
            }
            
        }
        
    }

}