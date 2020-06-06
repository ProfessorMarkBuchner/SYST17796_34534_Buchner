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
public class CardGameICE1{

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
        int usernumber;//user input variable

        //validate number user input
        do{
            System.out.println("Please enter a card number between 1 and 13");
            usernumber = read.nextInt();
            if(usernumber < 1 || usernumber > 13){
                System.out.println("Number no valid!\t\t Try again");
            }
        }while(usernumber < 1 || usernumber > 13);
        
        //validate suit user input
        String suitUser="";//validate user input
        int x=0;
        do{
            System.out.println("Please enter you suit1  (Diamonds, Clubs, Spades or Heards)");
            suitUser = read.nextLine();
            if(suitUser.equals("diamonds")||suitUser.equals("clubs")||suitUser.equals("spades")||suitUser.equals("heards")){
                x=1;
            }else{
                System.out.println("Suit no valid! Try again");
            }
        }while(x != 1);
        
        //compare with array
        for(int i=0;i<=13;i++){
            if(usernumber==magicHand[i].getValue()&& suitUser.equals(magicHand[i].getSuits())){
                
                System.out.println("Your card is in the MagicHand!!!");
            }else{
                System.out.println("Your card is not in the MagicHand :(");
            }
        }   
    }
}
