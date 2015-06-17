import java.util.Scanner;

public class _05_AngleUnitConverter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.nextLine();

		for (int i = 0; i < n; i++) {
			double converted = 0;
			String query = input.nextLine();
			String[] splitted = query.split(" ");
			double number = Double.parseDouble(splitted[0]);
			String measure = splitted[1];
			if (measure.equals("deg")) {
				converted = convertToRadians(number);
			}
			if (measure.equals("rad")) {
				converted = convertToDegrees(number);
			}
			System.out.printf("%.6f", converted);
			System.out.println();
		}
	}

	private static double convertToDegrees(double rads) {
		double degress = rads * 180 / Math.PI;
		return degress;
	}

	private static double convertToRadians(double degress) {
		double radians = degress * Math.PI / 180;
		return radians;
	}

}
