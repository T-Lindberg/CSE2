//Thomas Lindberg
//hw02
//Arithmetic
//9/09/14
//CSE2

//define a class
class Arithmetic{
    
    //add main method
    public static void main(String [] args) {
        
        //number of paits of socks
        int nSocks=3;
        //cost per pair of socks
        //('$' is part of the variable name)
        double sockCost$=2.58;
        
        //number of drinking glasses
        int nGlasses=6;
        //Cost per glass
        double glassCost$=2.29;
        
        //number of boxes of envelopes
        int nEnvelopes=1;//cost per box of envelopes
        double envelopeCost$=3.25;
        double taxPercent=0.06;
        
        
        double totalTax, totalCostTransaction, totalCostPurchases, totalCostSocks, totalCostDG, totalCostEnvelopes, taxSocks, taxDG, taxEnvelopes;

        //Calculating cost of each item in total and tax
        totalCostSocks= nSocks*sockCost$;
        taxSocks= taxPercent*totalCostSocks;
        
        totalCostDG= nGlasses*glassCost$;
        taxDG= taxPercent*totalCostDG;
        
        
        totalCostEnvelopes= nEnvelopes*envelopeCost$;
        taxEnvelopes= totalCostEnvelopes*taxPercent;
        
        totalCostPurchases= totalCostSocks + totalCostEnvelopes + totalCostDG;
        totalTax= taxSocks+taxEnvelopes+taxDG;
        totalCostTransaction= totalCostPurchases+totalTax;
        
        //print item being bought, how many, cost per item, cost total of item, sales tax for items
        System.out.println("Socks");
        System.out.println("Number of socks: "+ nSocks);
        System.out.println("Cost per pair of socks: " + sockCost$);
        System.out.println("Cost of socks: " +totalCostSocks);
        System.out.println("Sales tax for socks: " +(int) (taxSocks*100)/100.0); //Refer to page 57 in course textbook for numeric type conversions
        System.out.println();
        
        System.out.println("Drinking Glasses");
        System.out.println("Number of drinking glasses: " +nGlasses);
        System.out.println("Cost per drinking glass: "+glassCost$);
        System.out.println("Cost of drinking glass: " +totalCostDG);
        System.out.println("Sales tax for drinking glasses: " +(int) (taxDG*100)/100.0); //Refer to page 57 in course textbook for numeric type conversions
        System.out.println();
        
        System.out.println("Envelopes");
        System.out.println("Number of envelopes: "+nEnvelopes);
        System.out.println("Cost per envelope: "+envelopeCost$);
        System.out.println("Cost of envelope: "+totalCostEnvelopes);
        System.out.println("Sales tax for envelope: "+(int) (taxEnvelopes*100)/100.0); //Refer to page 57 in course textbook for numeric type conversions
        System.out.println();
        
        //print total cost of purchases, total sales tax, total cost of transaction
        System.out.println("Total cost of the purchases: "+totalCostPurchases);
        System.out.println("Total sales tax: "+(int) (totalTax*100)/100.0);
        System.out.println();
        System.out.println("Total Cost of Transaction: "+(int) (totalCostTransaction*100)/100.0);
        
        
    
    }
}