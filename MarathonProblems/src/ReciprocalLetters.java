import java.util.Scanner;

public class ReciprocalLetters {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		char[] abc = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
				't', 'u', 'v', 'w', 'x', 'y', 'z' };

		char[] ABC = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
				'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };

		char[] zyx = new char[26];
		char[] ZYX = new char[26];

		for (int i = abc.length - 1, j = 0; i >= 0; i--, j++) {

			zyx[j] = abc[i];

		}

		for (int i = ABC.length - 1, j = 0; i >= 0; i--, j++) {

			ZYX[j] = ABC[i];

		}

		String words = scan.nextLine();

		String reciprocalWord = "";

		for (int i = 0; i < words.length(); i++) {

			for (int j = 0; j < abc.length; j++) {

				if (words.charAt(i) == ' ') {

					reciprocalWord += " ";

				}

				if (Character.isUpperCase(words.charAt(i))) {

					if (words.charAt(i) == ABC[j]) {

						reciprocalWord += ZYX[j];

					}

				} else {

					if (words.charAt(i) == abc[j]) {

						reciprocalWord += zyx[j];

					}

				}

			}

		}

		String format = reciprocalWord.replaceAll("                          ", " ");
		System.out.println("Your words: " + words);
		System.out.println("In Reciprocal Letters: " + format);
	}

}
