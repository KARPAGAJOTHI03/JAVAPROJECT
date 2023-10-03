package com.collections;
import java.util.*;


public class Set {
	
	static void addElement(HashSet<Integer> s1)
	{
		s1.add(30);
		s1.add(40);
		s1.add(21);
		s1.add(05);
		s1.add(07);
		System.out.println(s1.add(30));//returns false no duplicates are allowed.
	}

	
	public static void main(String[] args) {
		
		HashSet<Integer> s1=new HashSet<Integer>();
		addElement(s1);
		System.out.println(s1);
	}

}

/**Set:
 * No duplicates are allowed in Set.
 * Since set is an interface, we cannot creates objects of it.
 * To access the functionalities of set, we need a class.
 * Here, HashSet,LinkedHashSet 
 * Hashing-Hash table(best approach for search operation)
 *LinkedHash set-uses doubly linked list(list duplicates are allowed)
 *
 But in Set if you want to order the set, Sorted set which is subinterface for set
 sortedset->Navigable
 */