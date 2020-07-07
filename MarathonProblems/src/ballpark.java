import java.util.Scanner;

public class ballpark {

	public long closestNumber(String number) {

		String auxNumber = "";

		if (number.length() == 1) {

			return Long.parseLong(number);

		} else {

			int aux = Integer.parseInt(number.charAt(1) + "");

			if (aux >= 5) {

				auxNumber += String.valueOf(Integer.parseInt(number.charAt(0)+"") + 1);

				for (int i = 1; i < number.length(); i++) {

					auxNumber += "0";

				}

			} else {

				auxNumber += String.valueOf(Integer.parseInt(number.charAt(0)+""));

				for (int i = 1; i < number.length(); i++) {

					auxNumber += "0";

				}

			}

		}

		return Long.parseLong(auxNumber);

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		ballpark bp = new ballpark();

		String s = scan.nextLine();

		System.out.println(bp.closestNumber(s));

	}

}
