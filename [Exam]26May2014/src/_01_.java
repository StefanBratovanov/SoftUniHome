import java.util.Scanner;

public class _01_ {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		long sumMinutes = 0;
		while (!"End".equals(input)) {
			String[] inputSplit = input.split(":");
			int hourMinutes = Integer.parseInt(inputSplit[0]) * 60;
			int minutes = Integer.parseInt(inputSplit[1]);
			int totalMinutes = hourMinutes + minutes;
			sumMinutes += totalMinutes;
			input = scan.nextLine();
		}
		long Hours = sumMinutes/60;
		long Minutes = sumMinutes%60;
		System.out.printf("%d:%02d",Hours,Minutes);
	}
}

//public static void main(String[] args) {
//	int totalMinutes = 0;
//	Scanner input = new Scanner(System.in);
//	while (true) {
//		String videoDuration = input.nextLine();
//		if (videoDuration.equals("End")) {
//			break;
//		}
//		String[] tokens = videoDuration.split(":");
//		int hours = Integer.parseInt(tokens[0]);
//		int minutes = Integer.parseInt(tokens[1]);
//		totalMinutes = totalMinutes + hours * 60 + minutes;
//	}
//	int totalHours = totalMinutes / 60;
//	totalMinutes = totalMinutes % 60;
//	System.out.printf("%d:%02d\n", totalHours, totalMinutes);
//}