import java.io.StreamCorruptedException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _03_ {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String inputLine = scan.nextLine();
		ArrayList<String> input = new ArrayList<String>();
		Pattern pattern = Pattern.compile("\\b[a-zA-Z]\\w+");
		Matcher matcher = pattern.matcher(inputLine);
		while (matcher.find()) {
			if (matcher.group().length() >= 3 && matcher.group().length() <= 25) {
				input.add(matcher.group());
			}
		}
		int sum = 1;
		int maxSum = 1;
		String[] bigestL = new String[2];

		for (int i = 1; i < input.size(); i++) {
			sum = input.get(i - 1).length() + input.get(i).length();
			if (sum > maxSum) {
				bigestL[0] = input.get(i - 1);
				bigestL[1] = input.get(i);
				maxSum = sum;
			}
		}
		System.out.println(bigestL[0]);
		System.out.println(bigestL[1]);
	}
}
