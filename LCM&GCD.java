import java.util.*;
    
    public class Main{
    public static int GCD(int a,int b){
        if(a==b){
            return a;
        }else if(a>b){
           return  GCD(a-b,b);
        }else
        return GCD(a,b-a);
    }
    public static void main(String[] args) {
      // write your code here  
      Scanner scn= new Scanner(System.in);
      int x = scn.nextInt();
      int y = scn.nextInt();
      int on1 = x;
      int on2 = y;
      int LCM = on1*on2/GCD(on1,on2);
     System.out.println(GCD(x,y));
     System.out.println(LCM);
     
     
     }
    }