package kn222gn_assign1;

import java.util.ArrayList;
import java.util.List;

public class Deck {
	
	private List<Card> cardListDeck = new ArrayList<>();
	
	public Deck(){
		
		for(Card.Suit _suit : Card.Suit.values()){
			
			for(Card.Rank _rank : Card.Rank.values()){
				
				cardListDeck.add(new Card(_rank, _suit));
			}
		}
	}
	public void shuffle(){
		
		
	}

}
