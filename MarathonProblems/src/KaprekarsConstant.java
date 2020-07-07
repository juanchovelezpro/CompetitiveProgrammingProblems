import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*

Author: Juan Camilo Velez Olaya
Kaprekar's Constant Code

- The number 6174 is known as Kaprekar's Constant. It is the ultimate convergence point of the Kaprekar's routine, an
algorithm thought up by Indian mathematician Dr. Kaprekar in 1949

The routine is as follows:
1. Take any four-digit number (at least two different digits must be used, zeroes allowed).
2. Arrange the digits in descending and then in ascending order to get two four-digit numbers.
3. Subtract the smaller number from the larger and get the result.
4. Repeat steps 2-4 with the new number.

After a few iterations, the algorithm converges to a fixed point and starts to result in the same number  - 6174 - the so-called Kaprekar's constant.

For Example:
n = 5324

5432 - 2345 = 3087
8730 - 0378 = 8352
8532 - 2358 = 6174
7641 - 1467 = 6174

For numbers beyond four digits the routine might converge to 0 (zero), other constants or "loops" (infinitely repetitive sequences of the same numbers over and over again).

*/

public class KaprekarsConstant {

	public boolean isKaprekar(int number) {

		boolean yes = false;
		int kaprekar = 0;
		boolean stop = false;
		String num = String.valueOf(number);

		if (num.length() == 4) {

			if (atLeastTwoDifferentDigits(number)) {

				while (kaprekar != 6174 && !stop) {

					kaprekar = sortNumberMaxToMin(number) - sortNumberMinToMax(number);
					System.out.println(
							sortNumberMaxToMin(number) + " - " + sortNumberMinToMax(number) + " = " + kaprekar);
					number = kaprekar;

					if (number < 1000) {

						System.out.println("The result has three digits, this go to converge to zero");
						stop = true;

					}

				}

			}
		} else {

			System.out.println("Kaprekar constant it's only for numbers that have four digits!!");

		}

		if (kaprekar == 6174) {

			yes = true;

		}

		return yes;

	}

	public boolean atLeastTwoDifferentDigits(int number) {

		boolean yes = false;

		String num = String.valueOf(number);

		for (int i = 0; i < num.length(); i++) {

			for (int j = 0; j < num.length(); j++) {

				if (num.charAt(i) != num.charAt(j)) {

					yes = true;

				}

			}

		}

		if (!yes) {

			System.out.println("The number needs at least two different digits");

		}

		return yes;

	}

	public int sortNumberMinToMax(int number) {

		int sorted = 0;

		String num = String.valueOf(number);
		ArrayList<Integer> numbers = new ArrayList<Integer>();

		for (int i = 0; i < num.length(); i++) {

			numbers.add(Integer.parseInt(String.valueOf(num.charAt(i))));

		}

		Collections.sort(numbers);
		String toConvert = "";

		for (int i = 0; i < numbers.size(); i++) {

			toConvert += numbers.get(i);

		}

		sorted = Integer.parseInt(toConvert);

		return sorted;

	}

	public int sortNumberMaxToMin(int number) {

		int sorted = 0;

		String num = String.valueOf(number);
		ArrayList<Integer> numbers = new ArrayList<Integer>();

		for (int i = 0; i < num.length(); i++) {

			numbers.add(Integer.parseInt(String.valueOf(num.charAt(i))));

		}

		Collections.sort(numbers);
		Collections.reverse(numbers);
		String toConvert = "";

		for (int i = 0; i < numbers.size(); i++) {

			toConvert += numbers.get(i);

		}

		sorted = Integer.parseInt(toConvert);

		return sorted;

	}

	public static void main(String[] args) {

		KaprekarsConstant k = new KaprekarsConstant();

		Scanner scan = new Scanner(System.in);

		int number = scan.nextInt();

		if (k.isKaprekar(number)) {

			System.out.println("The number " + number + " is a Kaprekar Constant");

		} else {

			System.out.println("The number " + number + " is not a Kaprekar Constant");

		}

	}

}