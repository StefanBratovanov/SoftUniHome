import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class _04_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Integer n = Integer.parseInt(scan.nextLine());
		TreeMap<String, LinkedHashMap<String, Integer>> nutsInfo = new TreeMap<>();
		for (int i = 0; i < n; i++) {
			String[] input = scan.nextLine().split("\\s+");
			String company = input[0];
			String nutsType = input[1];
			String[] amountKgs = input[2].split("\\D+");
			Integer amount = Integer.parseInt(amountKgs[0]);

			if (!nutsInfo.containsKey(company)) {
				nutsInfo.put(company, new LinkedHashMap<String, Integer>());
			}
			LinkedHashMap<String, Integer> nutsTypeandAmount = nutsInfo
					.get(company);
			Integer oldAmount = 0;
			if (nutsTypeandAmount.keySet().contains(nutsType)) {
				oldAmount = nutsTypeandAmount.get(nutsType);
			}
			nutsTypeandAmount.put(nutsType, oldAmount + amount);
		}

		for (String company : nutsInfo.keySet()) {
			System.out.print(company + ": ");
			int counter = 0;
			for (String nut : nutsInfo.get(company).keySet()) {
				if (counter!=0) {
					System.out.print(", " + nut + "-" + nutsInfo.get(company).get(nut) + "kg");
				}
				else {
					System.out.print(nut + "-" + nutsInfo.get(company).get(nut) + "kg");
					counter++;
				}
			}
			System.out.println();
		}
	}

}
