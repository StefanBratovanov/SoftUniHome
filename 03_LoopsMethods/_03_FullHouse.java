public class _03_FullHouse {

	public static void main(String[] args) {

		char[] suits = { '\u2663', '\u2666', '\u2665', '\u2660' };
		String[] faces = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J",
				"Q", "K", "A" };

		/*
		  //print all cards by suit
		    for (int i = 0; i < suits.length; i++) {
		 		for (int j = 0; j < faces.length; j++) { 
		 			System.out.print(faces[j] + suits[i] + " ");
		 	 } System.out.println();
		 	    } 
		 	 		 		 
		 // print all cards by face
		 	for (int i = 0; i < faces.length; i++) { 
		 		for (int j = 0; j < suits.length; j++) { 
		 			System.out.print(faces[i] + suits[j] + " "); 
		 	}
		  		System.out.println();
		  	 	}
		 */
		int counter = 0;
		for (int card1 = 0; card1 < faces.length; card1++) {
			for (int card2 = 0; card2 < faces.length; card2++) {
				
				for (int suit = 0; suit < suits.length; suit++) {
					for (int suit1 = suit+1; suit1 < suits.length; suit1++) {
						for (int suit2 = suit1+1; suit2 < suits.length; suit2++) {
							
							for (int suit4 = 0; suit4 < suits.length; suit4++) {
								for (int suit5 = suit4+1; suit5 < suits.length; suit5++) {
									
									if (card2 != card1) {
										System.out.println(faces[card1] + suits[suit]+ " " 
												+ faces[card1]+ suits[suit1] + " "
												 + faces[card1]+ suits[suit2] + " "											
												+ faces[card2] + suits[suit4]+ " " 
												+ faces[card2]+ suits[suit5]);
										counter++;
									}
								}
							}
						}
					}

				}
			}

		}
		System.out.println(counter);
	}
}
