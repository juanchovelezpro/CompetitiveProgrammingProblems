import java.util.Arrays;
import java.util.Scanner;

public class inflation {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int balloons = Integer.parseInt(scan.nextLine());
		String can = scan.nextLine();
		String[] canAux = can.split(" ");
		double[] balloonsArr = new double[balloons];
		int[] canisters = new int[balloons];
		double[] fractions = new double[balloons];
		String answer = "";

		for (int i = 0; i < balloons; i++) {

			canisters[i] = Integer.parseInt(canAux[i]);


		}

		Arrays.sort(canisters);

		for (int i = 0; i < balloons; i++) {

			balloonsArr[i] = i + 1;
			
			if (balloonsArr[i] < canisters[i]) {

				answer = "impossible";

			} else {

				fractions[i] = canisters[i] / balloonsArr[i];

			}
			
			
		}

		double menor = fractions[0];
		
		for(int i = 1;i<balloons;i++) {
			
			if(fractions[i] < menor) {
				
				menor = fractions[i];
				
			}
			
		}


		if (!answer.equals("")) {

			System.out.println(answer);
		} else {

			System.out.println(menor);
			
		}

	}

}