package com.arraylist;
import java.util.*;

public class Collection {
	public static void main(String args[]) {
		//arraylist example
		List<String> arrayList=new ArrayList<>();
		arrayList.add("one");
		arrayList.add("two");
		arrayList.add("three");
		arrayList.add("one");
		System.out.println(arrayList.toString());
		//linkedlist example(mainly to delete)
		List<String> linkedList=new LinkedList<>();
		linkedList.add("one");
		linkedList.add("two");
		linkedList.add("three");
		linkedList.add("one");
		System.out.println(linkedList.toString());
		//hashset example
		Set<String> hashSet=new HashSet<>();
		hashSet.add("one");
		hashSet.add("two");
		hashSet.add("three");
		hashSet.add("one");
		System.out.println(hashSet.toString());
		
	}
}
