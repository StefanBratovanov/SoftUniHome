import java.util.HashMap;
import java.util.Scanner;

public class _02_ {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] input = scan.nextLine().split("[ ,C,D,H,S]+");
		HashMap<String, Integer> cards = new HashMap<String, Integer>();
		for (int i = 2; i < 11; i++) {
			cards.put(i + "", Integer.valueOf(i));
		}
		cards.put("J", 12);
		cards.put("Q", 13);
		cards.put("K", 14);
		cards.put("A", 15);
		int sum = 0;
		int multiplyer = 1;
		int countEquals = 1;
		String startElement = input[0];
		
		if (input.length == 1) {
			sum = cards.get(input[0]);
		}
		for (int i = 1; i < input.length; i++) {
			
			if (input[i].equals(startElement)) {
				multiplyer = 2;
				countEquals++;
				
				if (i == input.length - 1) {						 			//Last element
					sum += cards.get(input[i - 1]) * multiplyer * countEquals;
				}
			} else {
				sum += cards.get(input[i - 1]) * multiplyer * countEquals;
				multiplyer = 1;
				countEquals = 1;
				startElement = input[i];
				
				if (i == input.length - 1) {  							        //Last element
					sum += cards.get(input[i]) * multiplyer * countEquals;
				}
			}
		}
		System.out.println(sum);
	}
}