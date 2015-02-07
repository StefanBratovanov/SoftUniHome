import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class _11_DateTime {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String d1String = input.nextLine();
		String d2String = input.nextLine();

		DateTimeFormatter form = DateTimeFormatter.ofPattern("d-MM-yyyy");
		LocalDate start = LocalDate.parse(d1String, form);
		LocalDate end = LocalDate.parse(d2String, form);

		long diffDays = ChronoUnit.DAYS.between(start, end);
		System.out.println(diffDays);
		
	}

}

// public class _11_DateTime {
//
// public static void main(String[] args) {
// Scanner input = new Scanner(System.in);
//
// String d1String = input.nextLine();
// String d2String = input.nextLine();
//
// SimpleDateFormat form = new SimpleDateFormat("dd-MM-yyyy");
//
// Date dateOne;
// Date dateTwo;
// try {
// dateOne = form.parse(d1String);
// dateTwo = form.parse(d2String);
// long start = dateOne.getTime();
// long end = dateTwo.getTime();
//
// long differenceDays = end - start;
// System.out.println(TimeUnit.MILLISECONDS.toDays(differenceDays));
// } catch (ParseException e) {
// System.out.println("Unparseable using " + form);
//
// }
//
// }
//
// }
