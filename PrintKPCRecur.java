import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
      Scanner scn = new Scanner(System.in);
      String s = scn.nextLine();
      printKPC(s,"");
    }
   static String input[] = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
   
   
    public static void printKPC(String ques, String ans) {
        
        if(ques.length() == 0){
            System.out.println(ans);
            return;
        }
        char ch = ques.charAt(0);
        String rom = ques.substring(1);
        String codesforch = input[ch - '0'];
        for(int i = 0 ; i<codesforch.length();i++){
             char cho = codesforch.charAt(i);
             printKPC(rom,ans+cho);
             
        }
       
        
    }

}