import java.util.Scanner;

public class _03_LargestSequenceOfEqualStrings {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] input = scan.nextLine().split(" ");
		int counterEquals = 1;
		int maxCounterEquals = 1;
		String startElement = input[0];
		String equalElement = input[0];

		for (int i = 1; i < input.length; i++) {
			if (input[i].equals(startElement)) {
				counterEquals++;
				startElement = input[i];
			} else {
				startElement = input[i];
				counterEquals = 1;
			}
			if (counterEquals > maxCounterEquals) {
				maxCounterEquals = counterEquals;
				equalElement = input[i];
			}
		}
		for (int i = 0; i < maxCounterEquals; i++) {
			System.out.print(equalElement + " ");
		}
	}
}
