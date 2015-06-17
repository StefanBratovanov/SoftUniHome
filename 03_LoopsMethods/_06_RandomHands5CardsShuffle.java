import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class _06_RandomHands5CardsShuffle {
	public static void main(String[] args) {

		char[] suits = { '\u2663', '\u2666', '\u2665', '\u2660' };
		String[] faces = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J",
				"Q", "K", "A" };
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		ArrayList<String> deck = new ArrayList<String>();
		for (String face : faces) {
			for (char suit : suits) {
				deck.add(face + suit);
			}
		}
		for (int i = 0; i < n; i++) {
			Collections.shuffle(deck);
			for (String s : deck.subList(0, 5)) {
				System.out.print(s + " ");
			}
			System.out.println();
			// System.out.println(deck.subList(0, 5).toString());
		}
	}
}
