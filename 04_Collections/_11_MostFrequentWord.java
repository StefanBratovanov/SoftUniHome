import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _11_MostFrequentWord {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] input = scan.nextLine().toLowerCase().split("\\W+");
		Map<String, Integer> countWords = new TreeMap<String, Integer>();
		Integer maxCount = 0;
		for (String word : input) {
			Integer count = countWords.get(word);
			if (count == null) {
				count = 0;
			}
			if (count >= maxCount) {
				maxCount = count + 1;
			}
			countWords.put(word, count + 1);
		}
		for (Map.Entry<String, Integer> mostFreq : countWords.entrySet()) {
			if (mostFreq.getValue() == maxCount) {
				System.out.printf("%s -> %d times\n", mostFreq.getKey(),
						mostFreq.getValue());
			}
		}
	}
}
