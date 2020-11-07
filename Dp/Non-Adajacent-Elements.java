import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        
        int osel = arr[0];
        int orej = 0;
        
        for(int i = 1; i < n; i++){
            int nsel = orej + arr[i];
            int nrej = Math.max(osel , orej);
            
            osel = nsel;
            orej = nrej;
        }
        System.out.println(Math.max(osel , orej));

    }
}