import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
    
        int arr[][] = new int[m][m];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0 ; j < arr[0].length;j++){
                arr[i][j] = scn.nextInt();
            }
        }
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr[0].length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        
        
         for(int i = 0; i < arr.length; i++){
             int si = 0;
             int ei = arr.length -1;
           while(si < ei){
                int temp = arr[i][si];
                arr[i][si] = arr[i][ei];
                arr[i][ei] = temp;
                si++;
                ei--;
            }
        }
        display(arr);
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}