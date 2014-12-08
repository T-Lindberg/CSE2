//Thomas Lindberg
//CSE2
//Lab04
//BigMacAgain
//9/19/14
//how you can use selection statements to run code only under specific conditions

import java.util.Scanner;

public class BigMacAgain{
    //main method required for every Java program
    public static void main(String [] args) {
        
       Scanner myScanner = new Scanner (System.in);
        
        
        System.out.println ("Enter the number of Big Macs: ");
        int nBigMacs = 0;
        
        final double price = 2.22;
        final double costOfFries = 2.15;
        
        
        
        //if statement checks whether input is int
        if (myScanner.hasNextInt()==true) {
        
        nBigMacs = myScanner.nextInt();
        
        double cost = nBigMacs * price;
        
            //checks if input is greater than 0
            if (nBigMacs > 0) {
                
                
                System.out.println ("You ordered " +nBigMacs+ " for a cost of: "+cost);
            }
            else {
                System.out.println ("Number of Big Macs not greater than 0");
                
                //leaves program
                return;
            }
            
            System.out.println ("Do you want an order of fries (Y/y/N/n)?");
            String answer=myScanner.next();
            
            if (answer.equals("Y")){
                System.out.println ("You ordered french fries at a cost of 2.15");
            }
            else if(answer.equals("y")){
                System.out.println ("You ordered french fries at a cost of 2.15");
            }
            else if(answer.equals("N")){
                System.out.println ("You ordered french fries at a cost of 2.15");
            }
            else if(answer.equals("n")){
                System.out.println ("You ordered french fries at a cost of 2.15");
            }
            else{
                System.out.println ("You did not enter Y/y/N/n");
                //leaves program
                return;
            }
            
            double totalCost = cost + costOfFries;
            System.out.println ("The total cost of the meal is " +totalCost);
            
            
        }
        else{
            System.out.println ("You did not enter an int");
            
            //leaves program
            return;
        }
    }
}