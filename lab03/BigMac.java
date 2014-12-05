/////////////////////////////////////////////////////
//Billy DeLucia
//CSE002
//lab03
import java.util.Scanner;
//Setting program for input
public class BigMac {
    public static void main(String [ ] args) {
        Scanner myScanner;
        myScanner=new Scanner (System.in);
        System.out.println("Enter number of BigMacs (an integer > 0) : ");
        int nBigMac=myScanner.nextInt( );   // recieving user input
        System.out.println("Enter the cost per Big Mac as" +
        " a double (in the form xx.xx): " );
        double BigMac$=myScanner.nextDouble( ); //recieving price from user
        System.out.println("Enter the percent tax as a whole number (xx): ");
        double taxrate=myScanner.nextDouble( ); //recieving tax rate from user
        taxrate/=100; //user enters a percent but I want a proportion
        double cost$;
        int dollars, /*whole dollar amout of cost */ dimes, pennies; // for storing didgets
        cost$=nBigMac*BigMac$*(1+taxrate);
        dollars= (int)cost$; // dropped decimals to get whole dollars
        //
        dimes= (int)(cost$*10)%10;
        pennies= (int)(cost$*100)%10;
        System.out.println("The total cost of " +nBigMac+ " BigMacs, at $" +BigMac$+ " per BigMac, with a sales tax of " +
        (int)(taxrate*100)+ "% is $" +dollars+ "." +dimes+pennies);// prints cost of bigmacs in $0.00 format
    } //End of main method
        
} // end of class