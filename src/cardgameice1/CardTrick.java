/*Name: Mauricio Morales
 * SN: 991584677
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgameice1;

import java.util.Scanner;

/**
 *
 * @author srinivsi
 print 7 cards (values,suits) and takes input 
 then prints if matching card is found in an array
 */
public class CardTrick{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // code to generate 7 random cards and store in array
        Scanner read = new Scanner(System.in);//Create  a Scanner objet
        Card[] magicHand = new Card[7];//array of object
        for (int i=0;i<magicHand.length;i++)
        {
           Card c= new Card();//object
           c.setValue(c.randomValue());
           c.setSuits(c.randomSuit());
           magicHand[i]=c;//saving object in array
           System.out.println(magicHand[i].getValue()+" "+magicHand[i].getSuits());
        }
        
        //take input from user and compare with array\
        Card lockycard= new Card();

        //validate number user input
        do{
            System.out.println("Please enter a card number between 1 and 13");
            lockycard.setValue(read.nextInt());
            
            //usernumber = read.nextInt();
            if(lockycard.getValue() < 1 || lockycard.getValue() > 13){
                System.out.println("Number no valid!\t\t Try again");
            }
        }while(lockycard.getValue() < 1 || lockycard.getValue() > 13);
        read.nextLine();//clean buffer
        
        //validate suit user input
        boolean x=false;
        do{
            System.out.println("Please enter you suit1  (Diamonds, Clubs, Spades or Heards)");
            lockycard.setSuits(read.nextLine());
            if(lockycard.getSuits().equals("Diamonds")||lockycard.getSuits().equals("Clubs")||lockycard.getSuits().equals("Spades")||lockycard.getSuits().equals("Heards")){
                x=true;
            }else{
                System.out.println("Suit no valid! Try again");
            }
        }while(!x);
        
        //compare with array
        for(int i=0;i<7;i++){
            if(lockycard.getValue()==magicHand[i].getValue()&& lockycard.getSuits().equals(magicHand[i].getSuits())){
                System.out.println("YEA!!! Your card is in the MagicHand!!!");
                break;
            }else{
                if(i==6){
                    System.out.println("UPS!! Your card is not in the MagicHand :(");
                }
            }
        }   
    }
}
