import java.util.Scanner;

public class PandigitalNumber {

	public boolean isPandigital(int number) {

		boolean yes = false;

		boolean stop = false;

		String num = String.valueOf(number);
		boolean[] pandigitals = new boolean[10];
		char[] array = num.toCharArray();

		for (int i = 0; i < pandigitals.length; i++) {

			pandigitals[i] = false;

		}

		for (int j = 0; j < array.length; j++) {

			for (int k = 0; k < 10; k++) {

				if (Integer.parseInt((String.valueOf(array[j]))) == k) {

					pandigitals[k] = true;

				}

			}

		}

		for (int x = 0; x < pandigitals.length && !stop; x++) {

			if (pandigitals[x]) {

				yes = true;

			} else {

				yes = false;
				stop = true;

			}

		}

		return yes;

	}

	public static void main(String[] args) {

		PandigitalNumber pandigital = new PandigitalNumber();

		Scanner scan = new Scanner(System.in);

		int number = scan.nextInt();

		if (pandigital.isPandigital(number)) {

			System.out.println(number + " is a pandigital number");

		} else {

			System.out.println(number + " is not a pandigital number");

		}

	}

}
