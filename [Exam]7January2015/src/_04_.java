import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class _04_ {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		TreeMap<String, TreeMap<String, ArrayList<Integer>>> infoStudent = new TreeMap<String, TreeMap<String, ArrayList<Integer>>>();
		for (int i = 0; i < n; i++) {
			String inputLine = scan.nextLine();
			String[] elements = inputLine.split(" ");
			String name = elements[0] + " " + elements[1];
			String project = elements[2];
			Integer grade = Integer.valueOf(elements[3]);
			
			if (!infoStudent.containsKey(name)) {
				infoStudent.put(name, new TreeMap<String, ArrayList<Integer>>());
			}
			TreeMap<String, ArrayList<Integer>> projectAndGrades = infoStudent.get(name);

			if (projectAndGrades.keySet().contains(project)) {
				projectAndGrades.get(project).add(grade);
			} else {
				projectAndGrades.put(project, new ArrayList<Integer>());
				ArrayList<Integer> nameGrades = projectAndGrades.get(project);
				nameGrades.add(grade);
			}
		}
	}
}