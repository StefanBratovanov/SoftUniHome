import java.util.ArrayList;
import java.util.Scanner;
public class _02_ {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int devider = scan.nextInt();
		scan.nextLine();
		ArrayList<Integer> nums = new ArrayList<Integer>();
		while (true) {
			String inputLine = scan.nextLine();
			if (inputLine.equals("End")) {
				break;
			}
			int number = Integer.parseInt(inputLine);
			nums.add(number);
		}

		int counterFound = 0;
		String output = "";
		Integer maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < nums.size(); i++) {
			for (int j = i + 1; j < nums.size(); j++) {
				for (int k = j + 1; k < nums.size(); k++) {
					int a = nums.get(i);
					int b = nums.get(j);
					int c = nums.get(k);
					int sum = a + b + c;
					if (sum > maxSum && sum % devider == 0) {
						maxSum = sum;
						counterFound++;
						output = String.format("(%d + %d + %d) %% %d = 0",
								a, b, c, devider);
						sum = 0;
						
					}

				}
			}
		}
		if (counterFound == 0) {
			System.out.println("No");
		}
		else {
			System.out.println(output);
		}
	}

}
