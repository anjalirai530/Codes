import java.util.*;
public class MinJumps{
    public static int minJumps(int arr[]){
        int jumps[] = new int[arr.length];
        
        for(int i = 0;i < arr.length;i++){
            jumps[i] = Integer.MAX_VALUE;
        }
        jumps[0] = 0;
       for(int i = 0; i <arr.length-1 ; i++){
           for(int j = i +1 ; j <= i+arr[i] && j < arr.length ; j++){
               jumps[j] = Math.min(1 + jumps[i] , jumps[j]);
           }
       }

       return jumps[arr.length -1];


    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =  scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
    System.out.println(minJumps(arr));
    }
}