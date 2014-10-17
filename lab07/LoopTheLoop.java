////////////////////////////////////////////////////////////////////////
//Billy DeLucia
//CSE002
//
//This program is supposed to print the number of '*' the user inputs in a certain pattern
//first it should prin the number of stars desired. Then the program will print one star, then two, then three...
// continueing to count up until it reaches the desired number again.
import java.util.Scanner;
public class LoopTheLoop {
    public static void main(String[] args){
        boolean infinite= true;
        while (infinite){
            Scanner input=new Scanner(System.in);
            System.out.print("Enter an int between 1 and 15 - ");
            if (!input.hasNextInt()){   //checking if user input an integer
                System.out.println("You did not enter an int"); //error message
                return; //terminates prgram
            }
            int nStars=input.nextInt();     // storing user input
            if (nStars<1 || nStars>15){     //checking if input is within desired range
                System.out.println("Your int was not within the range [1,15]");
                return;     // terminates program
            }
            
            
            int x=0;
            while (x<nStars){       // will run loop the number that the user input
                System.out.print("*");  // prints a singe '*' for every run through
                x++;
            }
            System.out.println("");     // enters a new line
            
            
            x=1;
            int y=0;
            while (x<=nStars){
                while (y<=0){
                    System.out.print("*");
                    y++;
                }
                x++;
                y-=x;
                System.out.println("");
            }
            System.out.print("Enter y or Y to go again- ");
            char exit=input.next().charAt(0);
            infinite= exit=='y' || exit== 'Y';
        }
    }
}