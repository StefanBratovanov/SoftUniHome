import java.util.Scanner;

public class _03_LargestSequenceOfEqualStringsOtherWay {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		String[] strArr = input.split(" ");
		
		int start = 0, bestStart = 0;
		int length = 1, bestLength = 1;
		
		for(int i = 1; i < strArr.length; i++) {
			if (strArr[i].equals(strArr[i - 1])){
				start = i;
				length++;
				if(bestLength < length) {
					bestStart = start;
					bestLength = length;
				}
			} else {
				length = 1;
			}
		}
		for(int i = 0; i < bestLength; i++) {
			System.out.print(strArr[bestStart] + " ");
		}
	}
}
