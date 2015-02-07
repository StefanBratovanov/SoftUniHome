import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class _04_ {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] split = scan.nextLine().split(" ");

		// ArrayList for all ints the way they are in the original input
		ArrayList<Integer> intsWithDuplex = new ArrayList<Integer>();
		for (int i = 0; i < split.length; i++) {
			intsWithDuplex.add(Integer.parseInt(split[i]));
		}
		// ArrayList for all couples the way they are in the original input
		ArrayList<ArrayList<Integer>> doublesWithDuplex = new ArrayList<>();

		for (int i = 0; i < intsWithDuplex.size() - 1; i++) {
			ArrayList<Integer> singleDouble = new ArrayList<Integer>();
			singleDouble.add(intsWithDuplex.get(i));
			singleDouble.add(intsWithDuplex.get(i + 1));
			doublesWithDuplex.add(singleDouble);
		}
		// ArrayList for all couples No duplexes the way they are in the
		// original input
		ArrayList<ArrayList<Integer>> couplsNoDuplex = new ArrayList<>();
		for (ArrayList<Integer> arrayList : doublesWithDuplex) {
			if (couplsNoDuplex.contains(arrayList)) {
				continue;
			}
			couplsNoDuplex.add(arrayList);
		}
		// HashMap for all couples No duplexes and frequances
		HashMap<ArrayList<Integer>, Integer> doublesFreq = new HashMap<ArrayList<Integer>, Integer>();
		for (ArrayList<Integer> doublesList : doublesWithDuplex) {
			Integer appearances = doublesFreq.get(doublesList);
			if (appearances == null) {
				appearances = 0;
			}
			doublesFreq.put(doublesList, appearances + 1);
		}
		// Key -> couples from  couplsNoDuplex the way they are in the original input;
		// Value -> Get from HashMap eqivalent to Key
		for (ArrayList<Integer> List : couplsNoDuplex) {
			
			double freq = doublesFreq.get(List) * 100.0
					/ doublesWithDuplex.size();
			System.out
					.printf("%s %s -> %.2f%%", List.get(0), List.get(1), freq);
			System.out.println();
		}
	}
}
