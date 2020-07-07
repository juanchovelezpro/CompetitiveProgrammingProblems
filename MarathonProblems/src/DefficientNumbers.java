import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DefficientNumbers {

	public int sumFactors(ArrayList<Integer> factors) {

		int sum = 0;

		for (int i = 0; i < factors.size(); i++) {

			sum += factors.get(i);

		}

		return sum;

	}

	public ArrayList<Integer> getFactors(int num) {

		ArrayList<Integer> factors = new ArrayList<>();

		factors.add(1);
		factors.add(num);

		for (int i = 2; i < num; i++) {

			if (num % i == 0) {

				factors.add(i);

			}

		}

		Collections.sort(factors);

		return factors;

	}

	public boolean isDefficient(int num, boolean condition) {

		boolean is = false;

		if (condition) {

			is = true;
		}

		return is;

	}

	public static void main(String[] args) {

		DefficientNumbers dn = new DefficientNumbers();

		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		
		
		ArrayList<Integer> factors = dn.getFactors(num);
		int sum = dn.sumFactors(factors);
		boolean condition = sum<2*num;
		
				
		System.out.println("Number: " + num);
		System.out.println("Factors:" + factors);
		System.out.println("Sum of factors = " + sum);
		System.out.println("Defficient ? = ("+ sum +" < " + 2*num + ") ---> " + dn.isDefficient(num,condition));

	}

}
