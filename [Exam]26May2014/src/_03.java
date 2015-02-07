import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String regex = "\\d+";
		Pattern digitPatt = Pattern.compile(regex);
		Matcher match = digitPatt.matcher(input);
		
		ArrayList<String> listStrings = new ArrayList<String>();
		while (match.find()) {
			listStrings.add(match.group());
		}
		ArrayList<Integer> ints = new ArrayList<Integer>();

		for (String str : listStrings) {
			ints.add(Integer.valueOf(str));
		}
		
		ArrayList<Integer> product2s = new ArrayList<Integer>();
		for (int i = 0; i < ints.size()-1; i+=2) {
			product2s.addAll(Arrays.asList(ints.get(i)*ints.get(i+1)));    //product2s.add(ints.get(i)*ints.get(i+1));
		}
		
		ArrayList<Integer>sums = new ArrayList<Integer>();
		for (int i = 0; i < product2s.size()-2; i++) {
			sums.addAll(Arrays.asList(product2s.get(i)+product2s.get(i+1)+product2s.get(i+2)));
		}
		System.out.println(Collections.max(sums));
	}
}

//import java.util.Scanner;
//
//public class Largest3Rectangles {
//
//	public static void main(String[] args) {
//		
//		// Parse the rectangles and collect their areas
//		Scanner input = new Scanner(System.in);
//		String rectangles = input.nextLine();
//		rectangles = rectangles.replace("[", "");
//		rectangles = rectangles.replace(" ", "");
//		String[] rects = rectangles.split("]");
//		
//		int[] areas = new int[rects.length];
//		for (int i = 0; i < rects.length; i++) {
//			// Process each rectangle
//			String rect = rects[i];
//			rect = rect.replace("[", "");
//			String[] sides = rect.split("x");
//			int firstSide = Integer.parseInt(sides[0]);
//			int secondSide = Integer.parseInt(sides[1]);
//			areas[i] = firstSide * secondSide;
//		}
//		
//		// Calculate the max sequence of 3 rectangle areas
//		int max = Integer.MIN_VALUE;
//		for (int i = 2; i < areas.length; i++) {
//			int sum = areas[i-2] + areas[i-1] + areas[i];
//			if (sum > max) {
//				max = sum;
//			}
//		}
//		
//		System.out.println(max);		
//	}
//
//}
