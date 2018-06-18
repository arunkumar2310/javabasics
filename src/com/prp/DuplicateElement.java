package com.prp;

public class DuplicateElement {
	public static void main(String args[]) {
		int j=0;
		int array[]= {11,12,11,12,13,14,15,16};
	    for(int i=0;i<array.length;i++) {
	    	for(int k=0;k<array.length;k++) {
	    		if(array[i]<=array[k]) {
	    			int temp=array[i];
	    			array[i]=array[k];
	    			array[k]=temp;
	    		}
	    	}
	    }
		int array1[]=new int[10];
		for(int i=0;i<array.length-1;i++) {
			if(array[i]!=array[i+1]) {
				array1[j++]=array[i];
				//j++;
			}
		}
		array1[j++]=array[array.length-1];
		for(int i=0;i<j;i++) {
			array[i]=array1[i];
			System.out.println(array[i]);
		
		}
	}

}
