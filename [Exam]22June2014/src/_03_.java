import java.util.Scanner;
import java.util.TreeMap;

public class _03_ {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.nextLine();
		scan.nextLine();
		scan.nextLine();
		TreeMap<Integer, TreeMap<String, Double>> allScores = new TreeMap<Integer, TreeMap<String, Double>>();
		while (true) {
			String input = scan.nextLine();
			if (input.contains("-")) {
				break;
			}
			String inputSplited[] = input.replaceFirst("[\\s+,|]+", "").split(
					"[\\s+,|]+");
			String splittedGood[] = new String[inputSplited.length - 1];
			String name = splittedGood[0] = inputSplited[0] + " "
					+ inputSplited[1];
			Integer scoreUser = Integer
					.parseInt(splittedGood[1] = inputSplited[2]);
			Double grade = Double
					.parseDouble(splittedGood[2] = inputSplited[3]);

			if (!allScores.containsKey(scoreUser)) {
				allScores.put(scoreUser, new TreeMap<String, Double>());
			}
			TreeMap<String, Double> namesAndGrades = allScores.get(scoreUser);
			namesAndGrades.put(name, grade);
		}
		for (Integer score : allScores.keySet()) {
			System.out.print(score + " -> ");
			Double allGrades = 0.0;
			Double counter = 0.0;
			for (String student : allScores.get(score).keySet()) {
				allGrades+=allScores.get(score).get(student);
				counter++;
			}
			Double averageGrades = allGrades/counter;
			System.out.print(allScores.get(score).keySet() + "; ");
			System.out.printf("avg=%.2f",averageGrades);
			System.out.println();
		}
	}

}
