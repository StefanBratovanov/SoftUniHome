import java.awt.SecondaryLoop;
import java.util.*;

public class _04_SmallestOfThreeNumbres {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double firstNum = input.nextDouble();
		double secondNum = input.nextDouble();
		double thirdNum = input.nextDouble();
		double smallest = Math.min(Math.min(firstNum, secondNum), thirdNum);
		System.out.println("Smallest: " + smallest);
	}
}
