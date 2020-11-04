import java.io.*;
import java.util.*;

public class Main{

public static int fib(int n){
    
    if(n == 0 || n == 1){
        return n;
    }
    
    int fib1 = fib(n - 1);
    int fib2 = fib(n - 2);
    int fibo = fib1 + fib2;
    return fibo;
}
public static int fibMem(int n,int qb[]){
     if(n == 0 || n == 1){
        return n;
    }
    
    if(qb[n] != 0){
        return qb[n];
    }
    int fib1 = fibMem(n - 1,qb);
    int fib2 = fibMem(n - 2,qb);
    int fibo = fib1 + fib2;
    qb[n] = fibo;
    return fibo;
}
public static void main(String[] args) throws Exception {
   Scanner scn = new Scanner(System.in);
   int n = scn.nextInt();
   int p = fibMem(n,new int [n + 1]);
   System.out.println(p);
 }

}