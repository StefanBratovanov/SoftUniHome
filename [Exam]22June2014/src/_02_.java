import java.util.Scanner;

public class _02_ {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int centerX = scan.nextInt();
		int centerY = scan.nextInt();
		int r = scan.nextInt();
		int n = scan.nextInt();
		scan.nextLine();
		String[] pointsSplit = scan.nextLine().split("\\s+");
		Integer[] coordinates = new Integer[pointsSplit.length];
		for (int i = 0; i < pointsSplit.length; i++) {
			coordinates[i] = Integer.parseInt(pointsSplit[i]);
		}
		double xA = centerX - r;
		double yA = centerY - r / 2.0;
		double xB = centerX + r;
		double yB = centerY + r / 2.0;
		double xC = centerX - r / 2.0;
		double yC = centerY - r;
		double xD = centerX + r / 2.0;
		double yD = centerY + r;

		for (int i = 0; i < coordinates.length - 1; i += 2) {
			double X = coordinates[i];
			double Y = coordinates[i + 1];
			if ((X >= xA && X <= xB) && (Y >= yA && Y <= yB)
					|| (X >= xC && X <= xD) && (Y >= yC && Y <= yD)) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
	}
}
