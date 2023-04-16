package javaFinalCodingProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	//Our field here will be the list of cards 
	
	List <Card> cards = new ArrayList <Card>(); //creating our cards field 
	
	String suits [] = {"Clubs", "Diamonds", "Heats", "Spades"};
	String numbers []= {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
			            "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
	{
	
	for (String suit:suits)   {      //using a for loop  because our field is a list 
		int count = 2;
	for (String number:numbers){
		
		
		Card card = new Card(number, suit, count); //instantiating  Card object into our new card variable 
		this.cards.add(card); //putting our newly constructed card into the cards fields
		count++;}}
			
	}
	//creating getters and setter for the for our field

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
	public void describe () {            
		for (Card card:this.cards) {   //using a for loop because our field is a list
			card.describe();            //calling our describe method that was created in the card class
		}
	
			}
	public void shuffle() {
		Collections.shuffle(this.cards);
	}
	
	public Card drawCard () {
		Card card  = cards.get(0);
		cards.remove(0);
		return card;
			
		
		
	}
	
	
	
	}
	

