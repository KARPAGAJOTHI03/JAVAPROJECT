package com.map;
import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<String,String> m1=new HashMap<String,String>();
		m1.put("girl","first");
		m1.put("beautiful","second");
		System.out.println(m1.get("girl"));
		

	}

}
/*
 * HashMap-doesn't maintains the order
 * Map<String,String> m1=new HashMap<String,String>();
		m1.put("girl","first");
		m1.put("beautiful","second");
		System.out.println(m1);
 * Last null value will be printed in output
 * Map<Integer,String> m1=new HashMap<Integer,String>();
		m1.put(null,"first");
		m1.put(null,"second");
		m1.put(null,"third");
		m1.put(null,"fourth");
		m1.put(1004,"fifth");
		m1.put(1005 ,"Sixth");*/
