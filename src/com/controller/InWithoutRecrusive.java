package com.controller;

import java.util.Stack;

class Belgrade{
	int key;
	Node left,right;
	
	public Belgrade(int item) {
		// TODO Auto-generated constructor stub
		item=key;
		left=right=null;
	}
}

public class InWithoutRecrusive {
 Node root;
   void Inorder(){
	   if(root==null)
		   return;
	   Stack<Node>str = new Stack<>();
	   Node cur = root;
	   while (cur != null || str.size() > 0) {
		while (cur !=null) {
			cur=str.push(cur);
			cur=cur.left;
		}
		cur=str.pop();
		System.out.print(cur.key+" ");
		
		cur=cur.right;
	}
   }
	public static void main(String[] args) {
		InWithoutRecrusive icr= new InWithoutRecrusive();
		icr.root= new Node(5);
		icr.root.left=new Node(4);
		icr.root.right=new Node(6);
		icr.root.left.left=new Node(7);
		icr.root.right.right=new Node(8);
	    System.out.println("Inorder elements are this  ");
		icr.Inorder();
		// TODO Auto-generated method stub

	}

}
