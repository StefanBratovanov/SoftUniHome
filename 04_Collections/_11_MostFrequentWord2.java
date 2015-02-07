import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map.Entry;

public class _11_MostFrequentWord2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] input = scan.nextLine().toLowerCase().split("\\W+");

		Map<String, Integer> words = new TreeMap<>();

		for (String word : input) {
			Integer count = words.get(word);
			if (count == null) {
				count = 0;
			}
			words.put(word, count + 1);
		}

		int mostFrequent = Collections.max(words.values());

		for (Entry<String, Integer> entry : words.entrySet()) {
			if (entry.getValue() == mostFrequent) {
				System.out.println(entry.getKey() + " -> " + entry.getValue()
						+ " times");
			}
		}
	}

}
