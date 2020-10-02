import java.io.*;
import java.util.*;
public class PQ{
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // Collections.reverseOrder() ----> To Print In Reverse Order
        int  rank[] = {22,99,3,11,88,4,1};
        for(int val : rank){
            pq.add(val);
        }
        while(pq.size() > 0){
            System.out.println(pq.peek());
            pq.remove();
        }
        
    }
}