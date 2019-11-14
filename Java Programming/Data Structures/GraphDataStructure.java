import java.util.*;
import java.util.LinkedList;

class GraphDataStructure{
	static class Graph{
		int vertices;
		LinkedList<Integer> adjacentListArray[];

		Graph(int v){
			vertices=v;
			adjacentListArray =new LinkedList[vertices];
			for(int i=0;i<vertices;i++){
				adjacentListArray[i]=new LinkedList<Integer>();
			}
		}
	}
	void addEdge(Graph graph,int src,int dest){
		graph.adjacentListArray[src].add(dest);
		graph.adjacentListArray[dest].add(src);
	}
	void printGraph(Graph graph){

		for(int v=0;v<graph.vertices;v++){
			int p=0;
			for(Integer i : graph.adjacentListArray[v]){
				if(p++==0)
					System.out.println("\nAdjacent list of vertex\t"+v);
				System.out.print(" -> "+i);
			}
		}
	}
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);

		System.out.println("Enter the graph size ");
		Graph g=new Graph(in.nextInt());

		GraphDataStructure ob=new GraphDataStructure();
		System.out.println("Enter the edge from DESTINATION to SOURCE -1 to exit");
		ob.addEdge(g,in.nextInt(),in.nextInt());
		while(!in.hasNext("-1")){
			ob.addEdge(g,in.nextInt(),in.nextInt());
		}
		ob.printGraph(g);


	}
}