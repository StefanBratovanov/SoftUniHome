import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _02_ {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();
		Pattern pat = Pattern.compile("\\|(.*?)\\|");
		Matcher mach = pat.matcher(line);
		while (mach.find()) {
			String bomb = mach.group(1);
			int bombSize = 0;
			for (int i = 0; i < bomb.length(); i++) {
				bombSize += bomb.charAt(i);
			}
			bombSize %= 10;

			String regex = ".{0," + bombSize + "}\\|(.*?)\\|.{0," + bombSize + "}";

			Pattern inPat = Pattern.compile(regex);
			Matcher matcher = inPat.matcher(line);

			boolean foundArea = matcher.find();

			if (foundArea) {
				String area = matcher.group();
				String dots = area.replaceAll(".", "\\.");
				line = line.replace(area, dots);
			}
			System.out.println(line);
		}
	}

}
