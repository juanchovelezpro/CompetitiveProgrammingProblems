import java.util.Arrays;
import java.util.Scanner;

/**
 * Este problema fue de la Maraton de Programacion Competitiva RPC Actividad 13 del 2018.
 * 
 * 
 * @author velez
 *
 */

public class die {

	public static final char[][] one = { { ':', ':', ':' }, { ':', 'o', ':' }, { ':', ':', ':' } };
	public static final char[][] two = { { ':', ':', 'o' }, { ':', ':', ':' }, { 'o', ':', ':' } };
	public static final char[][] twoA = { { 'o', ':', ':' }, { ':', ':', ':' }, { ':', ':', 'o' } };
	public static final char[][] three = { { ':', ':', 'o' }, { ':', 'o', ':' }, { 'o', ':', ':' } };
	public static final char[][] threeA = { { 'o', ':', ':' }, { ':', 'o', ':' }, { ':', ':', 'o' } };
	public static final char[][] four = { { 'o', ':', 'o' }, { ':', ':', ':' }, { 'o', ':', 'o' } };
	public static final char[][] five = { { 'o', ':', 'o' }, { ':', 'o', ':' }, { 'o', ':', 'o' } };
	public static final char[][] six = { { 'o', ':', 'o' }, { 'o', ':', 'o' }, { 'o', ':', 'o' } };
	public static final char[][] sixA = { { 'o', 'o', 'o' }, { ':', ':', ':' }, { 'o', 'o', 'o' } };

	public boolean isCorrupted(char[][] m) {

		boolean yes = true;

		if (Arrays.deepEquals(m, one) || Arrays.deepEquals(m, two) || Arrays.deepEquals(m, three)
				|| Arrays.deepEquals(m, four) || Arrays.deepEquals(m, five) || Arrays.deepEquals(m, six) || Arrays.deepEquals(m, twoA) 
				|| Arrays.deepEquals(m, threeA) || Arrays.deepEquals(m, sixA)) {

			yes = false;

		}

		return yes;

	}

	public String valueDice(char[][] m) {

		String value = "";

		if (!isCorrupted(m)) {

			if (Arrays.deepEquals(m, one))
				value = "1";

			if (Arrays.deepEquals(m, two) || Arrays.deepEquals(m, twoA))
				value = "2";

			if (Arrays.deepEquals(m, three) || Arrays.deepEquals(m, threeA))
				value = "3";

			if (Arrays.deepEquals(m, four))
				value = "4";

			if (Arrays.deepEquals(m, five))
				value = "5";

			if (Arrays.deepEquals(m, six) || Arrays.deepEquals(m, sixA))
				value = "6";

		} else {

			value = "unknown";

		}

		return value;

	}

	public static void main(String[] args) {

		die d = new die();

		Scanner scan = new Scanner(System.in);

		String a = scan.nextLine();
		String b = scan.nextLine();
		String c = scan.nextLine();

		char[][] m = new char[3][3];

		for (int i = 0; i < m.length; i++) {

			for (int j = 0; j < m[0].length; j++) {

				if (i == 0) {

					m[i][j] = a.charAt(j);

				} else if (i == 1) {

					m[i][j] = b.charAt(j);

				} else {

					m[i][j] = c.charAt(j);

				}

			}

		}

		System.out.println(d.valueDice(m));

	}

}
