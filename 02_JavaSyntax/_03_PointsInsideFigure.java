import java.util.*;

public class _03_PointsInsideFigure {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter X and Y coordinates of a point on a single line:");
		double x = input.nextDouble();
		double y = input.nextDouble();
		boolean inSqaure = false;
		boolean inLongRec = false;
		boolean inSmallRec = false;
		if ((x >= 12.5 && x <= 17.5) && (y <= 13.5 && y >= 8.5)) {
			inSqaure = true;
		}
		if ((x >= 12.5 && x <= 22.5) && (y <= 8.5 && y >= 6)) {
			inLongRec = true;
		}
		if ((x >= 20 && x <= 22.5) && (y <= 13.5 && y >= 8.5)) {
			inSmallRec = true;
		}
		if (inLongRec||inSmallRec||inSqaure == true) {
			System.out.println("Inside");
		}
		else {
			System.out.println("Outside");
		}
	}
}
