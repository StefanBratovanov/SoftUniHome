import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class _04_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Integer n = Integer.parseInt(scan.nextLine());
		TreeMap<String, TreeMap<String, Integer>> logsInfo = new TreeMap<>();

		for (int i = 0; i < n; i++) {
			String[] inputLine = scan.nextLine().split("\\s+");
			String Ip = inputLine[0];
			String user = inputLine[1];
			Integer duration = Integer.parseInt(inputLine[2]);

			if (!logsInfo.containsKey(user)) {
				logsInfo.put(user, new TreeMap<String, Integer>());
			}
			TreeMap<String, Integer> IpDuration = logsInfo.get(user);
			Integer oldDur = 0;
			if (IpDuration.keySet().contains(Ip)) {
				oldDur = IpDuration.get(Ip);
			}
			IpDuration.put(Ip, oldDur + duration);
		}
		for (String user : logsInfo.keySet()) {
			System.out.print(user +": " );
			Integer totalDur = 0;
			for (String ip : logsInfo.get(user).keySet()) {
				totalDur+=logsInfo.get(user).get(ip);
			}
			System.out.print(totalDur+" ");
			System.out.print(logsInfo.get(user).keySet());
			System.out.println();
		}
	}

}
