package com.collections;
import java.util.*;

public class QueueExample {

	public static void main(String[] args) {
		LinkedList<String>q1=new LinkedList<String>();
		q1.add("a");
		q1.add("b");
		q1.add("c");
		q1.add("d");
		System.out.println(q1);
		
		while(!q1.isEmpty()) {
			String element=q1.poll();
			System.out.println(element+""+element+"");
			
		}
		
		System.out.println(q1);

	}

}
