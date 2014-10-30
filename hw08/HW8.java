//Thomas Lindberg
//CSE2
//hw08
//HW8
//10.29.14
//Purpose: To practice writing methods, overloading methods, and in forcing the user to enter good input

//import scanner class
import java.util.Scanner;


public class HW8 {
    
    //main method required for every java program
    public static void main(String []arg){ 
        
        //initializing variable
        char input; 
        
        //declaring scanner
        Scanner scan = new Scanner(System.in); 
        
        //prompt user for input
        System.out.print("Enter 'C' or 'c' to continue, anything else to quit- "); 
        
        //call getInput method given parameters scan and Cc
        input = getInput(scan,"Cc"); 
        
        //prints output
        System.out.println("You entered '"+input+"'"); 
        
        //prompts user for input
        System.out.print("Enter 'y', 'Y', 'n', or 'N'- "); 
        
        //call method getInput given parameters scan string yYnN and give up after 5 attempts
        input = getInput(scan,"yYnN",5); 
        
        //if statement that executes if max number of tries has not been reached
        if(input!= 'f') { 
          System.out.println("You entered '"+input+"'"); 
        } 
        //call method getInput given parameters scan, instructions and string 0123456789
        input = getInput(scan,"Choose a digit.","0123456789"); 
        System.out.println("You entered '"+input+"'"); 
    }  
    
    //declare getInput method given parameters scanner and string
    public static char getInput(Scanner scan, String letters) {
        
        //initializing variables
        char input;
        String userIn;
        
        //do while loop that executes while user input is not acceptable
        do {
        
            userIn = scan.next();
            input = userIn.charAt(0);
          
            //if statement that checks user input to one character and char C or c 
            if (userIn.length() > 1) {
                System.out.println("You should enter exactly one character");
            }
            else if ((input == 'C') || (input == 'c')) {
                return input;
            }     
            else {
                System.out.println("You did not enter a character from the list '" +
                               letters + "'; try again -");
            }
            
        } while ((input != 'C') || (input != 'c') || (userIn.length() != 1));
        
        return input;
    }
    
    //declares getInput method given parameters scanner, string, and int
    public static char getInput(Scanner scan, String letters, int tries) {
        
        //initialize variables
        char input;
        int i = 0;
        String userIn;
        char letter;
        
        //do while loop that executes while user input is not acceptable and max number of trials has not been reached
        do {
            //incrementing tries number
            i ++;
            //set user input
            userIn = scan.next();
            input = userIn.charAt(0);
            
            //if statement that checks user input to one character and char Y,y,N, or n
            if (userIn.length() > 1) {
                System.out.println("You should enter exactly one character");
            }
            
            else if ((input == 'y') || (input == 'Y') || (input == 'n') || (input == 'N')) {
                return input;
            }
            
            else {
                System.out.println("You did not enter a character from the list '" +
                                   letters + "'; try again -");        
            } 
            
        } while (((input != 'y') || (input != 'Y') || (input != 'n') || (input != 'N')) && (i < tries));
        
        //sets input equal to f if maximum number of trials have been reached and prints out statement            
        if (i == tries) {
            System.out.println("You failed after " + tries + " tries");
            
            input = 'f';
        }
        
        return input;
    }
    
    //declare method getInput given parameters scanner,string,string
    
    public static char getInput(Scanner scan, String instructions, String digits) {
        
        //initialize variables
        char input;
        String userIn;
        
        //do while loop that executes while user input is not acceptable
        do {
            //prompts user for input
            System.out.println("Choose a digit.");
            userIn = scan.next();
            input = userIn.charAt(0);
            
            //if statement that checks user input to one character and from string 0123456789 
            if (userIn.length() > 1) {
                System.out.println("You should enter exactly one character");
            }
            else if ((input == '0') || (input == '1') || (input == '2') || (input == '3') || 
                   (input == '4') || (input == '5') || (input == '6') || (input == '7') || 
                   (input == '8') || (input == '9')) {
                return input;
            }
            else {
                System.out.println("You did not enter an acceptable character");        
            } 
            
        } while ((input != '0') || (input != '1') || (input != '2') || (input != '3') || 
                   (input != '4') || (input != '5') || (input != '6') || (input != '7') || 
                   (input != '8') || (input != '9') || (userIn.length() != 1));
        return input;
    }
}