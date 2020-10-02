import java.util.*;
public class KLargestNumber{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int arr[] = {99,23,56,34,900,88};
        int k = scn.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < arr.length; i++){
            if(i < k){
                pq.add(arr[i]);
            }else{

                if(pq.peek() < arr[i]){
                    pq.remove();
                    pq.add(arr[i]);
                }
            }
        }
        System.out.println(pq.peek());
    }
}