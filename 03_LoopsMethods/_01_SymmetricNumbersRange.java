import java.util.Scanner;

public class _01_SymmetricNumbersRange {

	public static void main(String[] args) {
		System.out.println("Enter an integer interval:");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();

		for (int i = n; i <= m; i++) {
			String number = Integer.toString(i);
			if (i >= 0 && i <= 9) {
				System.out.print(i + " ");
			} 
			else if (i >= 10 && i <= 99) {
				if (number.charAt(0) == number.charAt(1)) {
					System.out.print(i + " ");
				}
			}
			else if (number.charAt(0) == number.charAt(2)) {
				System.out.print(i + " ");
			}
		}
	}
}
