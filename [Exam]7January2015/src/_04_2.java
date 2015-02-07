import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class _04_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		TreeMap<String, TreeMap<String, ArrayList<Double>>> studentInfo = new TreeMap<String, TreeMap<String, ArrayList<Double>>>();
		for (int i = 0; i < n; i++) {
			String[] input = scan.nextLine().split(" ");
			String name = input[0] + " " + input[1];
			String subject = input[2];
			Double grade = Double.parseDouble(input[3]);

			if (!studentInfo.containsKey(name)) {
				studentInfo.put(name, new TreeMap<String, ArrayList<Double>>());
			}
			TreeMap<String, ArrayList<Double>> subjectsAndGrades = studentInfo.get(name);
			
			if (!subjectsAndGrades.keySet().contains(subject)) {
				subjectsAndGrades.put(subject, new ArrayList<Double>());
			}
			ArrayList<Double> individualGrades = subjectsAndGrades.get(subject);
			individualGrades.add(grade);

		}
		for (String name : studentInfo.keySet()) {
			System.out.print(name + ": [");
			String output = "";
			for (String subject : studentInfo.get(name).keySet()) {
				output += subject + " - ";
				double avg = 0.0;
				for (int i = 0; i < studentInfo.get(name).get(subject).size(); i++) {
					avg += studentInfo.get(name).get(subject).get(i);
				}
				avg /= studentInfo.get(name).get(subject).size();
				output +=String.format("%.2f, ", avg);
			}
			System.out.println(output.substring(0, output.length()-2)+"]");
		}
	}

}
