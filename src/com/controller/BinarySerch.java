package com.controller;

public class BinarySerch {
	Node root;
	BinarySerch(){
		root=null;
		
	}
	void insert(int key){
		root= insertRec(root,key);
	}
	 Node insertRec(Node root, int key) {
		// TODO Auto-generated method stub
		//if tree ius empty return new node
		if(root==null){
			root= new Node(key);
			return root;
		}
		//if root is greter than key
		if(key <root.key){
			root.left=insertRec(root.left, key);
		}else if (key > root.key) {
			root.right= insertRec(root.right, key);
		}
		return root;
	}
	 void deleteKey(int key){
		 root=deleteRec(root,key);
	 }
	 Node deleteRec(Node root, int key) {
		// TODO Auto-generated method stub
		 //Chek whethere tree is epmpy or full
		 if(root== null){
			 return root;
		 }else if (key <root.key) {
			 root.left=deleteRec(root.left, key);
		}else if (key > root.key) {
			root.right=deleteRec(root.right, key);
		}
		 //check whether there is no left or right child
		 else {
			 if (root.left==null) 
				return root.right;
			else if (root.right==null) 
				return root.left;
				
				root.key = minValue(root.right);
				//delete inorder Succesor
				root.right=deleteRec(root.right, key);
			}
			 return root;	
		}
	
  int minValue(Node root) {
		// TODO Auto-generated method stub
	  int minval=root.key;
	  while (root.left!=null) {
		minval=root.left.key;
		root=root.left;
	}
		return minval;
	}
  void inorder() 
  { 
      inorderRec(root); 
  } 

  // A utility function to do inorder traversal of BST 
  void inorderRec(Node root) 
  { 
      if (root != null) 
      { 
          inorderRec(root.left); 
          System.out.print(root.key + " "); 
          inorderRec(root.right); 
      } 
  } 
	public static void main(String[] args) {
		
		BinarySerch bs = new  BinarySerch();
		bs.insert(15);
		bs.insert(5);
		bs.insert(17);
		bs.insert(2);
		System.out.println("Inorder traversal Elements are");
		bs.inorder();
	}

}
