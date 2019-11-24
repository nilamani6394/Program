package com.Programs;

import java.util.LinkedList;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

public class GraphReprsentation {
	
	static class GraphCo{
		int V;//Here V means 
		//graph can be represented with LinkedList and array
		LinkedList<Integer>adjlist[];
		public GraphCo(int V) {
			this.V =V; 
			//now assign value in vertex
			adjlist= new LinkedList[V];
			//create a new list for each vertex
			for (int i = 0; i < V; i++) {
				adjlist[i]=new LinkedList<>();
			}
		}
	}
	//Add an edge to a undirected graph
	static void addEdge(GraphCo graph,int src,int dest){
		//add an edge fron src to dest;
		graph.adjlist[src].add(dest);
		//science graph is undirected,add an edge from dest to src also
		graph.adjlist[dest].add(src);
	}
	//print graph edge
	static void PrintGraph(GraphCo graph){
		for (int v = 0; v <graph.V; v++) {
			System.out.println("Adjacentlist of vertex"+v);
			System.out.println("head");
			for (Integer pCrawl : graph.adjlist[v]) {
				System.out.print("->"+pCrawl);
			}
			System.out.println("\n");
		}
	}
	public static void main(String[] args) {
		int V=5;
		GraphCo grc = new GraphCo(V);
		addEdge(grc, 0, 1);
		addEdge(grc, 0, 4);
		addEdge(grc, 1, 2);
		addEdge(grc, 1, 3);
		addEdge(grc, 1, 4);
		addEdge(grc, 2, 3);
		addEdge(grc, 2, 4);
		// TODO Auto-generated method stub
       PrintGraph(grc);
	}

}
