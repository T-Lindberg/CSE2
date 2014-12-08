//Thomas Lindberg
//lab11


import java.util.Scanner;
public class Arrays{
    public static void main(String [] args){
        Scanner myScanner = new Scanner (System.in);
        int [] array = new int[10];
        int [] barray = new int [10];
        System.out.println ("Enter 10 ints: ");
        
        for (int i=0;i<=9;i++){
            System.out.println ("Enter int: ");
            int input = myScanner.nextInt();
            array[i]=input;
        }
        int max=0;
        
        for (int i=1; i<array.length;i++){
            if(array[i]>array[max]){
                max=i;
            }
        }    
        System.out.println();
            System.out.println("The max is: "+array[max]);
        
        int index=0;
        int min = array[0];
        for (int i=1; i<array.length;i++){
            if(array[i]<min){
                min=array[i];
                index = i;
            }
        }
            System.out.println("The min is: "+array[index]);
        
        int sum=0;
        for(int i=0;i<array.length;i++){
            
            sum+=array[i];
        }
        System.out.println("The sum is: "+sum);
        
        for(int i=0;i<=9;i++){
            int b=9;
            b-=i;
            barray[b]=array[i];
            
        }
        
        
        
        
        for (int i=0;i<=9;i++){
        System.out.println(array[i]+" "+barray[i]);
        }
    }
}