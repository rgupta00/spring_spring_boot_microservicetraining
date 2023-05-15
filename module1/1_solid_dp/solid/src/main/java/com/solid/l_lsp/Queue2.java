package com.solid.l_lsp;

import java.util.LinkedList;

//FIFO
public class Queue2 extends LinkedList<String>{

	public Queue2() {
	}
	
	//use LinkedList to create the behaviour for Queue
	public void addFirst(String data) {
		super.addFirst(data);
	}
}
