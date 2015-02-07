import java.text.ParseException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class _01_ {

	public static void main(String[] args) throws ParseException {
		Scanner scan = new Scanner(System.in);
		String start = scan.nextLine();
		String end = scan.nextLine();
		String[] S = start.split(":");
		long hoursS = Long.valueOf(S[0]);
		long MinsS = Long.valueOf(S[1]);
		long secS = Long.valueOf(S[2]);

		long one = TimeUnit.HOURS.toSeconds(hoursS);
		long two = TimeUnit.MINUTES.toSeconds(MinsS);
		long three = TimeUnit.SECONDS.toSeconds(secS);
		long SumOne = one + two + three;

		String[]E = end.split(":");
		long hoursE = Long.valueOf(E[0]);
		long MinsE = Long.valueOf(E[1]);
		long secE = Long.valueOf(E[2]);

		long oneE = TimeUnit.HOURS.toSeconds(hoursE);
		long twoE = TimeUnit.MINUTES.toSeconds(MinsE);
		long threeE = TimeUnit.SECONDS.toSeconds(secE);
		long SumTwo = oneE + twoE + threeE;
		
		long diff = Math.abs(SumTwo - SumOne);
		
		
		long diffHours = diff / (60 * 60 );
		long diffMinutes = (diff % (60 * 60 ))/60;
		long diffSeconds =(diff % (60 * 60 ))%60 ;
		System.out.printf("%d:%02d:%02d",diffHours,diffMinutes, diffSeconds);
	}
}
