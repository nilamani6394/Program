package com.controller;
class Nod{
	int key;
	Node left,right;
	
	
	 Nod(int item){
		item=key;
		left=right=null;
	}
}

public class BinaryTee {
        Node root;
        public BinaryTee(int key) {
			root = new Node(key);
		}
        public BinaryTee() {
			// TODO Auto-generated constructor stub
        	root=null;
		}
        public static void main(String[] args) {
			BinaryTee btree = new BinaryTee();
			btree.root= new Node(2);
			
			btree.root.left=new Node(3);
			btree.root.right=new Node(7);
			
			
			btree.root.left.left= new Node(5);
			btree.root.left.right= new Node(5);
			
			btree.root.right.right = new Node(8);
			
			
		}
}
