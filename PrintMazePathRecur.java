import java.io.*;
	import java.util.*;

	public class Main {

	    public static void main(String[] args) throws Exception {
               Scanner scn = new Scanner(System.in);
               int n = scn.nextInt();
               int m = scn.nextInt();
               printMazePaths(1,1,n,m,"");
	    }

	    // sr - source row
	    // sc - source column
	    // dr - destination row
	    // dc - destination column
	    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
	        
	        if(sr == dr && sc == dc){
	            System.out.println(psf);
	            return;
	        }
	        if(sr < dr){
	            printMazePaths(sr+1,sc,dr,dc,"v"+psf);
	        }
	        if(sc < dc){
	            printMazePaths(sr,sc+1,dr,dc,"h"+psf);
	        }
	        
	        
	    }

	}