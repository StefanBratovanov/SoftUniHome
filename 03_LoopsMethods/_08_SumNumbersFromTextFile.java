import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class _08_SumNumbersFromTextFile {

	public static void main(String[] args) {

		String fileName = "input.txt";
		Scanner fileReader = null;
		try {
			fileReader = new Scanner(new File(fileName));

			int sum = 0;
			while (fileReader.hasNextInt()) {
				sum += fileReader.nextInt();
			}
			System.out.println(sum);
		} catch (FileNotFoundException fnf) {
			System.out.println("File " + fileName + " not found!");
		} finally {
			if (fileReader != null) {
				fileReader.close();
			}
		}
	}

}
