import java.util.Scanner;

public class _06_SumTwoNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number one:");
		int numberOne = scan.nextInt();
		System.out.println("Enter number two:");
		int numberTwo = scan.nextInt();
		long sum = numberOne + numberTwo;
		System.out.println("The sum is: " + sum);
	}
}
