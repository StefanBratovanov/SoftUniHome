import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class _04_ {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();

		TreeMap<String, TreeSet<String>> nameAndIPs = new TreeMap<String, TreeSet<String>>();
		TreeMap<String, Integer> nameAndDurations = new TreeMap<String, Integer>();
		
		for (int i = 0; i < n; i++) {
			String[] input = scan.nextLine().split(" ");
			String IP = input[0];
			String user = input[1];
			Integer duration = Integer.valueOf(input[2]);

			TreeSet<String>	newIPs = nameAndIPs.get(user);
			if (newIPs==null) {
				newIPs = new TreeSet<String>();
			}
			newIPs.add(IP);
			nameAndIPs.put(user, newIPs);

			Integer oldDuration = nameAndDurations.get(user);
			if (oldDuration == null) {
				oldDuration = 0;
			}
			nameAndDurations.put(user, oldDuration + duration);
		}
		for (Entry<String, Integer> entry : nameAndDurations.entrySet()) {
			String name = entry.getKey();
			TreeSet<String> listIPs = nameAndIPs.get(name);
			Integer dur = entry.getValue();
			System.out.println(name +": "+dur+" "+listIPs);
		}
	}
}