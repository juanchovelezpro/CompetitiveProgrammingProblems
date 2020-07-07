import java.util.ArrayList;
import java.util.Scanner;

public class ArmstrongNumber {

	public boolean isArmstrongNumber(int number) {

		String myNum = String.valueOf(number);
		boolean yes = false;
		int all = 0;

		ArrayList<Integer> numeros = new ArrayList<Integer>();

		for (int i = 0; i < myNum.length(); i++) {

			numeros.add(Integer.parseInt("" + myNum.charAt(i)));

		}

		for (int j = 0; j < numeros.size(); j++) {

			int a = numeros.get(j);

			all += a * a * a;

		}

		if (all == number) {

			yes = true;

		}

		return yes;

	}

	public static void main(String[] args) {

		ArmstrongNumber program = new ArmstrongNumber();

		Scanner scan = new Scanner(System.in);

		int myNumber = scan.nextInt();

		if (program.isArmstrongNumber(myNumber)) {

			System.out.println("Yeah!, " + myNumber + " is an Armstrong Number");

		} else {

			System.out.println(myNumber + " is not an Armstrong Number");

		}

	}
}