import java.awt.Checkbox;
import java.util.Scanner;

public class _03_ {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[] input = scan.nextLine().replaceFirst("^[\\W,\\s]+", "")
				.split("[\\W,\\s]+");
		int[] digits = new int[input.length];
		for (int i = 0; i < digits.length; i++) {
			digits[i] = Integer.parseInt(input[i]);
		}

		int maxLenght = 1;
		int lenght = 1;
		int startElem = digits[0];
		for (int i = 1; i < digits.length; i++) {
			if (digits.length == 2 && digits[0] == 0) {
				maxLenght = 2;
				continue;
			}
//			if (digits.length == 3 && digits[0] == 0) {
//				maxLenght = 2;
//				continue;
//			}
			if (((checkIfEven(digits[i]) != checkIfEven(startElem)) || (digits[i]) == 0)
					|| ((i > 1)&&(digits.length>1)
					&& checkIfEven(digits[i])
					&& checkIfEven(digits[i - 2]) && (digits[i - 1] == 0))) {
				lenght++;
				startElem = digits[i];
				if (lenght > maxLenght) {
					maxLenght = lenght;
				}
			}
			// if ((i > 2) && checkIfEven(digits[i]) && checkIfEven(digits[i -
			// 2])
			// && digits[i - 1] == 0) {
			// lenght++;
			// startElem = digits[i];
			// if (lenght > maxLenght) {
			// maxLenght = lenght;
			// }
			// }

			else {
				startElem = digits[i];
				lenght = 1;
			}
		}
		System.out.println(maxLenght);
	}

	public static boolean checkIfEven(int number) {
		if (number % 2 == 0) {
			return true;
		} else
			return false;
	}
}

// import java.awt.Checkbox;
// import java.util.Scanner;
//
// public class _03_ {
//
// public static void main(String[] args) {
// Scanner scan = new Scanner(System.in);
//
// String[] input = scan.nextLine().replaceFirst("^[\\W,\\s]+", "")
// .split("[\\W,\\s]+");
// int[] digits = new int[input.length];
// for (int i = 0; i < digits.length; i++) {
// digits[i] = Integer.parseInt(input[i]);
// }
//
// int maxLenght = 1;
// int lenght = 1;
// int startElem = digits[0];
// for (int i = 1; i < digits.length; i++) {
// if (((checkIfEven(digits[i]) != checkIfEven(startElem)) || (digits[i]) == 0))
// {
// lenght++;
// startElem = digits[i];
// if (lenght > maxLenght) {
// maxLenght = lenght;
// }
// } else {
// startElem = digits[i];
// lenght = 1;
// }
// }
// System.out.println(maxLenght);
// }
//
// public static boolean checkIfEven(int number) {
// if (number % 2 == 0) {
// return true;
// } else
// return false;
// }
// }
