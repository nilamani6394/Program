package com.controller;
class BinNode{
	int key;
	Node left,right;
	
	public BinNode(int item) {
		// TODO Auto-generated constructor stub
		key=item;
		left=right=null;
	}
}

public class Traversal {
	Node root;
	public Traversal() {
		// TODO Auto-generated constructor stub
		root =null;
	}
	void printPostorder(Node node){
		if(node == null)
		return ;
		
		printPostorder(node.left);
			
		printPostorder(node.right);
		System.out.print(node.key+" ");
		//printPostorder(node.key+" ");
	}
 void printInorder(Node node){
	 if(node==null)
		 return;
	 
	 printInorder(node.left);
	 
	 System.out.print(node.key+" ");
	 printInorder(node.right);
 }
 void printPreoerder(Node node){
	 if(node==null)
		 return;
	  System.out.print(node.key+" ");
	  printPreoerder(node.left);
	  printPreoerder(node.right);
 }
 //pront the data
 void printPostorder(){printPostorder(root);} 
 void printInorder(){printInorder(root);}
 void printPreoerder(){printPreoerder(root);}
  
 public static void main(String[] args) {
	 Traversal trs = new Traversal();
	 trs.root= new Node(1);
	 trs.root.left=new Node(2);
	 trs.root.right=new Node(3);
	 trs.root.left.left=new Node(4);
	 trs.root.right.right=new Node(5);
	
	 
	 System.out.println("Inorder traversal root elemnts are");
	 trs.printInorder();
	 
	 System.out.println("Preorder traversal elements are");
	 trs.printPreoerder();
	 
	 System.out.println("Postorder traversal elements are");
	 trs.printPostorder();
}

}
