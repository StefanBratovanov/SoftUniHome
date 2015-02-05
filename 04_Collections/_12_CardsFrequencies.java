import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class _12_CardsFrequencies {

	public static void main(String[] args) {

		Random rand = new Random();
		int n = rand.nextInt(11) + 1;

		// Generate Random Number of Cards and split it into words
		String input = generateHand(n).toString();
		System.out.println(input);
		String[] facesOnly = input.split("\\W+");

		// Create Map of uniqueCards and count the appearances of each word in
		// the faces Array
		Map<String, Integer> uniqueCards = new TreeMap<String, Integer>();
		for (String face : facesOnly) {
			Integer appearance = uniqueCards.get(face);
			if (appearance == null) {
				appearance = 0;
			}
			uniqueCards.put(face, appearance + 1);
		}

		// Create List of non-duplicate faces
		ArrayList<String> facesOnlyNoDuplic = new ArrayList<String>();
		for (String face : facesOnly) {
			if (facesOnlyNoDuplic.contains(face)) {
				continue;
			}
			facesOnlyNoDuplic.add(face);
		}

		// Get the value(appearances) representing key -> faces from non-duplicate List
		for (String face : facesOnlyNoDuplic) {
			double freq = 100.0 * uniqueCards.get(face) / n;
			System.out.printf("%s -> %.2f%%", face, freq);
			System.out.println();
		}
	}

	public static StringBuilder generateHand(int n) {
		char[] suits = { '\u2663', '\u2666', '\u2665', '\u2660' };
		String[] faces = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J",
				"Q", "K", "A" };

		Random rand = new Random();
		ArrayList<String> deckOfCards = new ArrayList<String>();
		for (int i = 0; i < faces.length; i++) {
			for (int j = 0; j < suits.length; j++) {
				deckOfCards.add(faces[i] + suits[j]);
			}
		}
		ArrayList<String> drawnCards = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int indexDrawnCard = rand.nextInt(deckOfCards.size());
			String drawnCard = deckOfCards.get(indexDrawnCard);
			deckOfCards.remove(indexDrawnCard);
			drawnCards.add(drawnCard);
		}
		StringBuilder sb = new StringBuilder();
		for (String string : drawnCards) {
			sb.append(string + " ");
		}
		return sb;
	}
}
