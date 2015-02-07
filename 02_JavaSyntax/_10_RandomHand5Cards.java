
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class _10_RandomHand5Cards {
	public static void main(String[] args) {
		char[] suits = { '\u2663', '\u2666', '\u2665', '\u2660' };
		String[] faces = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J",
				"Q", "K", "A" };
		int n = new Scanner(System.in).nextInt();
		Random rand = new Random();

		ArrayList<String> deckOfCards = new ArrayList<String>();
		for (int i = 0; i < faces.length; i++) {
			for (int j = 0; j < suits.length; j++) {
				deckOfCards.add(faces[i] + suits[j]);
			}
		}
		ArrayList<String> drawnCards = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 5; j++) {
				int indexDrawnCard = rand.nextInt(deckOfCards.size());
				String drawnCard = deckOfCards.get(indexDrawnCard);
				deckOfCards.remove(indexDrawnCard);
				drawnCards.add(drawnCard);
				System.out.print(drawnCard + " ");
			}
			System.out.println();
			deckOfCards.addAll(drawnCards);
		}
	}
}
