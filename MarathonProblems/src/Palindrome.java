import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		// Palindrome Number

		int num;
		char myChar;
		char myCharTwo;
		boolean yes = false;

		Scanner scan = new Scanner(System.in);

		num = scan.nextInt();

		String myNum = String.valueOf(num);

		for (int i = 0; i < myNum.length(); i++) {

			myChar = myNum.charAt(i);
			myCharTwo = myNum.charAt(myNum.length() - 1 - i);

			if (myChar == myCharTwo) {

				yes = true;

			} else {

				yes = false;

			}

		}

		if (yes) {

			System.out.println("It is a palindrome number");

		} else {

			System.out.println("It is not a palindrome number");

		}

	}
}