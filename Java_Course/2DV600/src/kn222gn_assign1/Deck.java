package kn222gn_assign1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
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
		
		if(cardListDeck.size() == 52){
			
			Collections.shuffle(cardListDeck);
			return;
		}
		else{
			System.out.print("Deck isn't made of 52 cards");
			System.exit(0);
		}
	}
	public Card takeACard(){
		
		Card takeACardFromDeck = cardListDeck.get(cardListDeck.size() - 1);
		
		cardListDeck.remove(cardListDeck.size() - 1);
		
        return takeACardFromDeck;
	}
	public int sizeOfDeck(){
		
		return cardListDeck.size();
	}
}
