package com.collections;

import java.util.LinkedList;

public class Demo1 {

	public static void main(String[] args) {
		LinkedList<Integer> stack=new LinkedList<Integer>();
		stack.add(100);
		stack.add(200);
		stack.add(300);
		stack.add(400);
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		

	}

}
