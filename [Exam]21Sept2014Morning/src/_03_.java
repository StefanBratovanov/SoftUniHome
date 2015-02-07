import java.util.Scanner;

public class _03_ {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String[] inputOne = scan.nextLine()
				.replaceFirst("['\', '/', '(', ')', '|',\\s+]+", "")
				.split("['\', '/', '(', ')', '|',\\s+]+");
		String resOne = String.join("", inputOne);
		String resOneTwo[] = resOne.split("\\d+");
		String resTwo = String.join(",", resOneTwo);
		String[] input = resTwo.split("\\W+");

		int startWeight = calculateWeight(input[0]);
		String wordOne = "";
		String wordTwo = "";
		String[] longestWords = new String[2];
		int sum = 0;
		int biggestSum = 0;
		for (int i = 1; i < input.length; i++) {
			int currentWeight = calculateWeight(input[i]);
			sum = startWeight + currentWeight;
			if (sum > biggestSum) {
				biggestSum = sum;
				wordOne = input[i - 1];
				wordTwo = input[i];
			}
			startWeight = calculateWeight(input[i]);
		}
		System.out.println(wordOne);
		System.out.println(wordTwo);

	}

	private static int calculateWeight(String word) {
		int sum = 0;
		for (int i = 0; i < word.length(); i++) {
			sum += (word.charAt(i) - 'a' + 1);
		}
		return sum;
	}
}

// String[] input = scan.nextLine().toLowerCase()
// .replaceFirst("[\\W+,\\d+]+", "").split("[\\W+,\\d+]+");
