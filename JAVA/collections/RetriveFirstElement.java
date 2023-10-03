package com.collections;
import java.util.*;

public class RetriveFirstElement {

	public static void main(String[] args) {
		LinkedList<Integer> l1=new LinkedList<Integer>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		l1.add(6);
		l1.add(7);
		l1.add(8);
		l1.add(9);
		l1.add(10);
		
		System.out.println(l1);
		
		Integer Firstelement = l1.getFirst();
		System.out.println();
		System.out.println(Firstelement);

	}

}
