//Thomas Lindberg
//CSE2
//hw10
//FindDuplicates
//11/18/14
//Purpose: To offer practice in manipulating arrays and in writing methods that have array parameters


//import scanner 
import java.util.Scanner;


public class FindDuplicates{
    
    //declare main method required for every java program
    public static void main(String [] arg){
        
        //declare scanner
        Scanner scan=new Scanner(System.in);
        
        //declare num array
        int num[]=new int[10];
        
        String answer="";
        
        //do while loop to 
        do{
        
            System.out.print("Enter 10 ints- ");
            for(int j=0;j<10;j++){
                num[j]=scan.nextInt();
            }
            String out="The array ";
            
            //call listArray method
            out+=listArray(num); //return a string of the form "{2, 3, -9}"   
              
            if(hasDups(num)){
                out+="has ";
            }
            else{
                out+="does not have ";
            }
              
            out+="duplicates.";
            System.out.println(out);
            out="The array ";
            
            //call listArray method
            out+=listArray(num);    
            if(exactlyOneDup(num)){
                out+="has ";
            }
            else{
                out+="does not have ";
            }
            
            out+="exactly one duplicate.";
            System.out.println(out);
            System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
            answer=scan.next();
            
        }while(answer.equals("Y") || answer.equals("y"));
        
      }
    
    public static String listArray(int num[]){
        String out="{";
        
        for(int j=0;j<num.length;j++){
            
            if(j>0){
                
                out+=", ";
            }
            
            out+=num[j];
          
        }
        
        out+="} ";
        return out;
    }
    
    public static boolean hasDups(int [] num){
        int i=0;
        int dupCounter=0;
        int k=0;
        for (i=0; i<num.length; i++){
            for (k= i+1; k<num.length; k++){
                if(num[i]== num[k]){
                    
                    dupCounter += 1;
                    
                     
                }
            }
        }
        if(dupCounter>=1){
            return true;
        } 
        else{
            return false;
        }
    }
    
    public static boolean exactlyOneDup(int [] num){
        int i=0;
        int exacDupCounter=0;
        int k=0;
        for (i=0; i<num.length; i++){
            for (k= i+1; k<num.length; k++){
                if(num[i]== num[k]){
                    
                    exacDupCounter += 1;
                     
                }
                
            
            }
        }
        if(exacDupCounter==1){
            return true;
        }
        else{
            return false;
        }
    }
}
