//Thomas Lindberg
//lab12

public class ArrayMath{
  public static void main(String [] arg){
    double x[]={2.3, 3, 4, -2.1, 82, 23},
      y[]={2.3, 3, 4, -2.1, 82, 23},
      z[]={2.3, 13, 14},
      w[]={2.3, 13, 14, 12}, 
      v[],
      u[]={2.3, 12, 14};
    v=addArrays(x,y);
    System.out.println(display(x)+" \n  + " + display(y) + "\n   = " +display(v));
    System.out.println(display(x)+" \n  + " + display(z) + "\n   = " 
                         +display(addArrays(x,z)));
    System.out.println("It is " + equals(x,y)+" that "+display(x)+
                       " == "+display(y));
    System.out.println("It is " + equals(z,w)+" that "+display(z)+
                       " == "+display(w));
    System.out.println("It is " + equals(u,z)+" that "+display(u)+
                       " == "+display(z));

  }
  
  public static String display(double [] x){
    String out="{";
    for(int j=0;j<x.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=x[j];
    }
    return out+"}";
  }

    
    public static boolean equals(double [] alist, double [] blist){
        if(alist.length==blist.length){
            for(int i=1;i<alist.length;i++){
                if(alist[i]!=blist[i]){
                    System.out.println("false here");
                    return false;
                }
                else{
                    System.out.println("true here");
                    return true;
                }    
                
            }
        }    
        
        
    return false;   
    }
    

    public static double [] addArrays (double[] clist, double [] dlist){
        if(clist.length<dlist.length){
            
            double[] newArray = new double [dlist.length];
            int diff = dlist.length-clist.length;
            double[] elist = new double [dlist.length];
            for(int f=0;f<clist.length;f++){
                elist[f]=clist[f];
            }
            while(diff>0){
                elist[clist.length+1]=0;
                diff-=1;
            }    
            for(int i=0;i<dlist.length;i++){
                newArray[i]=elist[i]+dlist[i];        
            }
        return (newArray);            
        }
        else{
            double[] newArray = new double [clist.length];
            int diff = clist.length-dlist.length;
            double[] elist = new double [clist.length];
            for(int f=0;f<dlist.length;f++){
                elist[f]=dlist[f];
            }
            while(diff>0){
                elist[dlist.length+1]=0;
                diff-=1;
            }    
            for(int i=0;i<clist.length;i++){
                newArray[i]=clist[i]+elist[i];        
            }
        return (newArray);    
        }
        
    }
}