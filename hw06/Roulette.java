//Thomas Lindberg
//CSE2
//hw06
//Roulette
//10.13.2014
//Purpose: To practice using loops

//import Random class
import java.util.Random;
 
 public class Roulette {
     
     //main method required for every java program
     public static void main(String [] args){
         
         //declare random
         Random myRandom = new Random ();
         
         //intialize variables
         int winnings = 0;
         int temp;
         int selectedNum;
         int lose = 0;
         int counter = 0;
         int spinCounter = 0;
         int profit = 0;
         int winCount = 0;
         int totWinnings = 0;
         
         //while loop to repeat the 100 spin cycle for 1000 times
         while (counter < 1001){
             
            // randomly chooses the players betting number between 1 and 38
            temp = myRandom.nextInt (38);
            temp += 1;
            
            //while loop to repeat player betting on 100 spins
             while (spinCounter < 101){
                 
                 //randomly generates the roulette wheel's outcome
                 selectedNum = myRandom.nextInt (38);
                 selectedNum += 1;
                 
                 //if statement to declare a win if chosen number matches a roulette spin number
                 if (temp == selectedNum){
                     //adds 36 to winnings for each cycle of 100 spins
                     winnings += 36;
                 }
                 
                 //if statement to add up every complete loss
                 if (winnings==0){
                 ++lose;
                 }
                 
                 //else if to declare each time there is a profit
                 else if (winnings > 100){
                 ++profit;
                 }
                 
                 //to continue the loop until 100 spins
                 spinCounter++;
             } 
         
         //adds up total winnings per 100 spins, 1000 times
         totWinnings += winnings;
         
         //continues loop until 1000 repetitions
         counter++;
         }
    
     //prints out total amount of loses, profits, and combined winnings
     System.out.println ("You lost everything: "+lose+" times");
     System.out.println ("Number of times you profited: "+profit);
     System.out.println ("Winnings: " +totWinnings);
    
    
        
    }
     
     
 }