import java.util.Scanner;

public class _02_ {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Integer[] nums = new Integer[n];
		for (int i = 0; i < n; i++) {
			nums[i] = scan.nextInt();
		}
		int counter = 0;
		if (n > 2) {
			int totalDegreesSum = 0;
			for (int i = 0; i < nums.length; i++) {
				for (int j = i + 1; j < nums.length; j++) {
					for (int k = j + 1; k < nums.length; k++) {
						totalDegreesSum += nums[i] + nums[j] + nums[k];
						if (totalDegreesSum % 360 == 0) {
							System.out.printf("%d + %d + %d = %d degrees%n",
									nums[i], nums[j], nums[k], totalDegreesSum);
							counter++;
						}
						totalDegreesSum = 0;
					}
				}
			}
			if (counter == 0) {
				System.out.println("No");
			}
		}
		if (n == 2) {
			int totalDegreesSum = nums[0] + nums[1];
			if (totalDegreesSum % 360 == 0) {
				System.out.printf("%d + %d = %d degrees%n",
						nums[0], nums[1], totalDegreesSum);
			}
			else {
				System.out.println("No");
			}
		}
		if (n == 1) {
			if (nums[0]% 360 == 0) {
				System.out.printf("%d = %d degrees%n",nums[0],nums[0]);
			}
			else {
				System.out.println("No");
			}
		}
	}
}
