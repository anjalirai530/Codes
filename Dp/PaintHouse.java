import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[][] = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        long ored = arr[0][0];
        long oblue = arr[0][1];
        long ogreen = arr[0][2];

        for (int i = 1; i < arr.length; i++) {
                long nred = Math.min(oblue, ogreen) + arr[i][0];
                long nblue = Math.min(ored, ogreen) + arr[i][1];
                long ngreen = Math.min(ored, oblue) + arr[i][2];

                ored = nred;
                oblue = nblue;
                ogreen = ngreen;
            
        }
        long res = Math.min(ored, Math.min(oblue, ogreen));
        System.out.println(res);


    }
}