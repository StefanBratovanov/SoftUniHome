import java.util.ArrayList;
import java.util.Scanner;

public class _04_LongestIncreasingSequanceLists {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] input = scan.nextLine().split(" ");
		int[] digits = new int[input.length];
		for (int i = 0; i < digits.length; i++) {
			digits[i] = Integer.parseInt(input[i]);
		}

		ArrayList<ArrayList<Integer>> allSequances = new ArrayList<>();
		ArrayList<Integer> singleSequalce = new ArrayList<>();

		singleSequalce.add(digits[0]);
		for (int i = 1; i < digits.length; i++) {
			if (digits[i] > digits[i - 1]) {
				singleSequalce.add(digits[i]);
			} else {
				allSequances.add(singleSequalce);
				singleSequalce = new ArrayList<>();
				singleSequalce.add(digits[i]);
			}
		}
		allSequances.add(singleSequalce);
		for (ArrayList<Integer> singeList : allSequances) {
			for (Integer element : singeList) {
				System.out.print(element + " ");
			}
			System.out.println();
		}

		ArrayList<Integer> longestSequance = new ArrayList<Integer>();
		longestSequance = allSequances.get(0);
		for (int i = 1; i < allSequances.size(); i++) {
			if (allSequances.get(i).size() > allSequances.get(i - 1).size()) {
				longestSequance = allSequances.get(i);
			}
			else if (allSequances.get(i).size()==allSequances.get(i-1).size()) {
			longestSequance = allSequances.get(0);
			}
		}
		System.out.print("Longest: ");
		for (Integer token : longestSequance) {
			System.out.print(token + " ");
		}
	}
}
