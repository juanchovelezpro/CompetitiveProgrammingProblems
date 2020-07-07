import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumbers {

	public boolean isPrime(int num) {

		boolean is = true;
		boolean stop = false;

		for (int i = 2; i < num && !stop; i++) {

			if (num % i == 0) {

				is = false;
				stop = true;

			}

		}

		return is;

	}

	public static void main(String[] args) {

		PrimeNumbers p = new PrimeNumbers();
		Scanner scan = new Scanner(System.in);

		System.out.println("Digit a number to verify if it's prime or not");

		System.out.println(p.isPrime(scan.nextInt()));
		scan.nextLine();


	}

}
