import java.util.Scanner;

public class _01_ {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		long totalBottles = 0;
		while (!"End".equals(input)) {
			String[] inputSplit = input.split(" ");
			int count = Integer.parseInt(inputSplit[0]);
			String measure = inputSplit[1];
			if (measure.equals("stacks")) {
				totalBottles += (count * 20);
			} else {
				totalBottles += count;
			}
			input = scan.nextLine();
		}
		System.out.printf("%d stacks + %d beers", totalBottles/20, totalBottles%20);
	}
}


//public static void main(String[] args) {
//	Scanner input = new Scanner(System.in);
//	int totalBeers = 0;
//	while (true) {
//		String orderLine = input.nextLine();
//		if (orderLine.equals("End")) {
//			break;
//		}
//		String[] order = orderLine.split(" ");
//		int beers = Integer.parseInt(order[0]);
//		if (order[1].equals("stacks")) {
//			beers *= 20;
//		}
//		totalBeers += beers;
//	}
//	System.out.printf("%d stacks + %d beers\n",
//		totalBeers / 20, totalBeers % 20);
//}