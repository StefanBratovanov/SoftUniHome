import java.util.Scanner;
import java.util.TreeMap;

public class _04_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Integer n = Integer.parseInt(scan.nextLine());
		TreeMap<Integer, TreeMap<String, Integer>> tracker = new TreeMap<Integer, TreeMap<String, Integer>>();
		for (int i = 0; i < n; i++) {
			String[] input = scan.nextLine().split("[/,\\s+]+");
			Integer month = Integer.parseInt(input[1]);
			String user = input[3];
			Integer distance = Integer.parseInt(input[4]);

			if (!tracker.containsKey(month)) {
				tracker.put(month, new TreeMap<String, Integer>());
			}
			TreeMap<String, Integer> nameDistance = tracker.get(month);
			Integer oldDistance = 0;
			if (nameDistance.containsKey(user)) {
				oldDistance = nameDistance.get(user);
			}
			nameDistance.put(user, oldDistance + distance);
		}
		for (Integer month : tracker.keySet()) {
			System.out.print(month + ": ");
			int counter = 0;
			
			for (String name : tracker.get(month).keySet()) {
				if (counter!=0) {
					System.out.print(", " + name + "("+ tracker.get(month).get(name)+")");
				}
				else {
					System.out.print(name + "("+ tracker.get(month).get(name)+")");
					counter++;
				}
			}
			System.out.println();
		}
	}
}
