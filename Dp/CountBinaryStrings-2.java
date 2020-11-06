import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ocz = 1;
        int oco = 1;
        for (int i = 2; i <= n; i++) {
            int ncz = oco;
            int nco = ocz + oco;
            
            ocz = ncz;
            oco = nco;
        }
        System.out.println(ocz+oco);
    }

}