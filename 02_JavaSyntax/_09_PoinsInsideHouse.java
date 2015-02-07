import java.util.Scanner;

public class _09_PoinsInsideHouse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out
				.println("Enter X and Y coordinates of a point on a single line:");
		double x = input.nextDouble();
		double y = input.nextDouble();
		boolean inSqaure = false;
		boolean inRectangle = false;
		boolean inTriangle = false;

		if ((x >= 12.5 && x <= 17.5) && (y <= 13.5 && y >= 8.5)) {
			inSqaure = true;
		}
		if ((x >= 20 && x <= 22.5) && (y <= 13.5 && y >= 8.5)) {
			inRectangle = true;
		}
		double xA = 12.5;
		double yA = 8.5;
		double xB = 22.5;
		double yB = 8.5;
		double xC = 17.5;
		double yC = 3.5;

		double abc = Math.abs(xA * (yB - yC) + xB * (yC - yA) + xC * (yA - yB));
		double abp = Math.abs(xA * (yB - y) + xB * (y - yA) + x * (yA - yB));
		double acp = Math.abs(xA * (y - yC) + x * (yC - yA) + xC * (yA - y));
		double bcp = Math.abs(x * (yB - yC) + xB * (yC - y) + xC * (y - yB));
		if (abp + acp + bcp == abc) {
			inTriangle = true;
		}
		if (inSqaure || inRectangle || inTriangle == true) {
			System.out.println("Inside");
		} else
			System.out.println("Outside");
	}
}
