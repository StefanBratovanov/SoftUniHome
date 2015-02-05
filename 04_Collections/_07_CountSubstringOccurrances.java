import java.util.Scanner;

public class _07_CountSubstringOccurrances {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine().toLowerCase();
		String subString = scan.nextLine().toLowerCase();
		int subLength = subString.length();
		int occurrances = 0;

		for (int i = 0; i < input.length() - subLength + 1; i++) {
			if (input.substring(i, subLength + i).equals(subString)) {
				occurrances++;
			}
		}
		System.out.println(occurrances);
	}
}
