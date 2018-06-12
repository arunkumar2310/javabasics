package loops;
import java.util.Scanner;

public class Color {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a character");
		char input=scan.next().charAt(0);
		switch(input) {
		case 'R':
			System.out.println("Red");
			break;
		case 'B':
			System.out.println("Blue");
			break;
		case 'O':
			System.out.println("Orange");
			break;
		case 'G':
			System.out.println("Green");
			break;
		case 'Y':
			System.out.println("Yellow");
			break;
		case 'W':
			System.out.println("White");
			break;
		default:
		System.out.println("Invalid input");
		}
	}
}
