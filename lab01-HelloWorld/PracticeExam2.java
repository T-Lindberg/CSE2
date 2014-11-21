//Thomas Lindberg
//Practice Exam 2

//define a class
import java.util.Scanner;
public class PracticeExam2{
    //add main method
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner (System.in);
        
         
        
       /* 
        int i = 1;
        while (i<9) {
            System.out.println ("i: " + i);
            System.out.println ("looping");
            i++;
            i++;
            }
           */
        
        
        /*
        int i = 6;
        int j = 1;
        for (i=6; i>=0; --i){
            for ( j= 1; j<=i; j++){
            System.out.print (j);
            if (j>=i){
                System.out.println();
            }
            }
            
            
        }
        */
        
        int input = 1;
        int i;
        for (i = 0; i<3;i++){
            X(input);
            Y(input);
            System.out.println ("input " +input);
        }
    }
        
    public static void X(int i){
        
        i=i-2;
        System.out.println(i);
        
    }
    public static void Y(int z){
        z=z/2;
        System.out.println(z);
    }   
        
        
        
        
        
        
    
    
    
}