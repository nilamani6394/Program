package com.tango;

import java.awt.PrintGraphics;
import java.util.LinkedList;
import java.util.List;

 class Graph{
	int V;
	List<Integer> adjlist[];
	
	public Graph(int V) {
		// TODO Auto-generated constructor stub
	   this.V=V;
	   //Now pass the value into list
	   adjlist=new LinkedList[V];
	   //now provide memory for each vertex
	   for (int i = 0; i < V; i++) {
		adjlist[i]=new LinkedList<>();
	}
	}
	static void addEdge(Graph grp,int src,int dest){
		grp.adjlist[src].add(dest);
		grp.adjlist[dest].add(src);
	}
	//now print the graph
	static void GraphPriny(Graph graph){
		for (int v = 0; v < graph.V; v++) {
			System.out.println("Adjcent matrix is :" +v);
			System.out.println("head");
			for (Integer element : graph.adjlist[v]) {
				System.out.print("->"+element);
			}
			System.out.println("\n");
		}
	}
}
public class AdjcentGraph {
	public static void main(String[] args) {
		int V = 5;
		Graph gg= new Graph(V);
		gg.addEdge(gg, 0, 1);
		gg.addEdge(gg, 2, 1);
		gg.addEdge(gg, 2, 3);
		gg.addEdge(gg, 0, 2);
		gg.addEdge(gg, 4, 3);
		
	
	}

}
