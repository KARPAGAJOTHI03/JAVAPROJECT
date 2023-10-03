package com.setoperations;
import java.util.*;

public class SetOperations {

	public static void main(String[] args) {
		//Declaring two sets
		Set<Integer> set1=new HashSet<Integer>();
		Set<Integer> set2=new HashSet<Integer>();
		
	    //Adding elements into the set1
		set1.add(100);
		set1.add(200);
		set1.add(300);
		set1.add(400);
		set1.add(500);
		
		//Adding elements into the set2
		set2.add(500);
		set2.add(600);
		set2.add(700);
		set2.add(800);
		set2.add(900);
		
		//Union
		Set<Integer> union=new HashSet<Integer>(set1);
		union.addAll(set2);
		System.out.println("The Union of two sets are:"+union);
		
		//Intersection
		Set<Integer> intersection=new HashSet<Integer>(set1);
		intersection.retainAll(set2);
		System.out.println("The Intersection of two sets are:"+intersection);
		
		//Difference
		Set<Integer> difference=new HashSet<Integer>(set1);
		difference.removeAll(set2);
		System.out.println("The Difference of two sets are:"+difference);

	}

}
/*
 * addAll()-union
 * addRetain()-intersection
 * removeAll()-difference*/
