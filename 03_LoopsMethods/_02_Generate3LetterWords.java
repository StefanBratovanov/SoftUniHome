import java.util.*;

public class _02_Generate3LetterWords {

	public static void main(String[] args) {
		System.out.println("enter a set of characters:");
		Scanner input = new Scanner(System.in);
		String inputStr = input.next();
		for (int i = 0; i < inputStr.length(); i++) {
			for (int j = 0; j < inputStr.length(); j++) {
				for (int m = 0; m < inputStr.length(); m++) {
					System.out.print("" + (char) inputStr.charAt(i)
							+ (char) inputStr.charAt(j)
							+ (char) inputStr.charAt(m) + " ");
				}
			}
		}
	}

}
