package com.worksheet_answers;
import java.util.Scanner;

public class FindPassword {
	int stable[] = new int[10], x = 0;
	int unstable[] = new int[10], y = 0;
	int a[] = new int[10], password = 0;

	public int findPassword(int input1, int input2, int input3, int input4, int input5) {
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
			// for(int k=0;k<d;k++)
			// {
			// System.out.println(t[k]);
			// }
			for (int k = 0; k <= 9; k++) {
				for (int l = 0; l < d; l++) {
					if (c[l] == k) {
						freq++;
					}
				}
				// System.out.println(freq);
				a[z] = freq;
				freq = 0;
				z++;

			}
			// for(int k=0;k<a.length;k++)
			// {
			// System.out.println(a[k]);
			// }

			for (int u = 0; u < a.length; u++) {
				for (int v = 0; v < a.length; v++) {
					if (a[u] >= a[v]) {
						int temp = a[u];
						a[u] = a[v];
						a[v] = temp;
					}
				}
			}
			// for(int k=0;k<a.length;k++)
			// {
			// System.out.println(a[k]);
			// }
			if ((a[0] == a[1]) || (a[1] == 0)) {
				// System.out.println("stable"+num);
				stable[x] = num;
				x++;
			} else {
				// System.out.println("unstable"+num);
				unstable[y] = num;
				y++;
			}
			z = 0;
		}
		for (int i = 0; i < unstable.length; i++) {
			password = password + unstable[i];
		}
		return password;
	}

	public static void main(String args[]) {
		FindPassword a1 = new FindPassword();
		int input1,input2,input3,input4,input5;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter five numbers");
		input1=scan.nextInt();
		input2=scan.nextInt();
		input3=scan.nextInt();
		input4=scan.nextInt();
		input5=scan.nextInt();
		int result = a1.findPassword(input1,input2,input3,input4,input5);
		System.out.println(result);
	}
}
