package com.cg.test;

import java.util.*;
import java.io.*;

public class collectionIteratorPrac {

	
		// TODO Auto-generated constructor stub
		public static void main(String[] args)
		{
				
				//ArrayList<String> list=new ArrayList<String>();
				LinkedList<String> list=new LinkedList<String>();
				LinkedHashSet<String> list1 = new LinkedHashSet<String>();
				TreeSet<Integer> ts=new TreeSet<Integer>();
				Map<Integer, String> m=new HashMap<Integer, String>();
				m.put(2, "def");
				m.put(100, "abc");
				m.put(100, "ghi");
				Set<Map.Entry<Integer, String>> st=m.entrySet();
				for(Map.Entry<Integer, String> me  : st)
				{
					System.out.println("Value "+me.getValue());
					System.out.println("Key "+me.getKey());
				}
				//System.out.println("Map "+m.values() + m.keySet() + m.entrySet());
				list.add("A");
				list.add("B");
				list.add("C");
				list.add("D");
				list.add("E");
				
				ts.add(2);
				ts.add(5);
				ts.add(1);
				
				Iterator it=ts.iterator();
				while(it.hasNext())
					System.out.println(it);
				//boolean s=list1.addAll(list);
				//System.out.println();
				//boolean b= list1.retainAll(list);
				//System.out.println(b);
				//Iterator<String> ite1 = list1.iterator();
				//while(ite1.hasNext())
				//	System.out.println("List 1 "+ite1.next());
				
				/*Iterator<String> ite = list.iterator();
						
				while(ite.hasNext())
					System.out.println("List Elements " + ite.next() + " ");*/
		}
	

}
