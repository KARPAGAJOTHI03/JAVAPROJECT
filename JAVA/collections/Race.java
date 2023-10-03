package com.collections;
import java.util.*;

public class Race {
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
		for(String str: s1)
		{
			System.out.println(str);
		}
		
		
	}
	

}
