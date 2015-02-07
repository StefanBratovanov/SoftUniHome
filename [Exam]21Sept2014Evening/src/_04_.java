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
		TreeMap<String, LinkedHashMap<String, Integer>> infomation = new TreeMap<String, LinkedHashMap<String, Integer>>();

		for (int i = 0; i < n; i++) {
			String input = scan.nextLine();
			String[] split = input.replaceFirst("^\\W+", "").split("\\W+");
			String company = split[0];
			Integer amount = Integer.valueOf(split[1]);
			String product = split[2];
			if (!infomation.containsKey(company)) {
				infomation.put(company, new LinkedHashMap<String, Integer>());
			}
			LinkedHashMap<String, Integer> amountsAndProducts = infomation
					.get(company);
			Integer oldAmount = 0;
			if (amountsAndProducts.containsKey(product)) {
				oldAmount = amountsAndProducts.get(product);
			}
			amountsAndProducts.put(product, oldAmount + amount);
		}
		for (String company : infomation.keySet()) {
			System.out.print(company + ": ");
			int counter = 0;
			LinkedHashMap<String, Integer> amountsAndProducts = infomation
					.get(company);
			for (Entry<String, Integer> entry : amountsAndProducts.entrySet()) {
				if (counter != 0) {
					System.out.printf(", %s-%d", entry.getKey(),
							entry.getValue());
				} else {
					System.out.printf("%s-%d", entry.getKey(),
							entry.getValue());
					counter++;
				}
			}
			System.out.println();
		}
	}
}
