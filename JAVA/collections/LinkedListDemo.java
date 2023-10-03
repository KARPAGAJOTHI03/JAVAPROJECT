/**
 * 
 */
package com.collections;
import java.util.*;
public class LinkedListDemo {
	public static void main(String [] args)
	{
		LinkedList<Integer> l1=new LinkedList<Integer>();
		l1.add(18);
		l1.add(19);
		l1.add(20);
		l1.add(21);
		l1.add(22);
		l1.addFirst(5);
		l1.add(3,23);
		l1.addLast(30);
		l1.add(35);
		System.out.println("LinkedList is :"+l1);
		
	}

}
