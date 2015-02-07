import java.util.Scanner;
import java.util.TreeSet;

public class _01_ {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] input = scan.nextLine().split("\\W+");
		int count = 0;
		TreeSet<String>matches = new TreeSet<String>();
		if (input.length==1||input.length==2) {
			count = 0;
		}
		else {
			for (int i = 0; i < input.length; i++) {
				for (int j = 0; j < input.length; j++) {
					for (int k = 0; k < input.length; k++) {
						String a = input[i];
						String b = input[j];
						String c = input[k];

						if ((a + b).equals(c)) {
							String result = a + "|" + b + "=" + c;
							matches.add(result);
							count++;
						}
					}
				}
			}
		}
		for (String match : matches) {
			System.out.println(match);
		}
		if (count == 0) {
			System.out.println("No");
		}
	}
}
