import java.util.*;

public class _07_CountOfBitsOne {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int count = 0;
		for (int i = 0; i < 32; i++) {
			int bit = number & 1;
			if (bit == 1) {
				count++;
			}
			number >>= 1;
		}
		System.out.println(count);
	}
}

// public class _07_CountOfBitsOne {
//
// public static void main(String[] args) {
// System.out.println("Enter an integer: ");
// int n = new Scanner(System.in).nextInt();
// String number = Integer.toBinaryString(n);
// int counterOnes = 0;
// for (int i = 0; i < number.length(); i++) {
// if (number.charAt(i) == '1') {
// counterOnes++;
// }
// }
// System.out.println(counterOnes);
// }
// }