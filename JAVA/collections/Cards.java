package com.collections;
import java.util.*;
public class Cards {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		LinkedList<Integer> c1=new LinkedList<Integer>();
		for(int i=1;i<n;i++)
		{
			c1.add(sc.nextInt());
		}
		Collections.shuffle(c1);
		System.out.print(c1);
		
		

	}

}
