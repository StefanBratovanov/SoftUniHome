import java.util.Scanner;

public class _01_RectangleArea {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter side A of a rectangle:");
		double a = input.nextDouble();
		System.out.println("Enter side B of a rectangle:");
		double b = input.nextDouble();
		double area = a * b;		
		System.out.printf("Area of the rectangle: %.2f", area);
	}
}
