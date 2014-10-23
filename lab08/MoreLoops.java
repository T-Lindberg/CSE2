//Thomas Lindberg  
//CSE2
//Lab08
//MoreLoops
//10.17.14
//Purpose: To practice while, do while, and for loops.

import java.util.Scanner;
public class MoreLoops{
    public static void main(String[] arg){
        Scanner scan=new Scanner(System.in);
        int n=0;
      /*  
        System.out.print("Enter an int- ");
        while(!scan.hasNextInt()){
            scan.next(); //get rid of the junk entered by user
            System.out.print("You did not enter an int; try again- ");
        }
        //COMMENT OUT THE ABOVE 5 LINES AND REPLACE THE CODE WITH A
        //DO-WHILE LOOP
    */
        System.out.print("Enter an int- ");
        do{
            scan.next ();
            System.out.print("You did not enter an int; try again- ");
        }
        while(!scan.hasNextInt());
    }
}