import java.util.ArrayList;
import java.util.Scanner;

public class _04_LongestIncreasingSequenceOne {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] input = scan.nextLine().split(" ");
		int[] digits = new int[input.length];
		for (int i = 0; i < digits.length; i++) {
			digits[i] = Integer.parseInt(input[i]);
		}
		System.out.print(digits[0] + " ");
		int counterIncreasing = 1;
		int maxCounter = 1;
		int startIndexMax = 0;
		int endIndexMax = 0;

		for (int i = 1; i < digits.length; i++) {
			if (digits[i] > digits[i - 1]) {
				System.out.print(digits[i] + " ");
				counterIncreasing++;
			} else if (digits[i] <= digits[i - 1]) {
				System.out.println();
				System.out.print(digits[i] + " ");
				counterIncreasing = 1;
			}
			if (counterIncreasing > maxCounter) {
				maxCounter = counterIncreasing;
				endIndexMax = i;
				startIndexMax = endIndexMax - maxCounter + 1;
			}
		}
		System.out.println();
		System.out.print("Longest: ");
		for (int i = startIndexMax; i <= endIndexMax; i++) {
			System.out.print(digits[i] + " ");
		}
	}
}
