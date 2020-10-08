import java.util.*;
public class IsGraphConnected{
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
    static void display(){
        for(int i=0;i<graph.size();i++){
            System.out.print(i + " - > ");
            for(Edge ed : graph.get(i)){
                System.out.print("[" + ed.v + "," + "],");
            }
            System.out.println();
        }
    }
    static void drawTree(ArrayList<ArrayList<Edge>>graph,int src,ArrayList <Integer> comp,boolean visited[]){
        visited[src] = true;
        comp.add(src);
        for(Edge ed : graph.get(src)){
             if(visited[ed.v] == false){
                drawTree(graph,ed.v,comp,visited);
             }
        }
       
     }
    public static void main(String[] args) {
        graph = new ArrayList<>();
        for(int i=0;i<7;i++){
            graph.add(new ArrayList<Edge>());
        }

       
        addEdge(0,1,10);
       
        addEdge(2,3,10);
      
        addEdge(4,5,10);
        addEdge(4,6,10);
        addEdge(5,6,10);
        ArrayList<ArrayList<Integer>> comps = new ArrayList<>();
       boolean visited[] = new boolean[7];
        for(int i=0;i<7;i++){
            if(visited[i] == false){
             ArrayList<Integer>comp = new ArrayList<>();
                drawTree(graph,i,comp,visited);
                comps.add(comp);
            }
        }
      System.out.println(comps.size() == 1);
        //display();

    }

}