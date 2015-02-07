import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class _09_CombineListsOfLetters {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String inputOne = scan.nextLine();
		String inputTwo = scan.nextLine();
		ArrayList<Character> L1 = new ArrayList<Character>();
		ArrayList<Character> L2 = new ArrayList<Character>();
		for (int i = 0; i < inputOne.length(); i++) {
			L1.addAll(Arrays.asList(inputOne.charAt(i)));
		}
		for (int i = 0; i < inputTwo.length(); i++) {
			L2.addAll(Arrays.asList(inputTwo.charAt(i)));
		}
		ArrayList<Character>combinedList = new ArrayList<Character>(L1); // copies contents of list L1 into the new comboList
																		 // combinedList.addAll(L1); - same as above
		for (Character character : L2) {
			if (!L1.contains(character)) {
				combinedList.add(' ');
				combinedList.addAll(Arrays.asList(character));
			}
		}
		for (Character character : combinedList) {
			System.out.print(character);
		}
	}
}

