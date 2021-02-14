/*
Paul Zomparelli
991321510
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int) (Math.random() * (13) + 1));
            c.setSuit(Card.SUITS[(int) (Math.random() * (4))]);
            magicHand[i] = c;
        }
        Scanner sc = new Scanner(System.in);
        Card userCard = new Card();
        System.out.println("please pick a card value then hit enter");
        userCard.setValue(sc.nextInt());
        sc.nextLine();
        System.out.println("please pick a card suit then hit enter");
        userCard.setSuit(sc.nextLine());

        for(int i = 0; i < magicHand.length; i++){

            if (magicHand[i].getValue() == userCard.getValue()){
                if (magicHand[i].getSuit().equals(userCard.getSuit())) {
                    
                    System.out.println("the card you selected was number "+ i + 1 +" in the hand");
                    break;
                }
            }
            if(i + 1 == magicHand.length){
                System.out.println("the card was not in the hand");
            }
        }
        
//insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    
}
