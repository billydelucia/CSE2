//////////////////////////////////////////////////////////////
//Billy DeLucia
//CSE002
//Homework 08
//
//This program takes user input and checks to see if it matched a list of required inputs.
//It does this by deligating input checks and certain technicalities to differing methods.
//
import java.util.Scanner;
public class HW8{
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter 'C' or 'c' to continue, anything else to quit- "); 
    	char input=getInput(scan,"Cc");         // this doesn't actually quit the program as the last line would suggest
    	// this is becasue I based my program off the sample outputs in the lab that suggested otherwise.
    	System.out.println("You entered '"+input+"'");
    	System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
    	input=getInput(scan,"yYnN",5); //give up after 5 attempts
    	if(input!=' '){
       	System.out.println("You entered '"+input+"'");
    	}
    	input=getInput(scan,"Choose a digit.","0123456789");
	    System.out.println("You entered '"+input+"'");
    }
    //
    //This mathod checks user input for a single character, and matches it so a string of possible character inputs.
    //If either of these conditions isn't met it will reprompt the user for another input.
    //
    public static char getInput(Scanner userInput, String required){
        int requiredLength=required.length();
        while(true){
            String input=userInput.next();              //accepts user input
            //System.out.println(input.length());
            while(input.length()>1){                    //checks lenth of input
                System.out.print("You must enter exactly one character. Try again - ");
                input=userInput.next();
            }
            char output=input.charAt(0);
            int i;
            for(i=0; i<requiredLength; i++){
                //System.out.println("i= "+i+" "+required.charAt(i));
                if(output==required.charAt(i)){
                    return output;
                }
            }
            System.out.print("You did not enter a character from the list \""+required+"\". Try again - ");
        }
    }
    //
    //This method recieves user input checks that the input is a single character
    //and checks to see to see if it matched a string of required characters. 
    //This method also has a mac number of reattempts to enter valid inputs
    //
    public static char getInput(Scanner userInput, String required, int max){
        int requiredLength=required.length();
        int j=0;
        while(true){
            String input=userInput.next();              //accepts user input
            //System.out.println(input.length());
            while(input.length()>1){                    //checks lenth of input
                System.out.print("You must enter exactly one character. Try again - ");
                input=userInput.next();
            }
            char output=input.charAt(0);
            for(int i=0; i<requiredLength; i++){
                //System.out.println("i= "+i+" "+required.charAt(i));
                if(output==required.charAt(i)){
                    return output;
                }
            }
            System.out.print("You did not enter a character from the list \""+required+"\". Try again - ");
            j++;
            if (j>max-1){
                System.out.println();
                System.out.println("You failed after five attempts.");
                output=' ';
                return output;
            }
        }
    }
    //
    //This method prompts the user with a givin prompt string 
    //recieves user input checks that the input is a single character
    //and checks to see to see if it matched a string of required characters. 
    //
    public static char getInput(Scanner userInput, String prompt, String required){
        System.out.println(prompt);
        int requiredLength=required.length();
        /*for(int j=0; j<requiredLength; j++){
            System.out.print("'"+required.charAt(j)+"',");
            if(j==requiredLength-1){
                System.out.print("'"+required.charAt(j)+"-");
            }
        }
        System.out.println();*/
        while(true){
                for(int j=0; j<requiredLength; j++){
                System.out.print("'"+required.charAt(j)+"',");
                if(j==requiredLength-1){
                    System.out.print("'"+required.charAt(j)+"- ");
                }
            }
            String input=userInput.next();              //accepts user input
            //System.out.println();
            //System.out.println(input.length());
            while(input.length()>1){                    //checks lenth of input
                System.out.print("You must enter exactly one character. Try again - ");
                input=userInput.next();
            }
            char output=input.charAt(0);
            int i;
            for(i=0; i<requiredLength; i++){
                //System.out.println("i= "+i+" "+required.charAt(i));
                if(output==required.charAt(i)){
                    return output;
                }
            }
            System.out.println("You did not enter a character from the list \""+required+"\".");
        }
    }
}