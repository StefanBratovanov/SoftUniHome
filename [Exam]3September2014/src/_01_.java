import java.util.Scanner;

public class _01_ {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int totalCount = 0;
		for (int i = 0; i < 7; i++) {
			int count = scan.nextInt();
			String measure = scan.next();
			if (measure.equals("eggs")) {
				totalCount+=count;
			}
			else if (measure.equals("dozens")) {
				totalCount+=count*12;
			}
		}
		int dozens = totalCount/12;
		int eggs = totalCount%12;
		System.out.printf("%d dozens + %d eggs",dozens,eggs);
	}
}
