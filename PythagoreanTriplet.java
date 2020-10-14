import java.util.*;
  
  public class Main{
  public static int Max(int a,int b,int c){
      if(a>b && a>c)
      return a;
      else if(b>c && b>a)
      return b;
      else
      return c;
  }
  public static void main(String[] args) {
    // write your code here 
    Scanner scn = new Scanner(System.in);
    int a = scn.nextInt();
    int b = scn.nextInt();
    int c = scn.nextInt();
     if(Max(a,b,c) == a){
         if(a*a == b*b + c*c){
             System.out.println("true");
             return;
         }
     }if(Max(a,b,c) == b){
         if(b*b == (a*a + c*c)){
             System.out.println("true");
             return;
         }
     }if(Max(a,b,c) == c){
         if(c*c == (a*a + b*b)){
             System.out.println("true");
             return;
         }
     }else{
         System.out.println("false");
         return;
     }
   }
  }