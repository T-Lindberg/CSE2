//Thomas Lindberg
//CSE2
//hw04
//CourseNumber
//9/23/14

//declare scanner
import java.util.Scanner;

//declare class
public class CourseNumber {
    //main method required for every program
    public static void main(String [] args) {
        //declare scanner
       Scanner myScanner = new Scanner (System.in);
       //prompt user for input
       System.out.println ("Enter the 6 digit course number: ");
       int number = myScanner.nextInt ();
       
       //conditions for valid input
       if ((number >=186510) && (number <=201440)) {
            int year = (int)(number/100);
            int semester = number - (year*100);
            //conditions to specify which year and semester
            if (semester == 10) {
                System.out.println ("The course was offered in the Spring of "+year);
            }
            else if (semester == 20) {
                System.out.println ("The course was offered in the Summer 1 of "+year);
            }
            else if (semester == 30) {
                System.out.println ("The course was offered in the Summer 2 of "+year);
            }
            else if (semester ==40) {
                System.out.println ("The course was offered in the Fall of "+year);
            }
            else {
                System.out.println ("This semester is invalid");
            }
       }
       else {
           System.out.println ("This number is outside the range");
       }
    }
}
       
       