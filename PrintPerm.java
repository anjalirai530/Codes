import java.io.*;
import java.util.*;

public class Main {

	public static void solution(String str){
		// write your code here
		int len = str.length();
		int fact = Fact(len);
		for(int i=0;i<fact;i++){
		    StringBuilder sb = new StringBuilder(str);
		    int temp = i;
		    for(int j = len;j>=1;j--){
		        int quot = temp/j;
		        int rem = temp%j;
		        System.out.print(sb.charAt(rem));
		        sb.deleteCharAt(rem);
		        temp=quot;
		    }
		    System.out.println();
		}
		
	}
		public static int Fact(int n){
	    if(n==0){
	        return 1;
	    }else
	    return Fact(n-1)*n;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}