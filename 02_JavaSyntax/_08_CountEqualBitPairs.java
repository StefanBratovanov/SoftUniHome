import java.util.*;

public class _08_CountEqualBitPairs {

	public static void main(String[] args) {
		System.out.println("Enter an integer:");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int countEq = 0;
		int leftBit = 1 & n;

		while (n > 0) {
			n = n >> 1;
			int currentBit = 1 & n;
			if (currentBit == leftBit) {
				countEq++;
			}
			leftBit = currentBit;
		}
		System.out.println(countEq);
	}
}

// public class _08_CountEqualBitPairs {
//
// public static void main(String[] args) {
// System.out.println("Enter an integer:");
// int n = new Scanner(System.in).nextInt();
// String number = Integer.toBinaryString(n);
// int counter = 0;
// for (int i = 0; i < number.length() - 1; i++) {
// if (number.charAt(i) == number.charAt(i + 1)) {
// counter++;
// }
// }
// System.out.println(counter);
// }
// }
