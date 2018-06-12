package loops;
import java.util.Scanner;

public class Examine {
	public static void main(String args[]) {
		Scanner scan= new Scanner(System.in);
		System.out.println("ENter a character");
		char input=scan.next().charAt(0);
		if(Character.isDigit(input)) {
			System.out.println("number");
		}
		else if((input>=65 && input <=90)||(input>=97 && input<=122)) {
			//can also use isAlphabet keyword
			System.out.println("alphabet");
		}
		else if(input>=0 && input<=257) {
			System.out.println("Special character");
		}
		
	}
}
