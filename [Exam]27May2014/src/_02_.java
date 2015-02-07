import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class _02_ {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		ArrayList<BigDecimal> list = new ArrayList<BigDecimal>();
		for (int i = 0; i < n; i++) {
			BigDecimal m = new BigDecimal(scan.next());
			list.add(m);
		}
		Collections.sort(list);
		if (list.size() >= 3) {
			BigDecimal big = list.get(list.size()-1);
			list.remove(big);
			BigDecimal smaller = list.get(list.size()-1);
			list.remove(smaller);
			BigDecimal smallest = list.get(list.size()-1);
			System.out.println(big.toPlainString());
			System.out.println(smaller.toPlainString());
			System.out.println(smallest.toPlainString());
		} else if (list.size() == 2) {
			BigDecimal big = list.get(list.size()-1);
			list.remove(big);
			BigDecimal smaller = list.get(list.size()-1);
			System.out.println(big.toPlainString());
			System.out.println(smaller.toPlainString());
		} else if (list.size() == 1) {
			BigDecimal big = list.get(list.size()-1);
			System.out.println(big.toPlainString());
		}
	}
}
//	public class ThreeLargestNumbers {
//
//		public static void main(String[] args) {
//			Locale.setDefault(Locale.ROOT);
//			Scanner input = new Scanner(System.in);
//			int n = input.nextInt();
//			input.nextLine();
//			BigDecimal[] nums = new BigDecimal[n];
//			for (int i = 0; i < nums.length; i++) {
//				String num = input.nextLine();
//				nums[i] = new BigDecimal(num);
//			}
//			Arrays.sort(nums);
//			int count = 3;
//			for (int i = nums.length-1; i >= 0 && count > 0; i--, count--) {
//				System.out.println(nums[i].toPlainString());
//			}
//		}
//
//	}

//public class _02_ {
//
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		TreeSet<BigDecimal> list = new TreeSet<BigDecimal>();
//		for (int i = 0; i < n; i++) {
//			BigDecimal m = new BigDecimal(scan.next());
//			list.add(m);
//		}
//		if (list.size() >= 3) {
//			BigDecimal big = list.last();
//			list.remove(big);
//			BigDecimal smaller = list.last();
//			list.remove(smaller);
//			BigDecimal smallest = list.last();
//			System.out.println(big);
//			System.out.println(smaller);
//			System.out.println(smallest);
//		} else if (list.size() == 2) {
//			BigDecimal big = list.last();
//			list.remove(big);
//			BigDecimal smaller = list.last();
//			System.out.println(big);
//			System.out.println(smaller);
//		} else if (list.size() == 1) {
//			BigDecimal big = list.last();
//			System.out.println(big);
//		}
//	}



// BigDecimal m = new BigDecimal("3.0000000000000");
// System.out.println(m);
// ArrayList<Integer> list = new ArrayList<Integer>();
// list.add(6);
// list.add(2);
// list.add(8);
// list.add(-5);
// list.sort(null);
// System.out.println(list);
// System.out.println(list.get(list.size()-1));
// System.out.println(list.get(list.size()-2));
// System.out.println(list.get(list.size()-3));