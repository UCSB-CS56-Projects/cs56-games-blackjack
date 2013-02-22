package edu.ucsb.cs56.S12.pointguard328.issue866;
/** class Card has a suit, value, name, and 
 *  keeps track of if it is an ace or face card
 */
public class Card{
	private String suit;
	private int value;
	private String name;
	private boolean isAce;
	private int cardNumber;
	/** 
	@param value value of card, between 1 and 13, if greater than 10 it is set to 10
	@param suit suit of card, either Hearts, Clubs, Spades, or Diamonds
	 */
	public Card(int value,String suit){
		this.suit=suit;
		this.value=value;
		cardNumber = value;
		if(suit.equals("Diamonds"))
			cardNumber += 13;
		else if(suit.equals("Hearts"))
			cardNumber += 26;
		else if(suit.equals("Spades"))
			cardNumber += 39;
		isAce=false;
		if(value == 1){
			name="Ace";
			isAce = true;
		}
		else if(value >=2 && value <=10){
			name=Integer.toString(value);
		}
		else if(value == 11){
			name="Jack";
			this.value=10;
		}
		else if(value == 12){
			name="Queen";
			this.value=10;
		}
		else if(value == 13){
			name="King";
			this.value=10;
		}
	}
	/** gets the value of the card 
	 */
	public int getValue(){
		return value;
	}
	public String toString(){
		return name + " of " + suit;
	}
	/** returns whether or not the card is an ace
	 */
	public boolean isAnAce(){
		return isAce;
	}
	/** returns the true Card Number (e.g. King = 13, Ace = 1, 4 = 4)
	 */
	public int getCardNumber(){
		return cardNumber;
	}
}
