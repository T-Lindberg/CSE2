//Thomas Lindberg
//CSE2
//hw11
//PokerHands
//12/04/14
//Purpose:To practice manipulating arrays and multidimensional arrays, writing methods that have array parameters, and in searching and sorting arrays


//import classes
import java.util.Scanner;
import java.util.Arrays;


public class PokerHands{
    
    //main method required for every java program
    public static void main(String [] arg){
        
        //declare scanner
        Scanner myScanner = new Scanner (System.in);
        
        //initiliaze and allocate space for arrays deck and hand
        int [] deck = new int [52];
        int [] hand = new int [5];
        for (int i=0;i<deck.length;i++){
            deck[i]=i;
        }
        int count = 0;
        
        //do while loop to repeat a new hand until 'y' or 'Y' is not selected
        do{
            
            //prompt user for new hand
            System.out.println ("Enter 'y' or 'Y' to enter a(nother) hand: ");
            char inputForNewHand = myScanner.next().charAt(0);
        
            //if statement to determine whether user wants to continue with new hand
            if (inputForNewHand == 'y' || inputForNewHand=='Y'){
                
                int j=0;
                
                //for loop to repeat until 5 cards are successfully entered
                do{
                    
                    //prompt user for suit of next card
                    System.out.println ("Enter the suit 'c','d','h', or 's': ");
                    char inputForSuit = myScanner.next().charAt(0);
                    
                    //if statement to check validity of user input for suit
                    if(inputForSuit=='c'||inputForSuit=='d'||inputForSuit=='h'||inputForSuit=='s'){
                        int realCardValue=0;
                        
                        //if statement to add value to card value to match with array indices
                        if (inputForSuit=='d'){
                            realCardValue+=13;
                        }
                        else if (inputForSuit=='h'){
                            realCardValue+=26;
                        }
                        else if (inputForSuit=='s'){
                            realCardValue+=39;
                        }
                        
                        //prompts user to enter card rank
                        System.out.println("Enter one of 'a','k','q','j','10',...'2': ");
                        
                        //assign inputted value as string
                        String input = myScanner.next();
                        
                        
                        char inputForCardValue;
                        
                        //if statement to fix input value of 10 due to string variable constraints
                        if(input.charAt(0)==1 && input.charAt(1)==0){
                            input = "1";
                        }
                        
                        //assign card value from user input of card rank
                        inputForCardValue = input.charAt(0);
                        
                        //if statement to limit user input to correct card values
                        if (inputForCardValue=='a' || inputForCardValue=='k' || inputForCardValue=='q' || inputForCardValue=='j'
                        || inputForCardValue=='1' || inputForCardValue=='9' || inputForCardValue=='8' || inputForCardValue=='7'
                        || inputForCardValue=='6' || inputForCardValue=='5' || inputForCardValue=='4' || inputForCardValue=='3' || inputForCardValue=='2'){
                        
                            switch (inputForCardValue){
                                case 'a': realCardValue+=0; 
                                            break;
                                case 'k': realCardValue+=1; 
                                            break;
                                case 'q': realCardValue+=2; 
                                            break;
                                case 'j': realCardValue+=3;
                                            break;
                                case '1': realCardValue+=4;
                                            break;
                                case '9': realCardValue+=5;
                                            break;
                                case '8': realCardValue+=6;
                                            break;
                                case '7': realCardValue+=7;
                                            break;
                                case '6': realCardValue+=8;
                                            break;
                                case '5': realCardValue+=9;
                                            break;
                                case '4': realCardValue+=10;
                                            break;
                                case '3': realCardValue+=11;
                                            break;
                                case '2': realCardValue+=12;
                                            break;
                            }
                            
                            int invalid = 0;
                            
                            //for loop to check whether card has been entered previously
                            for(int i=j-1;i>=0;i--){
                                if(realCardValue==hand[i]){
                                    System.out.println("This is card is already being used, try again");
                                    invalid = 1;
                                }
                            }
                            //additional if statements to check if card had been entered previously    
                            if (invalid == 0) {
                            hand[j]=realCardValue;
                            j++;
                            realCardValue=0;
                            }
                                
                                
                                
                              
                            
                        
                               
                                
                            
                            
                        }
                        
                        else{
                            System.out.println("That is not a valid card value");
                        }
                        
                    }
                    else{
                        System.out.println("You did not enter a valid response");
                    }
                
                }while(j<hand.length);
                
                
                //calls method to print out hand with rank and suit 
                showOneHand(hand);
                
                //calls method and prints out what rank the hand is
                System.out.println("This is a "+rank(hand));
                
            }
            
            else{
                System.out.println("-----------------");
                count=1;
                myScanner.close();
            }
            
            
        }while(count==0);
        
        
        
    }  
    
