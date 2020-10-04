import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
     Scanner scn = new Scanner(System.in);
     String str = scn.nextLine();
     printPermutations(str , "");
    }

    public static void printPermutations(String str,String psf) {
        if(str.length() == 0){
            System.out.println(psf);
            return;
        }
        
       for(int i = 0 ; i <str.length() ;i++){
           char ch = str.charAt(i);
           String lpart = str.substring(0,i);
           String rpart = str.substring(i+1);
           String roq = lpart+rpart;
           printPermutations(roq,psf+ch);
       } 
        
    }

}