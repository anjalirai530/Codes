import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        long n = scn.nextInt();
        long osv = 1;
        long obv = 1;
        for (int i = 2; i <= n; i++) {
            long nsv = obv + osv;
            long nbv = osv;
            
            osv = nsv;
            obv = nbv;
        }
        long res = osv + obv;
        res = res*res;
        System.out.println(res);
    }

}