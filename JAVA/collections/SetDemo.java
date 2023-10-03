package com.collections;

import java.util.*;

public class SetDemo {

	public static void main(String[] args) {
		LinkedHashSet<Integer> s1=new LinkedHashSet<Integer>();
		s1.add(30);
		s1.add(40);
		s1.add(21);
		s1.add(05);
		s1.add(07);
		System.out.println("LinkedHashSet :"+s1);//It maintains the insertion order
		//Collections.sort(s1);//CTE-can't directly sort
		//sort using ArrayList Treeset
		//convert LinkedHashSet to Arraylist
		ArrayList<Integer>arr=new ArrayList<Integer>(s1);
		//Sort all
		Collections.sort(arr);
		System.out.println("After sorting:" +arr);
		
        
	}

}/*
*LinkedHashSet:
*Unique elements only like hashtable
*permits null elements
*doubly linked list
*
**/
