package com.basic;


	class Sub extends MyAbstract {
		 
		   int x = 4;
		 
		   int getSum(){
		      return x + x;
		   }
		   int getSum(int x){
		      return x + x;
		   }
		   int getSum(int x, int y){
		      int z = x + y;
		      System.out.print(z);
		      return z;
		   }
		   public static void main(String[] args){
		      Sub sub = new Sub();
		      sub.getSum(4,2);
		   }
		}

