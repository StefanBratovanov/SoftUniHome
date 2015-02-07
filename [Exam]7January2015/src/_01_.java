import java.util.ArrayList;
import java.util.Scanner;

public class _01_ {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		
		ArrayList<Long> output = new ArrayList<Long>();

		Long numberToCompare = scan.nextLong();
		scan.nextLine();
		output.add(numberToCompare);
		
		for (int i = 1; i < n ; i++) {
			boolean found = false;
			String[] numbers = scan.nextLine().replaceFirst("^\\s+", "")
					.split("\\s+");

			Long[] nums = new Long[numbers.length];
			for (int j = 0; j < nums.length; j++) {
				nums[j] = Long.parseLong(numbers[j]);
			}

			Long MinDifference = Long.MAX_VALUE;
			Long closestNumber = Long.MAX_VALUE;

			for (int j = 0; j < nums.length; j++) {
				Long currentNum = nums[j];
				if (currentNum > numberToCompare) {
					Long currDiff = currentNum - numberToCompare;
					if (currDiff < MinDifference) {
						MinDifference = currDiff;
						closestNumber = currentNum;
						found = true;

					}
				}
			}
			if (!found) {
				numberToCompare++;
			} else {
				output.add(closestNumber);
				numberToCompare = closestNumber;
			}
		}
		System.out.println(output.toString().replace("[", "").replace("]", ""));
	}

}
