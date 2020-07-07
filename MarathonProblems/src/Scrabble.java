import java.util.Arrays;
import java.util.Scanner;

public class Scrabble {

	public int onePoint(String word) {

		int points = 0;
		char[] charPoints = { 'e', 'a', 'i', 'o', 'n', 'r', 't', 'l', 's', 'u' };
		char[] charPointsUp = { 'E', 'A', 'I', 'O', 'N', 'R', 'T', 'L', 'S', 'U' };

		if (word.length() <= 10) {
			for (int i = 0; i < word.length(); i++) {
				for (int j = 0; j < charPoints.length; j++) {
					if (word.charAt(i) == charPoints[j] || word.charAt(i) == charPointsUp[j]) {

						points++;

					}
				}
			}
		}
		return points;

	}

	public int twoPoints(String word) {

		int points = 0;
		char[] charPoints = { 'd', 'g' };
		char[] charPointsUp = { 'D', 'G' };

		if (word.length() <= 10) {
			for (int i = 0; i < word.length(); i++) {
				for (int j = 0; j < charPoints.length; j++) {
					if (word.charAt(i) == charPoints[j] || word.charAt(i) == charPointsUp[j]) {

						points += 2;

					}
				}
			}
		}
		return points;

	}

	public int threePoints(String word) {

		int points = 0;
		char[] charPoints = { 'b', 'c', 'm', 'p' };
		char[] charPointsUp = { 'B', 'C', 'M', 'P' };

		if (word.length() <= 10) {
			for (int i = 0; i < word.length(); i++) {
				for (int j = 0; j < charPoints.length; j++) {
					if (word.charAt(i) == charPoints[j] || word.charAt(i) == charPointsUp[j]) {

						points += 3;

					}
				}
			}
		}

		return points;
	}

	public int fourPoints(String word) {

		int points = 0;

		char[] charPoints = { 'f', 'h', 'v', 'w', 'y' };
		char[] charPointsUp = { 'F', 'H', 'V', 'W', 'Y' };

		if (word.length() <= 10) {
			for (int i = 0; i < word.length(); i++) {
				for (int j = 0; j < charPoints.length; j++) {
					if (word.charAt(i) == charPoints[j] || word.charAt(i) == charPointsUp[j]) {

						points += 4;

					}
				}
			}
		}
		return points;

	}

	public int fivePoints(String word) {

		int points = 0;

		for (int i = 0; i < word.length(); i++) {

			if (word.charAt(i) == 'k' || word.charAt(i) == 'K') {

				points += 5;

			}

		}
		return points;

	}

	public int eigthPoints(String word) {

		int points = 0;

		char[] charPoints = { 'j', 'x' };
		char[] charPointsUp = { 'J', 'X' };

		if (word.length() <= 10) {
			for (int i = 0; i < word.length(); i++) {
				for (int j = 0; j < charPoints.length; j++) {
					if (word.charAt(i) == charPoints[j] || word.charAt(i) == charPointsUp[j]) {

						points += 8;

					}
				}
			}
		}
		return points;

	}

	public int tenPoints(String word) {

		int points = 0;
		char[] charPoints = { 'q', 'z' };
		char[] charPointsUp = { 'Q', 'Z' };

		if (word.length() <= 10) {
			for (int i = 0; i < word.length(); i++) {
				for (int j = 0; j < charPoints.length; j++) {
					if (word.charAt(i) == charPoints[j] || word.charAt(i) == charPointsUp[j]) {

						points += 10;

					}
				}
			}
		}

		return points;

	}

	public String winnerWord(String[] words) {

		String winner = "The winner word is ";
		int greater = 0;
		int[] scores = new int[words.length];
		int indexWordWinner = 0;

		// this for realize the sum of points for each position of the words array
		for (int i = 0; i < words.length; i++) {

			scores[i] = onePoint(words[i]) + twoPoints(words[i]) + threePoints(words[i]) + fourPoints(words[i])
					+ fivePoints(words[i]) + eigthPoints(words[i]) + tenPoints(words[i]);

		}
		
		System.out.println(Arrays.toString(words));
		System.out.println(Arrays.toString(scores));

		// this for identify the word with the greatest score
		for (int k = 0; k < scores.length; k++) {

			if (scores[k] >= greater) {

				greater = scores[k];

			}

		}

		// this for identify the index to set the winner word.
		for (int s = 0; s < scores.length; s++) {

			if (scores[s] == greater) {

				indexWordWinner = s;

			}

		}

		winner += words[indexWordWinner];

		if (words[indexWordWinner].length() > 10) {

			winner = "The length of a word can't exceed 10";

		}

		return winner;

	}

	public static void main(String[] args) {

		Scrabble scrabble = new Scrabble();

		Scanner scan = new Scanner(System.in);

		String words = scan.nextLine();
		
		Character i = words.charAt(0);
		
		String[] splitWords = words.split(" ");

		System.out.println(scrabble.winnerWord(splitWords));

	}
}
