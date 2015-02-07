import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class _04_ {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		Map<String, LinkedHashMap<String, Integer>> orders = new TreeMap<String, LinkedHashMap<String, Integer>>();
		for (int i = 0; i < n; i++) {
			String[] input = scan.nextLine().split("\\s+");
			String company = input[0];
			String nuts = input[1];
			String[] amountkg = input[2].split("[a-z]");
			Integer amount = Integer.parseInt(amountkg[0]);
			if (!orders.containsKey(company)) {
				orders.put(company, new LinkedHashMap<String, Integer>());
			}
			LinkedHashMap<String, Integer> nutsAmounts = orders.get(company);
			int oldAmount = 0;
			if (nutsAmounts.containsKey(nuts)) {
				oldAmount = nutsAmounts.get(nuts);
			}
			nutsAmounts.put(nuts, oldAmount + amount);
		}
		for (String company : orders.keySet()) {
			System.out.print(company + ": ");
			LinkedHashMap<String, Integer> nutsAmounts = orders.get(company);
			int counter = 0;
			for (Entry<String, Integer> entry : nutsAmounts.entrySet()) {
				String nuts = entry.getKey();
				Integer value = entry.getValue();
				
				if (counter != 0) {
					System.out.printf(", " + "%s-%dkg", nuts, value);
					counter++;
				} else {
					System.out.printf("%s-%dkg", nuts, value);
					counter++;
				}
			}
			System.out.println();
		}
	}
}
