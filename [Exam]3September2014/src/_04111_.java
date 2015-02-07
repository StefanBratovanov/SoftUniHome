import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class _04111_ {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		TreeMap<Integer, TreeMap<String, Float>> activity = new TreeMap<Integer, TreeMap<String, Float>>();
		for (int i = 0; i < n; i++) {
			String[] input = scan.nextLine().split("[/,\\s]+");
			Integer month = Integer.valueOf(input[1]);
			String name = input[3];
			Float distance = Float.valueOf(input[4]);

			if (!activity.containsKey(month)) {
				activity.put(month, new TreeMap<String, Float>());
			}
			TreeMap<String, Float> userDistances = activity.get(month);

			Float oldDistance = 0.0f;
			if (userDistances.containsKey(name)) {
				oldDistance = userDistances.get(name);
			}
			userDistances.put(name, distance + oldDistance);
		} // {7={Angel=11100.0, Pesho=3200.0}, 8={Ivan=11400.0, Pesho=5600.0}}
			// 7: Angel(11100), Pesho(3200)
			// 8: Ivan(11400), Pesho(5600)
		for (Integer month : activity.keySet()) {
			System.out.print(month + ": ");
			
			TreeMap<String, Float> users = activity.get(month);
			
			int counter = 0;
			for (String name : users.keySet()) {
				if (counter != 0) {
					System.out.printf(", %s(%.0f)", name, users.get(name));
					counter++;
				}
				else {
					System.out.printf("%s(%.0f)", name, users.get(name));
					counter++;
				}
			}
			System.out.println();
		}
	}
}
