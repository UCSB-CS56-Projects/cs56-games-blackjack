package edu.ucsb.cs56.S12.pointguard328.issue866;
/** Player class contains a Hand, a String name, and a boolean if the hand is bust.
 */

public class Player{

	private Hand playerHand;
	private String name;
	private boolean notBust = true;

	/** No-arg constructor creates new Player with a new Hand
	 */
	public Player() {
		playerHand = new Hand();
		name = new String();
	}

	/** Setter to set each person's name
	 *  @param name of Player to set name
	 */
	public void setName(String name){
		this.name = name;
	}
	
	/** Resets player hand so a new round of blackjack can begin
	 * @param d Deck to play with
	 */
	public void newHand(Deck d){
		playerHand = new Hand();
		this.drawCard(d.draw());
		this.drawCard(d.draw());
		notBust = true;
	}
	
	/** draws a Card for the player and checks if the total exceeds 21
	 * @param c Card to draw
	 */
	public void drawCard(Card c){
		playerHand.addCard(c);
		if(playerHand.getHandValue() > 21)
			notBust = false;
	}

	/** returns players Hand object
	 */
	public Hand getHand(){
		return this.playerHand;
	}

	/** Getter to get each person's name
	 */
	public String getName(){
		return this.name;
	}

	/** formats a string that displays the value(s) of the player's hand
	 */
	public String displayHandValue(){
		return name + "'s hand value: " + playerHand.displayHandValue();
	}
	
	/** returns a player's hand value with Aces as 1
	 */
	public int getHandValue(){
		return playerHand.getHandValue();
	}
	
	/** returns a a players hand value with Aces as 11 or returns -1 if doing so makes value > 21
	 */
	public int getSecondHandValue(){
		return playerHand.getSecondHandValue();
	}
	
	
	/** sets players hand to defined Hand
	 */
	public void setHand(Hand h){
		playerHand = h;
		if(h.getHandValue() > 21)
			notBust = false;
	}
	
	public String toString(){
		return "";
	}
	
	/** returns false if player went bust
	 */
	public boolean isNotBust(){
		return this.notBust;
	}


	public boolean hasBlackjack(){
		return playerHand.hasBlackjack();
	}


}
