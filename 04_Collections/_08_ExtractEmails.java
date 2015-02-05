import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _08_ExtractEmails {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();

		String EmailRegEx = "[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})";
		Pattern pattern = Pattern.compile(EmailRegEx);
		Matcher match = pattern.matcher(input);
		while (match.find()) {
			System.out.println(match.group());
		}
	}
}
