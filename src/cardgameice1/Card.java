/*Name: Mauricio Morales
 * SN: 991584677
 *
 */
package cardgameice1;

public class Card {
    private String suits;//diamonds,clubs,spades, hearts
    private int value; // 1 to 13
    public static final String[] SUITS={"Diamonds","Clubs","Spades","Hearts"};
    
    public String getSuits() {
        return suits;
    }

    public void setSuits(String suits) {
        this.suits = suits;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    
    //random values between 1 and 13 
    public int randomValue(){
         value = (int)(Math.random()*13+1);
        return value;
    }
    //random suit between Diamonds, Clubs, Spades, and  Heards
    public  String randomSuit() {
        suits = (Card.SUITS[(int)(Math.random()*3)]);
       return suits;
    }
}
