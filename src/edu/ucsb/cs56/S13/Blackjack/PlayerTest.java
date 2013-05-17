package edu.ucsb.cs56.S13.Blackjack;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/** test class for Player

@author Garrett Johnston
@author Brian Wan
@author Fanny Kuang
@version 2013.05.15
@see Player

*/

public class PlayerTest{

    /** Test for newly created Player object.
     * Tests no arg constructor
     * @see Player
     */
    @Test
    public void test_noArgConstructor() {
        Player p = new Player();
        assertEquals("",p.getName());
    }

	/** Test for setName and getName
		@see Player
	*/
	@Test
	public void test_SetNameGetName1() {
		Player p = new Player();
		p.setName("Earl");
		assertEquals("Earl", p.getName());
	}
		
	/** Test for setName and getName
		@see Player
	*/
	@Test
	public void test_SetNameGetName2() {
		Player p = new Player();
		p.setName("Garrett");
		assertEquals("Garrett", p.getName());
	}
	
	/** Test for displayHandValue()
		@see Player
	*/
	@Test
	public void test_DisplayHandValue1() {
		Card c1 = new Card(5, "Spades");
		Card c2 = new Card(3, "Hearts");
		Hand myHand = new Hand(c1, c2);
		Player p = new Player();
		p.setHand(myHand);
		p.setName("Player");
		assertEquals("Player's hand value: 8", p.displayHandValue());
	}
	
	/** Test for displayHandValue()
		@see Player
	*/
	@Test
	public void test_DisplayHandValue2() {
		Card c1 = new Card(5, "Spades");
		Card c2 = new Card(13, "Hearts");
		Hand myHand = new Hand(c1, c2);
		Player p = new Player();
		p.setHand(myHand);
		p.setName("Player");
		assertEquals("Player's hand value: 15", p.displayHandValue());
	}
	
	
	/** Test for getHandValue()
		@see Player
	*/
	@Test
	public void test_GetHandValue1() {
		Card c1 = new Card(5, "Spades");
		Card c2 = new Card(11, "Hearts");
		Hand myHand = new Hand(c1, c2);
		Player p = new Player();
		p.setHand(myHand);
		p.setName("Player");
		assertEquals(15, p.getHandValue());
	}
	
	/** Test for getHandValue()
		@see Player
	*/
	@Test
	public void test_GetHandValue2() {
		Card c1 = new Card(1, "Spades");
		Card c2 = new Card(11, "Hearts");
		Hand myHand = new Hand(c1, c2);
		Player p = new Player();
		p.setHand(myHand);
		p.setName("Player");
		assertEquals(11, p.getHandValue());
	}
	
	/** Test for drawCard()
		@see Player
	*/
	@Test
	public void test_DrawCard1() {
		Card c1 = new Card(5, "Spades");
		Card c2 = new Card(13, "Hearts");
		Player p = new Player();
		p.drawCard(c1);
		p.drawCard(c2);
		assertEquals(true, p.isNotBust());
	}
	
	/** Test for drawCard()
		@see Player
	*/
	@Test
	public void test_DrawCard2() {
		Card c1 = new Card(5, "Spades");
		Card c2 = new Card(13, "Hearts");
		Player p = new Player();
		p.drawCard(c1);
		p.drawCard(c2);
		p.drawCard(new Card(10,"Hearts"));
		assertEquals(false, p.isNotBust());
	}
}//end PlayerTest
