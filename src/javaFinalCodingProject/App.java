package javaFinalCodingProject;

public class App {

	public static void main(String[] args) {
		
		
		//instantiating a Deck of cards and shuffling 
		
		Deck deck = new Deck();
		deck.shuffle();
		
		// instantiating the two players for the game 
		
		Player player1 = new Player("Player 1");
		Player player2 = new Player ("Player 2");
		
	
	
	//Dealing the cards to the players 
	
	for (int i = 0; i < 52; i++) {
		if (i % 2 == 0) {
			player1.addCardToHand (deck.drawCard());
		}
		else {
			player2.addCardToHand(deck.drawCard());
		}
	}
	//Playing the WAR GAME
	for (int round = 1; round <= 26; round++) {
		
		Card player1Card = player1.playCardOntop();
		Card player2Card = player2.playCardOntop();
		
	 System.out.println("Round " + round + ": " + player1.getName() + " plays " 
	 + player1Card.getValue() + " of " + player1Card.getSuit() + ", " + player2.getName() 
	 + " plays " + player2Card.getValue() + " of " + player2Card.getSuit());

		
		if (player1Card.getValue() > player2Card.getValue()) {
			System.out.println(player1.getName() + " "+ "Wins this round");
			player1.addCardToHand(player1Card);
			player1.addCardToHand(player2Card);
			player1.incrementScore();
		}
		else if (player1Card.getValue()< player2Card.getValue()) {
			System.out.println(player2.getName() + " " +"Wins this round");
			player2.addCardToHand(player2Card);
			player2.addCardToHand(player1Card);
			player2.incrementScore();
			
		}
		else System.out.println("This round is a draw");
	}
	
	
	
	//Final Score
	System.out.println("Final Score:");
	System.out.println(player1.getName() + ": final score is "  + player1.getScore());
	System.out.println(player2.getName() + ": final score is "+ player2.getScore());
	
	if (player1.getScore() > player2.getScore()) {
	
		System.out.println("Player 1 is the game winner");
	}
	
	else if (player1.getScore() < player2.getScore()){
		System.out.println("Player 2 is the game winner");
	}
	else {
		System.out.println("it is a Tie");
	}
	
	
	
	}
	
}
