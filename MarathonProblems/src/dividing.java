import java.util.Scanner;

public class dividing {

	public int transform(int a, int b) {

		int operations = 0;

		while (a != b) {

			if (a > b) {

				if (a % 2 == 0) {
					
					a = a/2;
					operations++;

				} else {

					a++;
					operations++;
				}

			} else {

				a++;
				operations++;
				
			}

		}

		return operations;

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		dividing div = new dividing();

		String[] numbers = scan.nextLine().split(" ");

		int a = Integer.parseInt(numbers[0]);
		int b = Integer.parseInt(numbers[1]);

		System.out.println(div.transform(a, b));
		
	}

}
