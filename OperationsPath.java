import java.util.*;
public class OperationsPath{
    static ArrayList<ArrayList<Edge>>graph;
    static class Edge{
        int v;
        int wt;
      
        Edge(int v,int wt){
            this.v = v;
            this.wt=wt;
        }
    }
    static void addEdge(int u,int v,int wt){
      graph.get(u).add(new Edge(v,wt));
      graph.get(v).add(new Edge(u,wt));
    }
    void display(){
        for(int i = 0;i<graph.size();i++){
            System.out.print(i+"->");
            for(Edge ed : graph.get(i)){
                System.out.print("[" + ed.v + "," + ed.wt + "],");
            }
            System.out.println();
        }
    }
   static String spath ;
    static   int spathwt = Integer.MAX_VALUE;
    static String lpath;
    static int lpathwt = Integer.MIN_VALUE;
    static   int cpathwt = Integer.MAX_VALUE;
    static int fpathwt = Integer.MIN_VALUE;
    static PriorityQueue<Integer> pq = new PriorityQueue<>();
   static void hasPath(ArrayList<ArrayList<Edge>> graph,int src,int dest,boolean visited[],String psf,int wsf,int k,int comp){
       

    if(src == dest){
 //2.Opeartion - 2 [ smallest Weight  So Far]
        if(wsf < spathwt){
           spathwt = wsf;
           spath = psf; 
           //System.out.println(spath + " " + " -> "  + spathwt);
        }
        //3.Opeartion - 3 [ largest Weight  So Far]
        if(wsf > lpathwt){
            lpathwt=wsf;
            lpath = psf;
        }
        //4.Opeartion - 4 [ ceil value of k]
        if(wsf > k && wsf < cpathwt){
            cpathwt = wsf;
        }
         //5.Opeartion - 5[ floor value of k]
         if(wsf < k && wsf > fpathwt){
            fpathwt = wsf;
        }
        if(pq.size() < comp){
            pq.add(wsf);
        }else{
            if(wsf > pq.peek()){
                pq.remove();
                pq.add(wsf);
            }
        }


        return;
        //1.Opeartion - 1 [ Weight So Far]
           //System.out.println(psf + " " + " -> "  + wsf);
       }
       visited[src] = true;
       for(Edge ed : graph.get(src)){
           if(visited[ed.v] == false){
              hasPath(graph,ed.v,dest,visited,psf+ed.v,wsf+ed.wt,k,comp);
           }

           
       }
       visited[src] = false;
   }
    public static void main(String[] args) {
        graph = new ArrayList<>();
        for(int i = 0;i<7;i++){ 
            graph.add(new ArrayList<Edge>());
        }
        addEdge(0,1,10);
        addEdge(0,3,10);
        addEdge(1,2,10);
        addEdge(2,3,40);
        addEdge(3,4,2);
        addEdge(4,5,3);
        addEdge(4,6,3);
        addEdge(5,6,8);
        boolean [] visited = new boolean[7];
        
       hasPath(graph,0,6,visited,"",0,20,3);
    System.out.println(spath + " " + " -> "  + spathwt);
    System.out.println(lpath + " " + " -> "  + lpathwt);
    System.out.println( cpathwt);
    System.out.println( fpathwt);
    System.out.println( pq.peek());

    }
}