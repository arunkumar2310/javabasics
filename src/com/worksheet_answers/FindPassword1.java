package com.worksheet_answers;
import java.util.Scanner;

public class FindPassword1 {
	int stable[] = new int[5], x = 0;
	int unstable[] = new int[5], y = 0;
	int a[] = new int[10], password = 0;

	public int findPasswordOne(int input1, int input2, int input3, int input4, int input5) {
		int b[] = { input1, input2, input3, input4, input5 };
		for (int i = 0; i < 5; i++) {

			int num = b[i], freq = 0;
			int c[] = new int[10], d = 0, z = 0;
			for (int j = num; j != 0; j /= 10) {
				int e = j % 10;
				c[d] = e;
				d++;
			}
			int t[] = new int[d];
			for (int g = 0; g < d; g++) {
				t[g] = c[g];
			}
			
			for (int k = 0; k <= 9; k++) {
				for (int l = 0; l < d; l++) {
					if (c[l] == k) {
						freq++;
					}
				}
				a[z] = freq;
				freq = 0;
				z++;

			}
			for (int u = 0; u < a.length; u++) {
				for (int v = 0; v < a.length; v++) {
					if (a[u] >= a[v]) {
						int temp = a[u];
						a[u] = a[v];
						a[v] = temp;
					}
				}
			}
			if((a[4]==0 && a[3]==a[1])&&(a[3]==0 && a[2]==a[1])) {
				stable[x]=num;
				x++;
			}
			else if ((a[0] == a[1]) || (a[1] == 0)) {
				stable[x] = num;
				x++;
			} 
			else {
				unstable[y] = num;
				y++;
			}
			z = 0;
		}
		for (int u = 0; u < stable.length; u++) {
			for (int v = 0; v < stable.length; v++) {
				if (stable[u] >= stable[v]) {
					int temp = stable[u];
					stable[u] = stable[v];
					stable[v] = temp;
				}
			}
		}
		for (int u = 0; u < unstable.length; u++) {
			for (int v = 0; v < unstable.length; v++) {
				if (unstable[u] >= unstable[v]) {
					int temp = unstable[u];
					unstable[u] = unstable[v];
					unstable[v] = temp;
				}
			}
		}
		/*for(int u=0;u<stable.length;u++) {
			System.out.println(stable[u]);
		}
		for(int u=0;u<unstable.length;u++) {
			System.out.println(unstable[u]);
		}*/
			password = unstable[y-1] + stable[0];
		return password;
	}

	public static void main(String args[]) {
		FindPassword1 a2 = new FindPassword1();
		int input1,input2,input3,input4,input5;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter five numbers");
		input1=scan.nextInt();
		input2=scan.nextInt();
		input3=scan.nextInt();
		input4=scan.nextInt();
		input5=scan.nextInt();
		int result = a2.findPasswordOne(input1,input2,input3,input4,input5);
		System.out.println(result);
	}
}
