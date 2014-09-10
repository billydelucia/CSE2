///////////////////////////////
//
import java.util.Scanner;

 public class Play {
     public static void main(String [ ] args) {
         System.out.println("This program multiplies a number by ten");
         double ten=10;
         Scanner input= new Scanner(System.in);
         System.out.println("Enter number:");
         double number= input.nextDouble( );
         
         double result=ten*number;
         System.out.println("Ten times your number is " +result+ " ");
     }
 }