import java.util.Scanner;

public class _06_CountSpecifiedWord {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine().toLowerCase();
		String wordToMach = scan.nextLine().toLowerCase();
		int countMatches = 0;
		String[]onlyText = input.split("\\W+");
		for (int i = 0; i < onlyText.length; i++) {
			if (onlyText[i].equals(wordToMach)) {
				countMatches++;
			}
		}
		System.out.println(countMatches);
	}
}
