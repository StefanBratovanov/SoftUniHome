import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class _04_ {

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
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (Integer entry : activity.keySet()) {
			System.out.print(entry + ": ");
			for (Entry<String, Float> userDistances : activity.get(entry).entrySet()) {
				//StringBuilder sb = new StringBuilder();
				String two = String.format("%s(%.0f), ", userDistances.getKey(),userDistances.getValue());
				sb.append(two);
			}
			System.out.println(sb.substring(0, sb.length()-2));
			sb.setLength(0);
		}
	}
}
