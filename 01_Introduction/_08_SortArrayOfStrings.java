import java.util.Scanner;

public class _08_SortArrayOfStrings {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number, for the amount of towns You want to work with:");
		int n = scan.nextInt();
		System.out.println();
		String[] towns = new String[n];
		for (int i = 0; i < n; i++) {
			towns[i] = scan.next();
		}
		for (int i = 0; i < towns.length - 1; i++) {
			for (int j = i + 1; j < towns.length; j++) {
				if (towns[i].compareTo(towns[j]) > 0) {
					String helpSwap = towns[i];
					towns[i] = towns[j];
					towns[j] = helpSwap;
				}
			}
		}
		for (String string : towns) {
			System.out.println(string);
		}
	}
}
