import java.util.Scanner;

public class IPAddress {

	public boolean isIPAddress(String ip) {

		boolean yes = false;
		boolean stop = false;
		String[] array = ip.split("\\.");

		if (array.length != 4) {

			stop = true;

		}

		for (int i = 0; i < array.length && !stop; i++) {

			int num = 0;

			try {
				num = Integer.parseInt(array[i]);
			} catch (NumberFormatException ex) {

				return false;

			}

			if (num > 255 || num < 0) {

				stop = true;
				yes = false;

			} else {

				yes = true;

			}

		}

		return yes;

	}

	public static void main(String[] args) {

		IPAddress program = new IPAddress();

		Scanner scan = new Scanner(System.in);

		String ip = scan.nextLine();

		if (program.isIPAddress(ip)) {

			System.out.println(ip + " is an IP address");

		} else {

			System.out.println(ip + " is not an IP address");

		}

	}

}
