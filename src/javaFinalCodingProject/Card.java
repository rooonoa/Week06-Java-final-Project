package javaFinalCodingProject;

public class Card {
	
	//our field here will have name, suit and value which are properties that make up the card
	
	String name;
	String suit;
	int value;
	
	//creating a constructor for this class
	
	Card (String name, String suit, int value){
		
		/*
		 **when we call this constructor we will like it to set the fields that are in this class
		 */
		 
		this.name = name;
		this.suit = suit;
		this.value = value;
		 
		/*
		 * or we can also set the getters and setters in java from  the source file*/
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	/*implementing a describe method that will print out the values 
	 * that are stored in the fields in this object
	 * */  
	
	public void describe() {
		System.out.println(this.name +  " of" + " " + this.suit + "---" + this.value );
		
	}
	
	
	
	
	
}
