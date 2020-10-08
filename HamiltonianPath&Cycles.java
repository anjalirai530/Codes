import java.util.*;
public class Hamil{
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
   public static void  hamiltonian(ArrayList<ArrayList<Edge>>graph,int src,HashSet<Integer> visited ,String psf,int osrc){
      
    if(visited.size() == graph.size() -1){
        System.out.print(psf);
       boolean cycleFound = false;
       for(Edge ed: graph.get(src)){
           if(ed.v == osrc){
            cycleFound = true;
            break;
           }
           
       }
       if(cycleFound == true){
        System.out.println("*");
       }else{
        System.out.println(".");
       }

        return;
    }
    
    
    visited.add(src);
       for(Edge ed : graph.get(src)){
           if(visited.contains(ed.v) == false){
            hamiltonian(graph,ed.v,visited,psf+ed.v,osrc);
           }
       }
       visited.remove(src);
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
        addEdge(2,5,5);
        addEdge(3,4,6);
        addEdge(4,5,2);
        addEdge(4,6,1);
        addEdge(5,6,3);
        
        HashSet<Integer> visited = new HashSet<>();

        hamiltonian(graph,0,visited,0+"",0);
    }
}