    //initialize method to find rank of hand
    public static String rank (int hand []){
        
        //initiliaze and allocate space for array
        int [] frequencyRank = new int [13];
        
        //for loop to determine frequency of rank of card
        for (int i=0; i<hand.length;i++){
            int card = hand[i];
            card = card%13;
            frequencyRank[card]+=1;
            
        }
        int two = 0;
        int three = 0; 
        int four = 0;
        int straight = 1;
        int flush = 0;
        
        //for loop to determine how many of the same card is found
        for (int i = 0; i < frequencyRank.length; i++) {
           if (frequencyRank[i] == 2) {
               two += 1;
           }
           if (frequencyRank[i] == 3) {
               three = 1;
           }
           if (frequencyRank[i] == 4) {
               four = 1;
           }
        }
        //for loop to determine if cards are consecutive ranks, meaning if it is a straight
        for (int i = 1; i < frequencyRank.length; i ++) {
            if (frequencyRank[i-1] == 1 && frequencyRank[i] == 1) {
               straight+=1;
           }
        }
        
        int suitC = 0;
        int suitD = 0;
        int suitH = 0;
        int suitS = 0;
        
        //determines frequency of suit of card in hand
        for (int i = 0; i < hand.length; i++) {
            if(hand[i]/13==0){
                suitC+=1;
            }
            else if(hand[i]/13==1){
                suitD+=1;
            }
            else if(hand[i]/13==2){
                suitH+=1;
            }
            else if(hand[i]/13==3){
                suitS+=1;
            }
        }
        //depending on frequency of suit of card, determines rank of card
        if (straight == 5) {
            if (suitC ==5 || suitS == 5|| suitD==5 || suitH ==5){
                //if statement to determine if royal flush or straight flush
                if(frequencyRank[0]==1&&frequencyRank[4]==1){
                    return "Royal Flush";
                }
                else{
                    
                return "Straight Flush";
                
                }
            }
            
            else{
                return "Straight";
            }
        //    
        }
        else if (suitC ==5 || suitS == 5|| suitD==5 || suitH ==5){
                return "Flush";
        }
        else if (two == 1 && three == 1) {
            return "Full House";
        }
        else if (four == 1) {
            return "Four of a Kind";
        }
        else if (three == 1) {
            return "Three of a Kind";
        }
        else if (two == 2) {
            return "Two Pair";
        }
        else if (two == 1) {
            return "One Pair";
        }
        else {
            return "High Card";
        }
       
    }    




    
    
    
 //method given by professor chen, prints hand
 public static void showOneHand(int hand[]){
	String suit[]={"Clubs:	", "Diamonds: ", "Hearts:   ", "Spades:   "};
	String face[]={
       "A ","K ","Q ","J ","10 ","9 ","8 ","7 ","6 ","5 ",
  	"4 ","3 ","2 "};
	String out="";
	for(int s=0;s<4;s++){
  	out+=suit[s];
  	for(int rank=0;rank<13;rank++)
    	for(int card=0;card<5;card++)
     	if(hand[card]/13==s && hand[card]%13==rank)
      	out+=face[rank];
  	out+='\n';
	}
	System.out.println(out);
  }

}