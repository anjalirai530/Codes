
import java.util.*;
public class Main
{
    public static int fact(int n){
        if(n==0){
            return 1;
        }else{
            return fact(n-1)*n;
        }
    }
    public static int meas(int n,int r){
        return (fact(n)/(fact(n-r)*fact(r)));
    }
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int k=0,r=0;
		int lines = scn.nextInt();
		for(int i=1;i<=lines;i++){
		     k=1;
		      r=0;
		    for(int j=1;j<=2*lines-1;j++){
		        if(j>=lines+1-i && j<=lines-1+i && k ==1){
		           System.out.print(meas(i-1,r));
		           r++;
		           k=0;
		        }else{
		            System.out.print(" ");
		            k=1;
		        }
		    }
		    System.out.println();
		}
		}
}
