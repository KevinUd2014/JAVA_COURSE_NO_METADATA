package kn222gn_assign1_CardGameAssignment;

public class Play123Main {

	
	public static void main(String args[]){
		
		int win = 0;
		
		int timesToPlay = 10000;
		
		for(int i = 0; i < timesToPlay; i++){
			
			if(playGame()){
				
				win++;
			}
		}
		System.out.print("Winrate is: " + (double)win/(double)timesToPlay * 100);
	}
	
	public static boolean playGame(){
		
		Deck deck = new Deck();
		deck.shuffle();
		int countTimes = 0;
		
		for(int i = 0; i < 52; i++){
			
			Card card = deck.takeACard();
			
			//resets the counter to 1
			if(countTimes > 2){
				
				countTimes = 0; 
			}
			if(card.getRank().ordinal() == countTimes){
				
				return false;
			}
			countTimes += 1;
		}
		return true;
	}
}
