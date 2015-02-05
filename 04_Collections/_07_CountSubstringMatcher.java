import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class _07_CountSubstringMatcher {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String string = input.nextLine().toLowerCase();
		String match = input.nextLine().toLowerCase();
		Pattern text = Pattern.compile(match);
		Matcher m = text.matcher(string);
		int count = 0;
		
		while (m.find()){
			count++;
			int firstIndex = m.start();
			m.region(firstIndex + 1, string.length());
		}
		
		System.out.println(count);
		
	}

}
