import java.util.ArrayList;


public class gameTest {

	
	//testing singleton instance
	public static void main(String[] args){
		
		Deck newInstance = Deck.getInstance();
		
		System.out.println("Instance ID: "+ System.identityHashCode(newInstance));
		System.out.println(newInstance.getDeck());
		
		ArrayList<Card> playerOneHand = newInstance.getCards(7);
		
		System.out.println("Player 1: "+ playerOneHand);
		
		System.out.println(newInstance.getDeck());
	}
}
