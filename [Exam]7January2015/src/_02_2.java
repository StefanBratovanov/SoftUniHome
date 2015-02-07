import java.util.Scanner;

public class _02_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder inputLine = new StringBuilder(scan.nextLine());

		int currentIndex = 0;
		int bombStartIndex = 0;
		int bombEndIndex = 0;

		while ((bombStartIndex = inputLine.indexOf("|", currentIndex)) != -1) {
			bombEndIndex = inputLine.indexOf("|", bombStartIndex + 1);
			String bombCharcters = inputLine.substring(bombStartIndex + 1,
					bombEndIndex);
			int bombPower = 0;
			for (int i = 0; i < bombCharcters.length(); i++) {
				bombPower += bombCharcters.charAt(i);
			}
			bombPower %= 10;
		
			int startIndex =(bombStartIndex > bombPower)? bombStartIndex - bombPower : 0;
			int endIndex = (bombEndIndex + bombPower > inputLine.length())? inputLine.length()-1:bombEndIndex + bombPower;
			
			for (int i = startIndex; i <= endIndex; i++) {
				inputLine.setCharAt(i, '.');
			}
		}
		System.out.println(inputLine);
	}
}
