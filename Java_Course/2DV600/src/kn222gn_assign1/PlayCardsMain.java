package kn222gn_assign1;

public class PlayCardsMain {

	public static void main(String args[]){
		
		Deck deckClass = new Deck();
		//shuffles the deck everytime 
		deckClass.shuffle();
		
		System.out.print("\nThe deck is made out of: " + deckClass.sizeOfDeck() + " playing cards.\n");
		
		//loops out 6 cards from the deck
		for (int i = 1; i < 6; i++){
			Card card = deckClass.takeACard();
			System.out.println("\n" + card.rank() + " of " + card.suit());
			System.out.println("\nCards left in the deck: " + deckClass.sizeOfDeck());
		}
	}
}
