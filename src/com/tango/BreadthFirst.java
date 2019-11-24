 package com.tango;

import java.util.Iterator;
import java.util.LinkedList;

class Graphh{
	 int Vertex;
	 LinkedList<Integer>adjlist[];
	 public Graphh(int v) {
		// TODO Auto-generated constructor stub
		 Vertex=v;
		 adjlist = new LinkedList[v];
		 for (int i = 0; i < v; i++) 
			adjlist[i]=new LinkedList();
	}
	 public void addEdge(int v,int w){
		 adjlist[v].add(w);
	 }
	 void BFS(int  s){
		 boolean visited[]= new boolean[Vertex];
		 //create queue for BFS
		 LinkedList<Integer>queue= new LinkedList<Integer>();
		 //mark the current node visited and enqueue it
		 visited[s]= true;
		 queue.add(s);
		 while (queue.size()!=0) {
			//Dequeue a vertex from queue and print it
			 s=queue.poll();
			 System.out.print(s+" ");
			 Iterator<Integer>itr=adjlist[s].listIterator();
			 while (itr.hasNext()) {
				int n=itr.next();
				if(!visited[n]){
					visited[n]=true;
					queue.add(n);
				}
			}
		}
	 }
 }

public class BreadthFirst {
	public static void main(String[] args) {
		Graphh g= new Graphh(4);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);
		
		System.out.println("Following is the breadthFirst traversal"
		       +"(starting from vertex 2)");
		  g.BFS(2);
	}

}
