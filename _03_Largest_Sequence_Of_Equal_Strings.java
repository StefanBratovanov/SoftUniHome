import java.util.ArrayList;
import java.util.Scanner;


public class _03_Largest_Sequence_Of_Equal_Strings {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String[] string = input.nextLine().split(" ");
		ArrayList<String> largestSeq = new ArrayList<String>();
		ArrayList<String> currentSeq = new ArrayList<String>();
		
		largestSeq.add(string[0]);
		currentSeq.add(string[0]);
		
		for (int i = 1; i < string.length; i++){
			if (!string[i].equals(string[i-1])){
				currentSeq.clear();
			}
			currentSeq.add(string[i]);
			
			if (currentSeq.size() > largestSeq.size()){
				largestSeq = new ArrayList<String>(currentSeq);
			}
		}
		
		for (String seq : largestSeq){
			System.out.print(seq + " ");
		}
		
	}

}
