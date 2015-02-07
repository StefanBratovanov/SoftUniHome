import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _04_ {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] input = scan.nextLine().split("[\\s,]+");

		ArrayList<String> club = new ArrayList<String>();
		ArrayList<String> dima = new ArrayList<String>();
		ArrayList<String> hear = new ArrayList<String>();
		ArrayList<String> spad = new ArrayList<String>();

		for (String string : input) {
			if (string.contains("C")) {
				club.add(string.replace("C", ""));
			}
			if (string.contains("D")) {
				dima.add(string.replace("D", ""));
			}
			if (string.contains("H")) {
				hear.add(string.replace("H", ""));
			}
			if (string.contains("S")) {
				spad.add(string.replace("S", ""));
			}
		}
		Collections.sort(club);
		additionalSort(club);
		Collections.sort(dima);
		additionalSort(dima);
		Collections.sort(hear);
		additionalSort(hear);
		Collections.sort(spad);
		additionalSort(spad);

		boolean foundC = printPossibleHands(club, "C");
		boolean foundD = printPossibleHands(dima, "D");
		boolean foundH = printPossibleHands(hear, "H");
		boolean foundS = printPossibleHands(spad, "S");
		if (((!foundS&&!foundC)&&!foundD)&&!foundH) {
		System.out.println("No Straight Flushes");	
		}
	}

	private static boolean printPossibleHands(ArrayList<String> hear, String Key) {
		String posiibles = "2345678910JQKA";
		boolean found = false;
		for (int i = 0; i < hear.size() - 4; i++) {
			String pattern = (hear.get(i) + hear.get(i + 1) + hear.get(i + 2)
					+ hear.get(i + 3) + hear.get(i + 4));
			Pattern patt = Pattern.compile(pattern);
			Matcher matcher = patt.matcher(posiibles);
			if (matcher.find()) {

				System.out.println("[" + hear.get(i) + Key + ", "
						+ hear.get(i + 1) + Key + ", " + hear.get(i + 2) + Key
						+ ", " + hear.get(i + 3) + Key + ", " + hear.get(i + 4)
						+ Key + "]");

			}
			found = true;
		}
		return found;
	}

	private static ArrayList<String> additionalSort(ArrayList<String> list) {
		// TODO Auto-generated method stub
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals("10")) {
				list.remove(list.get(i));
				list.add("10");
			}
		}
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals("J")) {
				list.remove(list.get(i));
				list.add("J");
			}
		}
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals("Q")) {
				list.remove(list.get(i));
				list.add("Q");
			}
		}
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals("K")) {
				list.remove(list.get(i));
				list.add("K");
			}
		}
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals("A")) {
				list.remove(list.get(i));
				list.add("A");

			}
		}
		return list;
	}
}