package com.collection;

public class IterateIntegerArray {
	
	int i[]= {1,2,3,4};
	int count=0,count1=0;
	public IterateIntegerArray() {
		
	}
	public boolean hasNext() {
		count++;
		boolean a;
		if(count<=i.length)
		a= true;
		else
		a= false;
		return a;
	}
	public Integer next() {
		int a=i[count1];
		count1++;
		return a;
		
	}

	public static void main(String[] args) {
		IterateIntegerArray imp=new IterateIntegerArray();
		while(imp.hasNext()) {
			System.out.println(imp.next());
		}

	}

}
