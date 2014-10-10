/////////////////////////////////////////////////////////////////
//Billy DeLucia
//CSE002
//hw06
// 
// Calculating a square root

// This program estimates a square root by narrowing the window in which it can lie repeatedly
//
import java.util.Scanner;
public class Root {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number you would like to find the square root of- ");
        if (!input.hasNextDouble()){    // check if user input is a number
            System.out.println("You did not enter a number");
            return;
        }
        double number=input.nextDouble();
        if (number<0){
            System.out.println("Number is negative");
        }
        double low=0;           //will be used as the lower bound of the range
        double high=number+1;   //will be used as the upper bound of the range
        double middle=0;     //will be used to reduce the range step by step
        double tolerance=0.0000001;     // required level of accuracy
        double range=high-low;
        double middleSquared=0;
        int max=100000, count=0;
        
        while (range>tolerance){
            middle=(low+high)/2;
            middleSquared=middle*middle;
            if (middleSquared>number){
                high=middle;
            }
            if (middleSquared<number){
                low=middle;
            }
            count++;
            if (count>max){
                System.out.println("max cycles reached");
                break;
            }
            //System.out.println(middleSquared);
            range=high-low;
        }
         System.out.println("The square root of "+number+" is "+middle);
         
         /*
         System.out.println("Range width: "+range+" < Tolerance: "+tolerance);  
         System.out.println("Answer= "+middle);
         System.out.println("Check answer squared= "+middleSquared+" Error of= "+(number-middleSquared));
         System.out.println("It took "+count+" cycles to reach this answer");
         */
    }
}
