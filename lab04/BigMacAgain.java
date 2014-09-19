////////////////////////////////////////////////////////////////////
//Billy DeLucia
//lab04
//CSE002
//
//takes input from users on purchases and gives receipt
//
import java.util.Scanner;
public class BigMacAgain {
    public static void main(String [ ] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of BigMacs: ");
        int nBigMacs=0;
        double costPerBigMac=2.22;
        double totalBigMacCost=0;
        
        if (input.hasNextInt()) {
            nBigMacs=input.nextInt();
            totalBigMacCost=nBigMacs*costPerBigMac;
            System.out.printf("You ordered %2d Big Macs for a cost of %2dx2.22 = %2.2f %n",nBigMacs,nBigMacs,totalBigMacCost);
        
            }
        //
        
        //
        else {
            System.out.println("You did not enter an int -Goodbye");
            return; //leaves the program
            //i.e. the program terminates 
            }
        
        System.out.print("Do you want an order of ries (Y/y/N/n)?");
        char yesNo=input.next( ).charAt(0);
        double friesCost;
        if (yesNo==('Y')|| yesNo==('y')){
            System.out.println("You ordered fries at a cost of $2.15");
            friesCost=2.15;
        }
        else if (yesNo==('N') || yesNo==('n')){
            friesCost=0;
        }
        
        else {
            System.out.println("You did not enter Y or y for yes or N or n for no -Goodbye");
            return; //leaves the program
            //i.e. the program terminates 
            }
        double totalCostOfMeal=totalBigMacCost+friesCost;
        System.out.printf("The total cost of the meal is %2.2f %n",totalCostOfMeal);
    }
}
