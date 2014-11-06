//Thomas Lindberg
//Practice Exam 2

//define a class
import java.util.Scanner;
public class PracticeExam2{
    //add main method
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner (System.in);
        
         
        
        /*
        int i = 10;
        while (true) {
            System.out.println ("i: " + i--);
            if (i<0){break;}
            }
            */
        
        int i = 0;
        for ( ; i<30; i+=5){
            System.out.println ("Value: " + (i%4));
        }
        
        
        
        
        
    
    
    }
}