import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int k = scn.nextInt();
      long ii = k * 1;
      long ij = k * (k - 1);
      long t = ii + ij;
      for(int j = 3; j <= n; j++){
           ii = ij * 1;
           ij = t * (k - 1);
           t = ii + ij;
      }
      System.out.println(t);
    }
}