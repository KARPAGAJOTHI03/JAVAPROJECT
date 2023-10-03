package com.collections;

import java.util.*;

public class Palindrome {
	public static void main(String [] args)
	{
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		System.out.println(list);
		list.poll();
		list.remove();
		list.removeFirst();
		System.out.println(list);
		list.pollLast();
		list.removeLast();
		System.out.println(list);
		
	}
	

}
