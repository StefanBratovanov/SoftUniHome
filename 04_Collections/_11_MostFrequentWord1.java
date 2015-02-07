import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;

public class _11_MostFrequentWord1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] input = scan.nextLine().toLowerCase().split("\\W+");

		TreeMap<String, Integer> allWords = new TreeMap<>();
		
		for (String word : input) {
			Integer frequency = allWords.get(word);
			if (frequency == null) {
				frequency = 0;
			}
			allWords.put(word, frequency + 1);
		}

		int count = 0;							//int mostFrequent = Collections.max(allWords.values());
		int mostFrequent = 0;
		for (String word : allWords.keySet()) {
			count = allWords.get(word);
			if (count > mostFrequent) {
				mostFrequent = count;
			}
		}

		for (String word : allWords.keySet()) {
			int counter = allWords.get(word);
			if (counter == mostFrequent) {
				System.out.println(word + " -> "+ mostFrequent + "times");
			}
		}
	}

}
