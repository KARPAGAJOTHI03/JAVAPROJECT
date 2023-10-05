package com.map;

import java.util.*;

public class MapDemo {

	public static void main(String[] args) {
		Map m=new HashMap();
		
		//Adding elements
		
        m.put(101,"Aathi");
        m.put(102,"Banu");
        m.put(103,"Chandru");
        System.out.println(m);
        
        //Traverse the Map
        Set set=m.entrySet();
        Iterator it=set.iterator();
        while(it.hasNext())
        {
        	Map.Entry entry=(Map.Entry)it.next();
        	System.out.println(entry.getKey()+" - "+entry.getValue());
        }
		

	}

}
/*
 * Map:
 * Group of objects as key-value pair
 * Duplicate key-values are not allowed but values can be duplicated
 * keys-unique
 * Key-value pair---->Entry
 * example:
 * Roll no    Name
 * 001        Aathi
 * 002        Banu
 * 
 *  No relationship between collection and map
 *  Collection-->Group of individual objects
 *  Map-->Group of key value pairs
 *  
 *  Map Hierarchy:
 *  Map(I)-->SortedMap(I)-->Tree Map(C)
 *  HashMap and LinkedHashMap(C)
 *  HashMap-->Doesn't maintain any order
 *  LinkedHashMap-->maintains the insertion order
 *  TreeMap-->Maintains ascending order
 *  No null key but many null values.
 *  
 *  Methods:
 *  -put()
 *  -get()
 *  -remove()
 *  -keySet()
 *  -entrySet()
 *  -clear()
 *  -isEmpty()
 *  -size()
 *  -replaceAll()
 *  -replace()
 *  */
