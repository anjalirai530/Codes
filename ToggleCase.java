import java.io.*;
import java.util.*;

public class Main {

	public static String toggleCase(String str){
		//write your code here
		StringBuilder sb= new StringBuilder(str);
		for(int i=0;i<str.length();i++){
		    if(str.charAt(i)>='a' && str.charAt(i)<='z'){
		       char upc = (char)(str.charAt(i)-32);
		       sb.setCharAt(i,upc);
		    }else if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
		       char lc = (char)(str.charAt(i)+32);
		       sb.setCharAt(i,lc);
		    }
		}

		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}

}