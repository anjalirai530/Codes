import java.io.*;
import java.util.*;

public class Main {

	public static String compression1(String str){
		// write your code here
		String s = str.charAt(0)+"";
		for(int i=1;i<str.length();i++){
		    char prev = str.charAt(i-1);
		    char curr = str.charAt(i);
		    if(curr != prev){
		        s=s+curr;
		    }
		}

		return s;
	}

	public static String compression2(String str){
		// write your code here
		int count=1;
		String s = str.charAt(0)+"";
		for(int i=1;i<str.length();i++){
		    char prev = str.charAt(i-1);
		    char curr = str.charAt(i);
		    if(curr == prev){
		       count++;
		    }else{
		        if(count>1){
		            s=s+count;
		            count=1;
		        }
		        s=s+curr;
		    }
		}
                  if(count>1){
		            s=s+count;
		            count=1;
		        }
		return s;

		
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}