//Thomas Lindberg
//CSE2
//hw10
//PokerOdds
//11/19/14
//Purpose: To offer practice in manipulating arrays and in writing methods that have array parameters

import java.util.Random;
import java.util.Scanner;
public class PokerOdds{
    public static void main(String [] arg){
        showHands();
        //simulateOdds();
    }
    
    //method to randomly create a hand of 5 cards
    public static void showHands (){
        int y=0;
        
        /*final int numCards = 51;
        //initialize array for deck of cards
        int [] deck = new int[numCards];
        int i = 0;
        
        //for loop to assign each card in array a value
        for(i=0;i<=numCards;i++){
            deck[i]=i;
        }*/
        
        //initialize an array to represent hand of 5 cards
        int [] hand = new int[5];
        
        //for loop to assign value to each card of hand
        for(int z=0;z<5;z++){
            hand[z]=z;
        }
        //for loop to randomly create a value for each card in hand
        for(y=0;y<hand.length;y++){
            int p = 0;
            
            //declare Random myRandom
            Random myRandom = new Random ();
            int x = myRandom.nextInt(52-p);
            
            //swap the values of each card in hand to a random value between 0 and 52 inclusive
            hand[y]=x;
        
        
            switch (hand[y]/13){
                case 0: System.out.print ("Clubs: ");
                    switch (hand[y]%13){
                        case 0: System.out.print ("A");
                        case 1: System.out.print ("K");
                        case 2: System.out.print ("Q");
                        case 3: System.out.print ("J");
                        default: System.out.print ((hand[y])%13);
                    }
                case 1: System.out.print ("Diamonds: ");
                    switch (hand[y]%13){
                        case 13: System.out.print ("A");
                        case 14: System.out.print ("K");
                        case 15: System.out.print ("Q");
                        case 16: System.out.print ("J");
                        default: System.out.print ((hand[y])%13);
                    }
                case 2: System.out.print ("Hearts: ");
                    switch (hand[y]%13){
                        case 26: System.out.print ("A");
                        case 27: System.out.print ("K");
                        case 28: System.out.print ("Q");
                        case 29: System.out.print ("J");
                        default: System.out.print ((hand[y])%13);
                    }
                case 3: System.out.print ("Spades: ");
                    switch (hand[y]%13){
                        case 39: System.out.print ("A");
                        case 40: System.out.print ("K");
                        case 41: System.out.print ("Q");
                        case 42: System.out.print ("J");
                        default: System.out.print ((hand[y])%13);
                    }
            
            
            }
        
        }
        
        
        
    }
    
}    
    

