package cracking;
// @author sakshi
// Create a graph using adjacency list and find whether a node is reachable from another node
import java.util.Iterator;
import java.util.LinkedList;

public class Graph 
{
    int V;
    LinkedList<Integer> adj[];

    Graph(int v) 
    {
        V = v;
        adj = new LinkedList[v];
        for(int i=0;i<v;i++)
            adj[i] = new LinkedList();
    }
    void addEdge(int v, int w)
    {
        adj[v].add(w);
    }
    boolean isReachable(int s,int d)
    {
        boolean []visited = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<>();
        visited[s] = true;
        queue.add(s);
        Iterator<Integer> i;
        while(!queue.isEmpty())
        {
            int n;
            s = queue.poll();
            i = adj[s].listIterator();
            while(i.hasNext())
            {
                n = i.next();
                if(n == d)
                {
                    return true;
                }
                if(!visited[n])
                {
                    visited[n] = true;
                    queue.add(n);
                }
                
            }
        }
        return false;
    }
    
    public static void main(String args[])
    {
        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        if(g.isReachable(0, 3))
            System.out.println("Reachable");
        else
            System.out.println("Not reachable");
    }
    
}
