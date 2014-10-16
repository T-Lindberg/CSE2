//Thomas Lindberg
//CSE2
//hw06
//Root.java
//10.13.14
//Purpose: To practice loops

//import scanner class
import java.util.Scanner;

public class Root {
    
    //main method required for every java program
    public static void main (String [] args){
        
        //declare scanner
        Scanner myScanner = new Scanner (System.in);
        
        //prompt user for input
        System.out.println ("Enter a double that is greater than 0: ");
        
        //initializing variable
        double number = myScanner.nextDouble();
        
        //if statement stating
        if (number > 0){
            
        //initialize variables
        double low = 0;
        double high = 1+number;
        double tolerance = .0000001*high;
        double middle;
        double interval = high-low;
        
        //while loop containing algorithm to compute square root of input
        while (interval >= tolerance) {
            middle = (high + low)/2;        
            if (middle*middle > number){
                high = middle;
            } 
            else{
                low = middle;
            }
                interval = high - low;
        }        
        
        //prints output
        System.out.println ("The square root is: " + ((high+low)/2)); 
        }
        else{
            System.out.println ("Invalid input, enter a number greater than 0.");
        }
    }
}

