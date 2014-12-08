//Thomas Lindberg
//Lab 10

public class MethodCalls{
    public static void main(String []  arg){
        int a=784,b=22,c;
        c=addDigit(a,3);
        System.out.println("Add 3 to "+a+" to get "+c);
        c=addDigit(addDigit(c,4),5);
        System.out.println("Add 3, 4, and 5 to "+a+" to get "+c);
        System.out.println("Add 3 to -98 to get: "+addDigit(-98,3));
        c=join(a,b);
        System.out.println("Join "+a+" to "+b+" to get "+c);
        System.out.println("Join 87, 42, and 83 to get "+join(87, join(42,83)));
        System.out.println("Join -9 and -90 to get "+join(-9,-90));
    }
    
    public static int addDigit(int number,int digit){
        int c=0;
        String b;
        String d;
        String f;
        if (digit>9 || digit<0){
            return number;
        }
        else{
            if(number>0 || digit>0){
            b=String.valueOf(digit);
            d=String.valueOf(number);
            f = b+d;
            
            c=Integer.parseInt(f);
            }
            else if(number<0){
                number*=-1;
                b=String.valueOf(digit);
                d=String.valueOf(number);
                f = b+d;
            
                c=Integer.parseInt(f);
                
            }
            else if(digit<0){
                digit*=-1;
                b=String.valueOf(digit);
                d=String.valueOf(number);
                f = b+d;
            
                c=Integer.parseInt(f);
            }
            else if(number<0 && digit<0){
                b=String.valueOf(digit);
                d=String.valueOf(number);
                f = b+d;
            
                c=Integer.parseInt(f);
            }
            
        }
            return c;
        }
    
    
    public static int join(int a1, int b1){
        int c;
        c=addDigit(a1,b1);
        return c;
    }
}  



/*
Add 3 to 784 to get 3784
Add 3, 4, and 5 to 784 to get 543784
Add 3 to -98 to get: -398
Join 784 to 22 to get 78422
Join 87, 42, and 83 to get 874283
Join -9 and -90 to get 990
*/
