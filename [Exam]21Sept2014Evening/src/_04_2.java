import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class _04_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		TreeMap<String, LinkedHashMap<String, Integer>>officeInfo = new TreeMap<String, LinkedHashMap<String,Integer>>();
		for (int i = 0; i < n; i++) {
			String[] input = scan.nextLine().replaceFirst("^[|,\\s+,-]+", "").split("[|,\\s+,-]+");
			String company = input[0];
			Integer amount = Integer.parseInt(input[1]);
			String product = input[2];
			
			if (!officeInfo.containsKey(company)) {
				officeInfo.put(company, new LinkedHashMap<String, Integer>());
			}
			LinkedHashMap<String, Integer>amountsAndProducts = officeInfo.get(company);
			Integer oldAmount = 0;
			if (amountsAndProducts.keySet().contains(product)) {
				oldAmount = amountsAndProducts.get(product);
			}
			amountsAndProducts.put(product, oldAmount + amount);
		}

		for (String company : officeInfo.keySet()) {
			System.out.print(company + ": ");
			int counter = 0;
			for (String product : officeInfo.get(company).keySet()) {
				if (counter!=0) {
					System.out.printf(", %s-%d", product, officeInfo.get(company).get(product));
				}
				else {
					System.out.printf("%s-%d", product, officeInfo.get(company).get(product));
					counter++;
				}
			}
			System.out.println();
		}
	}
}
