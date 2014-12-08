/* The user is supposed to enter a number between 0 and 99.
 * The program interprets that as a percentage, converts it to
 * a proportion and then displays the proportion (out of 1) 
 * remaining. It does not always work. Find out when it doesn't
 */

import java.util.Scanner;
public class Enigma1{
  public static void main(String []arg){
    double percent;
    Scanner myScanner = new Scanner (System.in);
    System.out.print("Enter a value for the percent (0, 1,...99)- ");
    if (myScanner.hasNextDouble()==true){
        
        double x = myScanner.nextDouble();
        
        if(x>100 || x<0){
            System.out.println ("Must be a number between 0 and 99");
            return;
        }
        else{
           System.out.println("You entered "+x+"%");
           //print out the proportion remaining for select percentages
          
            System.out.println ("The proportion remaining is " +(100-x));
        }
    }
    else{
        System.out.println ("You did not enter a number");
        return;
    }
    
  }
}

/* if(100-x/100==0.93)  //when the user enters 7
      System.out.println("The proportion remaining is "+0.93);
    else if(100-x/100==0.59)//when the user enters 41
      System.out.println("The proportion remaining is "+0.59);
    else if(100-x/100==0.86)//when the user enters 14
      System.out.println("The proportion remaining is "+0.86);
    else if(100-x/100==0.67)//when the user enters 33
      System.out.println("The proportion remaining is "+0.67);
    else if(100-x/100==0.4)//when the user enters 60
      System.out.println("The proportion remaining is "+0.40);
   }
}
*/

/* Error report: 
 *    (Exlain the error(s) that occur here, in this comment,
 *    and fix the errors)
 *    Hint: What kinds of input are unacceptable? What kinds of
 *        acceptable input don't produce the correct answer?
 * RE error: (1-x/100) does not equal a positive decimal
    RE error: program does not account for all proportions remaining out of 1
    - fixed both by making simple system.out.println statement that will account for all numbers between 0 and 99
 * - added if statements to check if input is a double and that it is between 0 and 99 inclusive
 * 
 * 
 */
