package com.controller;

import java.util.ArrayList;

class Trie{
  char content;
  boolean isEnd;
  int count;
  ArrayList<Trie>alty;
  
  
  public Trie(char c){
	  alty=new ArrayList<>();
	  isEnd=false;
	  content =c;
	  count =0;
  }
  public Trie subNode(char c){
	  if (alty !=null) {
      for (Trie trierac : alty) {
		if(trierac.content==c)
			return trierac;
	}		
	}
	return null;
  }
}

public class CURD {
	

}
