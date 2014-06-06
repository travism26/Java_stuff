import java.util.*;

public class Deck {
	ArrayList<Card> cards = new ArrayList<Card>();
	private static Deck firstInstance = null;
	
	String[] values = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	String[] suit = {"Club", "Spade", "Diamond", "Heart"};
	
	static boolean firstThread = true;
	private Deck(){
		for (int i = 0; i<suit.length; i++) {
			for(int j=0; j<values.length; j++){
				this.cards.add(new Card(suit[i],values[j]));
			}
		}
	}
	
	public static Deck getInstance(){
		if (firstInstance == null) {
			
			if (firstThread) {
				
				firstThread = false;
				Thread.currentThread();
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			firstInstance = new Deck();
			
			Collections.shuffle(firstInstance.cards);
		}
		
		return firstInstance;
	}
	
	
	
	public void printDeck(ArrayList card){
		for (int i = 0; i < card.size(); i++) {
			System.out.println(card.get(i).toString());	
		}
	}
	
	public ArrayList<Card> getDeck(){
		return firstInstance.cards;
	}
	
	public ArrayList<Card> getCards(int howManyCards){
		
		ArrayList<Card> cardsToGive = new ArrayList<Card>();
		
		for (int i = 0; i < howManyCards; i++) {
			cardsToGive.add(firstInstance.cards.remove(0));
		}
		
		return cardsToGive;
	}
	
	public static void main(String[] args){
		firstInstance.getInstance();
		firstInstance.printDeck(firstInstance.getDeck());
	}
	
	
}
