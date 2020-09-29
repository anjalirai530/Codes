import java.util.*;

public class FloodFill{

public static void floodFill(int [][]arr,int rows,int cols,String psf,boolean visited[][])
{
    
    if(rows < 0 || cols < 0 || rows == arr.length  || cols ==arr[0].length || arr[rows][cols] == 1 || visited[rows][cols] == true)
        {
            return;
        } 
    if(rows == arr.length-1 && cols == arr[0].length-1)
    {
        System.out.println(psf);
        return;
    }
    
    visited[rows][cols] = true;
    floodFill(arr,rows-1,cols,psf + " t ",visited);
    floodFill(arr,rows,cols-1,psf + " l ",visited);
    floodFill(arr,rows+1,cols,psf + " d ",visited);
    floodFill(arr,rows,cols+1,psf + " r ",visited);
    visited[rows][cols] = false;


}


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();
        int arr[][] = new int[m][n];
        for(int i = 0; i <arr.length; i++ )
        {
            for(int j = 0;j < arr[0].length;j++)
            {
                  arr[i][j] = scn.nextInt();
            }
        }
        boolean visited[][] = new boolean[m][n];
        floodFill(arr,0,0,"",visited);
        
    }
}