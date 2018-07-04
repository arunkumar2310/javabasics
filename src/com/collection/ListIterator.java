package com.collection;
import java.util.*;
import java.util.ArrayList;
import java.lang.*;

public class ListIterator {
    List<String> arrayList;
    public ListIterator() {
	arrayList=new ArrayList<String>();
    }
	public void printAll() {
		System.out.println(arrayList);
		Iterator<String> iter=arrayList.iterator();
		while(iter.hasNext()) {
			String value=iter.next();
			System.out.print(value);
		}
	}
	public static void main(String ags[]) {
		ListIterator obj=new ListIterator();
		obj.arrayList.add("i");
		obj.arrayList.add("am");
		obj.arrayList.add("good");
		obj.arrayList.add("boy");
		obj.printAll();
	}
}
