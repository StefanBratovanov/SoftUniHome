import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class _04_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Integer n = scan.nextInt();
		scan.nextLine();
		LinkedHashMap<String, TreeMap<String, Integer>> orders = new LinkedHashMap<String, TreeMap<String, Integer>>();
		for (int i = 0; i < n; i++) {
			String[] inputLine = scan.nextLine().split("\\s+");
			String name = inputLine[0];
			Integer amount = Integer.valueOf(inputLine[1]);
			String product = inputLine[2];

			if (!orders.containsKey(product)) {
				orders.put(product, new TreeMap<String, Integer>());
			}
			TreeMap<String, Integer> nameAndAmount = orders.get(product);
			int oldAmount = 0;
			if (nameAndAmount.containsKey(name)) {
				oldAmount = nameAndAmount.get(name);
			}
			nameAndAmount.put(name, amount + oldAmount);
		}
		
		for (String product : orders.keySet()) {
			System.out.print(product + ": ");
			int counter = 0;
			for (String name : orders.get(product).keySet()) {
				if (counter != 0) {
					System.out.print(", " + name + " " + orders.get(product).get(name));
				}
				else {
					System.out.print(name + " " + orders.get(product).get(name));
					counter++;
				}
			}
			System.out.println();
		}
	}
}
