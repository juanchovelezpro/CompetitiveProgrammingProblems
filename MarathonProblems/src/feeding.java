import java.util.Scanner;

public class feeding {

	public int adjustVol(double num) {

		int intPart = (int) num;

		double res = num - (double) intPart;

		if (res != 0) {

			intPart++;

		}

		return intPart;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		feeding f = new feeding();

		String l = scan.nextLine();
		String[] arr = l.split(" ");
		int sum = 0;

		int numBuck = Integer.parseInt(arr[0]);
		int capVol = Integer.parseInt(arr[1]);

		String l2 = scan.nextLine();
		String[] weigth = l2.split(" ");

		for (int i = 0; i < numBuck; i++) {

			sum += Integer.parseInt(weigth[i]);

		}

		double vol = (double) sum / (double) capVol;

		System.out.println(f.adjustVol(vol));

		
	}

}
