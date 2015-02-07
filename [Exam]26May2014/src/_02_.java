import java.util.Scanner;

public class _02_ {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int[] numbers = new int[n];
		for (int i = 0; i < n; i++) {
			numbers[i] = scan.nextInt();
		}
		int foundMatch = 0;

		for (int a = 0; a < numbers.length; a++) {
			for (int b = 0; b < numbers.length; b++) {
				for (int c = 0; c < numbers.length; c++) {
					if (numbers[a] * numbers[a] + numbers[b] * numbers[b] == numbers[c] * numbers[c]
							&& numbers[a] <= numbers[b]) {
						System.out.println(numbers[a] + "*" + numbers[a]
								+ " + " + numbers[b] + "*" + numbers[b] + " = "
								+ numbers[c] + "*" + numbers[c]);
						foundMatch++;
					}
				}
			}
		}
		if (foundMatch == 0) {
			System.out.println("No");
		}
	}
}

// import java.util.HashSet;
// import java.util.Scanner;
//
// public class PitagoreanNumbers {
//
// public static void main(String[] args) {
// Scanner input = new Scanner(System.in);
// int n = input.nextInt();
// int[] nums = new int[n];
// for (int i = 0; i < nums.length; i++) {
// nums[i] = input.nextInt();
// }
// HashSet<Integer> squares = new HashSet<>();
// for (int num : nums) {
// squares.add(num * num);
// }
// int count = 0;
// for (int a : nums) {
// for (int b : nums) {
// int cSquare = a*a + b*b;
// if (a <= b && squares.contains(cSquare)) {
// int c = (int)Math.sqrt(cSquare);
// System.out.printf(
// "%d*%d + %d*%d = %d*%d\n",
// a, a, b, b, c, c);
// count++;
// }
// }
// }
// if (count == 0) {
// System.out.println("No");
// }
// }
//
// }
