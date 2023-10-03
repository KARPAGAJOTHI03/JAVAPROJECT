package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Fruits {
		public static void main (String [] args)
		{
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			ArrayList<String> s1=new ArrayList<String>();
			for(int i=0;i<n;i++)
			{
				s1.add(sc.next());
			}
			Collections.sort(s1);
			Collections.reverse(s1);
			System.out.println(s1);
			
			
		}
		



}
