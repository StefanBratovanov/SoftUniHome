import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _05_CountAllWords {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String wordRegEx = "\\w+";
		Pattern wordPattern = Pattern.compile(wordRegEx);
		Matcher wordMatcher = wordPattern.matcher(input);
		int counterWords = 0;
		while (wordMatcher.find()) {
			counterWords++;
		}
		System.out.println(counterWords);
	}
}

//String[] sentance = input.split("[,. ;\t\n!?-]+");
//int count = sentance.length;
//System.out.println(count);

//String[] sentance = input.split("\\W+");
//System.out.println(sentance.length);
