import java.util.Scanner;
import java.util.TreeMap;

public class _03_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.nextLine();
		scan.nextLine();
		scan.nextLine();
		String inputLine = scan.nextLine();
		TreeMap<Integer, TreeMap<String, Double>> exanScore = new TreeMap<>();
		while (!inputLine.contains("-")) {
			String[] input = inputLine.replaceFirst("^[\\s+,|]+", "").split(
					"[\\s+,|]+");
			String name = input[0] + " " + input[1];
			Integer score = Integer.parseInt(input[2]);
			Double grade = Double.parseDouble(input[3]);

			if (!exanScore.containsKey(score)) {
				exanScore.put(score, new TreeMap<String, Double>());
			}
			TreeMap<String, Double> nameGrade = exanScore.get(score);
			nameGrade.put(name, grade);
			
			inputLine = scan.nextLine();
		}
		for (Integer score : exanScore.keySet()) {
			System.out.print(score + " -> ");
			System.out.print(exanScore.get(score).keySet());
			Double sumGrades = 0.0;
			for (String name : exanScore.get(score).keySet()) {
				sumGrades+=exanScore.get(score).get(name);
			}
			System.out.printf("; avg=%.2f%n",sumGrades/exanScore.get(score).values().size());
		}
	}

}
