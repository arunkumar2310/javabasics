package com.worksheet_answers;

public class ReverseArray {
	private int a[] = { 3, 4, 5, 2, 33, 24, 2 };
	private int b[]=new int[a.length];
	public void toReverse()
	{
		
		for(int i=0,j=a.length-1;i<a.length;i++,j--)
		{
			b[j]=a[i];
		}
	}
	public void toPrint() {
		for(int k=0;k<a.length;k++) {
			System.out.println(b[k]);
		}
	}
	public static void main(String args[]) {
		ReverseArray array=new ReverseArray();
		array.toReverse();
		array.toPrint();
		}
}

