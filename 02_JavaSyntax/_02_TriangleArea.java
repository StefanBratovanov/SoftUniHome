import java.util.Scanner;

public class _02_TriangleArea {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double xA = input.nextDouble();
		double yA = input.nextDouble();
		double xB = input.nextDouble();
		double yB = input.nextDouble();
		double xC = input.nextDouble();
		double yC = input.nextDouble();
		double sideA = Math.sqrt(Math.pow(Math.abs(xB - xC), 2)
					 + Math.pow(Math.abs(yB - yC), 2));
		double sideB = Math.sqrt(Math.pow(Math.abs(xA - xC), 2)
					 + Math.pow(Math.abs(yA - yC), 2));
		double sideC = Math.sqrt(Math.pow(Math.abs(xA - xB), 2)
					 + Math.pow(Math.abs(yA - yB), 2));
		double p = (sideA + sideB + sideC)/2;
		double area = Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
		System.out.println(Math.round(area));
	}
}

//double area=Math.abs((ax*(by-cy)+bx*(cy-ay)+cx*(ay-by))*0.5);
//int res=(int) Math.round(area);
