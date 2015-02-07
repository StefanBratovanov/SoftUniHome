import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class _04_2_ {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] input = scan.nextLine().split("[{,},\\s+]");
		Integer[] numbers = new Integer[input.length];
		for (int i = 0; i < input.length; i++) {
			numbers[i] = Integer.valueOf(input[i]);
		}
		LinkedHashMap<String, Integer> information = new LinkedHashMap<String, Integer>();

		for (int i = 0; i < numbers.length - 1; i++) {
			String couple = numbers[i] + " " + numbers[i + 1];
			Integer freq = information.get(couple);
			if (freq==null) {
				freq = 0;
			}
			information.put(couple, freq+1);
		}
		Integer freqSum = 0;
		for (Entry<String, Integer> entry: information.entrySet()) {
			freqSum+=entry.getValue();
		}
		for (String couple : information.keySet()) {
			double percent = information.get(couple)/(double)freqSum*100;
			System.out.printf("%s -> %.2f%%%n",couple ,percent);
		}
	}
}
