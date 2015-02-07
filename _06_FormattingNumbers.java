import java.util.*;

public class _06_FormattingNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		double b = input.nextDouble();
		double c = input.nextDouble();
		int binaryValue = Integer.parseInt(Integer.toBinaryString(a));
		
		System.out.printf("|%-10X|%010d|%10.2f|%-10.3f|", a, binaryValue, b, c);
	}
}
