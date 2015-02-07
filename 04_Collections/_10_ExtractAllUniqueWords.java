import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class _10_ExtractAllUniqueWords {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] input = scan.nextLine().toLowerCase().split("\\W+");

		Set<String> sorted = new TreeSet<String>();
		for (String token : input) {
			sorted.add(token);
		}
		for (String element : sorted) {
			System.out.print(element + " ");
		}
	}
}
