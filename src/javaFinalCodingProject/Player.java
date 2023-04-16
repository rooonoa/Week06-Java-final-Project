package javaFinalCodingProject;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	//creating our field 
	String name;
	int score;
	private List<Card> hand = new ArrayList<Card>(); //cards on a player hand
	
	//Creating our constructor 
	
	Player (String name){
		this.score = 0;
		this.name = name;
		
	}
	//giving card to a player
	public void addCardToHand (Card card) {
		hand.add(card);
	}

	//Playing the top card on hand and removing it from the deck
	
	public Card playCardOntop() {
		Card card = hand.get(0);
		hand.remove(0);
		return card;
		
	}
	
	public String getName() {
		return name;
	}
	public int getScore() {
		return score++;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public List<Card> getHand() {
		return hand;
	}
	public void setHand(List<Card> hand) {
		this.hand = hand;
	}
	
	public int incrementScore () {
		return score++;
	}
	
	
	
	
}
