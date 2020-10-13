import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
     // write your code here  
     Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();
     int r=scn.nextInt();
     int temp=n;
     int count=0;
     while(temp!=0){
         temp=temp/10;
         count++;
     }
      r=r%count;
      if(r<0){
          r=r+count;
      }
     int mul=1,div=1;
     for(int i=1;i<=count;i++){
         if(i<=r){
             div=div*10;
         }else{
             mul=mul*10;
         }
     }
     int rem = n%div;
     int qu = n/div;
     int ans = rem*mul + qu;
     System.out.println(ans);
     
     
    }
   }