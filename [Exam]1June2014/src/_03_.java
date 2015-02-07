import java.io.StreamCorruptedException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _03_ {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		ArrayList<String>nums = new ArrayList<String>();
		Pattern patt = Pattern.compile("[0-9]+\\.*[0-9]*");
		Matcher matcher = patt.matcher(input);
		while (matcher.find()) {
			nums.add(matcher.group());
		}
		String[] digits = nums.toArray(new String[nums.size()]);
		String[] signs = input.replaceFirst("^[\\d,\\s,.]+", "").split(
				"[\\d,\\s,.]+");
		BigDecimal sum = new BigDecimal("0.0");
		BigDecimal startElement = new BigDecimal(digits[0]);
		for (int i = 1; i < digits.length; i++) {
			sum = claculateSum(startElement, signs[i - 1], new BigDecimal(digits[i]));
			startElement = sum;
		}
		System.out.println(String.format("%.7f", sum));
	}
	
	private static BigDecimal claculateSum(BigDecimal startSum, String sign,
			BigDecimal numberTwo) {
		BigDecimal sum = new BigDecimal("0.0");
		if (sign.equals("-")) {
			sum = startSum.subtract(numberTwo);
		} else if (sign.equals("+")) {
			sum = startSum.add(numberTwo);
		}
		return sum;
	}

}







//import java.io.StreamCorruptedException;
//import java.util.ArrayList;
//import java.util.Scanner;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class _03_ {
//
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		String input = scan.nextLine();
//		ArrayList<String>nums = new ArrayList<String>();
//		Pattern patt = Pattern.compile("[0-9]+\\.*[0-9]*");
//		Matcher matcher = patt.matcher(input);
//		while (matcher.find()) {
//			nums.add(matcher.group());
//		}
//		String[] digits = nums.toArray(new String[nums.size()]);
//		String[] signs = input.replaceFirst("^[\\d,\\s,.]+", "").split(
//				"[\\d,\\s,.]+");
//		Double sum = 0.0;
//		Double startElement = Double.valueOf(digits[0]);
//		for (int i = 1; i < digits.length; i++) {
//			sum = claculateSum(startElement, signs[i - 1], digits[i]);
//			startElement = sum;
//		}
//		System.out.println(String.format("%.30f", sum));
//	}
//	
//	private static Double claculateSum(Double startSum, String sign,
//			String numberTwo) {
//		Double sum = 0.0;
//		if (sign.equals("-")) {
//			sum = startSum - Double.valueOf(numberTwo);
//		} else if (sign.equals("+")) {
//			sum = startSum + Double.valueOf(numberTwo);
//		}
//		return sum;
//	}
//
//}