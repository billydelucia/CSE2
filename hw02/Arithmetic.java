//////////////////////////////////////////////////////////////////
//Billy DeLucia
//Homework 02
//CSE 002
//
//
//
public class Arithmetic{
    public static void main(String[ ] args){
        //Variable Definition
            //Number of Socks
            int nSocks=3;
            // Cost per sock
            //'$' is part of variable name
            double sockCost$=2.58;
            //
            //Number of glasses
            int nGlasses=6;
            //Cost per glass
            double glassCost$=2.29;
            //
            //Number of envelope boxxes
            int nEnvelopes=1;
            //Cost per envelope
            double envelopeCost$=3.25;
            //Taxes
            double taxPercent=0.06;
        //Calculations
            //Socks total
            double tSockCost=(int)nSocks*sockCost$*100;
            double totalSockCost=tSockCost/100;      //Total cost of socks before tax
            double sSalesTax=(int)totalSockCost*taxPercent*100;
            double socksSalesTax=sSalesTax/100;  //total sales tax for socks
            double sTotalAfterTax=(int)((totalSockCost+socksSalesTax)*100);
            double socksTotalAfterTax=sTotalAfterTax/100;  //total cost of socks including tax
            double tPerSock=(int)sockCost$*taxPercent*100;
            double taxPerSock=tPerSock/100;     //the tax on each sock
            //Glasses total
            double tGlassesCost=(int)nGlasses*glassCost$*100;
            double totalGlassesCost=tGlassesCost/100;
            double gSalesTax=(int)totalGlassesCost*taxPercent*100;
            double glassesSalesTax=gSalesTax/100;
            double gTotalAfterTax=(int)((totalGlassesCost+glassesSalesTax)*100);
            double glassesTotalAfterTax=gTotalAfterTax/100;   //total cost of glasses after tax
            double tPerGlasses=(int)glassCost$*taxPercent*100;
            double taxPerGlasses=tPerGlasses/100;
            //Envelope total
            double tEnvelopeCost=(int)nEnvelopes*envelopeCost$*100;
            double totalEnvelopeCost=tEnvelopeCost/100;
            double eSalesTax=(int)totalEnvelopeCost*taxPercent*100;
            double envelopeSalesTax=eSalesTax/100;
            double eTotalAfterTax=(int)((totalEnvelopeCost+envelopeSalesTax)*100);
            double envelopeTotalAfterTax=eTotalAfterTax/100;    //total cost of envelopes after taxes
            double tPerEnvelope=(int)envelopeCost$*taxPercent*100;
            double taxPerEnvelope=tPerEnvelope/100;
            //Totals
            double tCost=(int)((totalSockCost+totalEnvelopeCost+totalGlassesCost)*100);
            double totalCost=tCost/100;
            double tTax=(int)((socksSalesTax+glassesSalesTax+envelopeSalesTax)*100);
            double totalTax=tTax/100;
            
        //output
            //Socks print
                System.out.println("Socks");
                System.out.println("Quantity           " +((nSocks))+ " ");
                System.out.println("Cost per item     $" +(sockCost$)+ " ");
                System.out.println("Tax per item      $" +(taxPerSock)+ " ");
                System.out.println("Total before tax  $" +(totalSockCost)+ " ");
                System.out.println("Sales Tax         $" +(socksSalesTax)+ " ");
                System.out.println("Total after tax   $" +(socksTotalAfterTax)+ " ");
                System.out.println(" ");
            //Glasses print
                System.out.println("Glasses");
                System.out.println("Quantity           " +(nGlasses)+ " ");
                System.out.println("Cost per item     $" +(glassCost$)+ " ");
                System.out.println("Tax per item      $" +(taxPerGlasses)+ " ");
                System.out.println("Total before tax  $" +(totalGlassesCost)+ " ");
                System.out.println("Sales Tax         $" +(glassesSalesTax)+ " ");
                System.out.println("Total after tax   $" +(glassesTotalAfterTax)+ " ");
                System.out.println(" ");
            //Envelope print
                System.out.println("Envelope");
                System.out.println("Quantity           " +(nEnvelopes)+ " ");
                System.out.println("Cost per item     $" +(envelopeCost$)+ " ");
                System.out.println("Tax per item      $" +(taxPerEnvelope)+ " ");
                System.out.println("Total before tax  $" +(totalEnvelopeCost)+ " ");
                System.out.println("Sales Tax         $" +(envelopeSalesTax)+ " ");
                System.out.println("Total after tax   $" +(envelopeTotalAfterTax)+ " ");
                System.out.println(" ");
            //Total
                System.out.println("Total before tax  $" +(totalCost)+ " ");
                System.out.println("Total Sales Tax   $" +(totalTax)+ " ");
                System.out.println("Total After Taxx  $" +(totalTax+totalCost)+ " ");
                
        
        
    }
}