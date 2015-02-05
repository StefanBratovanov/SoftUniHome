import java.util.Scanner;

public class _02_SequencesOfEqualStrings {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] input = scan.nextLine().split(" ");

		int counterEquals = 1;
		String elementForComparison = input[0];

		for (int i = 1; i < input.length; i++) {
			if (input[i].equals(elementForComparison)) {
				counterEquals++;
				elementForComparison = input[i];
			} else {
				printEquals(counterEquals, elementForComparison);
				System.out.println();
				elementForComparison = input[i];
				counterEquals = 1;
			}
			if (i == input.length - 1) {
				printEquals(counterEquals, elementForComparison);
			}
		}
		if (input.length == 1) {
			System.out.println(elementForComparison);
		}
	}

	public static void printEquals(int counter, String element) {
		for (int i = 0; i < counter; i++) {
			System.out.print(element + " ");
		}
	}
}