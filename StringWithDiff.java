import java.io.*;
import java.util.*;

public class Main {

	public static String solution(String str){
		// write your code here
		String s = str.charAt(0)+"";
		for(int i=1;i<str.length();i++){
		    char prev=str.charAt(i-1);
		    char curr=str.charAt(i);
		    int val=(int)(curr-prev);
		    s=s+val;
		    s=s+curr;
		}

		return s;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}

}