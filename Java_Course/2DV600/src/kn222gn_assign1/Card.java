package kn222gn_assign1;

public class Card {
	
	private Suit suit;
	private Rank rank;
	private int valueOfDeck;
	
	public enum Rank{
		
		Ace,
		Two,
		Three,
		Four,
		Five,
		Six,
		Seven,
		Eight,
		Nine,
		Ten,
		Jack,
		Queen,
		King;
	}
	
	public enum Suit{
		
		Clubs,
		Spades,
		Hearts,
		Diamonds;
	}
	
	public Card(Rank rank, Suit suit){
		
		this.suit = suit;
		this.rank = rank;
	}
	
	//Getters
	public Rank rank(){
		
		return rank;
	}
	public Suit suit(){
			
		return suit;
	}
	
	/*public void fillDeck(){
		
		int i = 0;
		
		for(Suit s : Suit.values()){
			
			for(Rank r : Rank.values()){
				
				
			}
		}
	}*/

}
