import java.util.*;
public class PrintPath{
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
   static void hasPath(ArrayList<ArrayList<Edge>> graph,int src,int dest,boolean visited[],String psf){
       if(src == dest){
           System.out.println(psf);
       }
       visited[src] = true;
       for(Edge ed : graph.get(src)){
           if(visited[ed.v] == false){
              hasPath(graph,ed.v,dest,visited,psf+ed.v);
           }

           
       }
       visited[src] = false;
   }
    public static void main(String[] args) {
        graph = new ArrayList<>();
        for(int i = 0;i<7;i++){
            graph.add(new ArrayList<Edge>());
        }
        addEdge(0,1,2);
        addEdge(0,3,3);
        addEdge(1,2,4);
        addEdge(2,3,5);
        addEdge(3,4,6);
        addEdge(4,5,2);
        addEdge(4,6,1);
        addEdge(5,6,3);
        boolean [] visited = new boolean[7];
       hasPath(graph,0,6,visited,0+"");
    }
}