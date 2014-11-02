/////////////////////////////////////////////////////////////////////
//Billy DeLucia
//CSE002
//homework09
//
//This program prompts the user to enter an integer betweent 1 and 9 inclusive and will repromt if the user enters
// an invalid input. Then the program prints out a pyramid of numbers based on the input. This program is special in the 
// way that it does this by segmenting the code into many different methods compared to a previos homework that
// did the same thing but all in a single method.

import java.util.Scanner;
public class BlockedAgain{
    public static void main(String []s){
        int m;
        //force user to enter int in range 1-9, inclusive.
        m = getInt(); 
        allBlocks(m);
    }
    //This Method prompts the user to enter a integer within the range [1-9] 
    //If the user inputs an invalid input the mehtod prints an error message and reprompts
    public static int getInt(){
//        Scanner input= new Scanner(System.in);
        //System.out.println("Enter an integer in the range [1-9]");
        int a;
        System.out.println("Enter an integer in the range [1-9]");
        do{
            a=intCheck();
        }while(!rangeCheck(a,1,9));
        
        return a;
    }
    
    //This mehtod checks if the user input is an integer or not and if it is not it returns an error message
    //and asks the user to renter an input until an integer is input
    public static int intCheck(){
        Scanner input= new Scanner(System.in);
        
        int a;
        while(!input.hasNextInt()){
            input.next();
            System.out.print("You did not enter an integer. Try again- ");
        }
        a=input.nextInt();
        return a;    
    }
    
    //This method checksif an integer a is within the acceptable bounds low and high
    public static boolean rangeCheck(int a, int low, int high){
//        Scanner input= new Scanner(System.in);
        boolean output;
        output= a>=low && a<=high;
        if(!output){
            System.out.print("Your integer input was not within the inclusive range [1-9]. Try again- ");
        }
        return output;
    }
    
    
    //This method is responcible for printing the pyramid of numbers as the output
    public static void allBlocks(int a){
        for(int i=0; i<=a; i++){
            block(i,a);
        }        
    }
    
    //This method prints as single block of numbers in the pyramid
    public static void block(int a, int original){
        for (int i=0; i<a; i++){
            space(a,original);
            line(a);
        }
        // try calling line again with - input
//        line(-);
        space(a, original);
        int length=a*2-1;
        for (int j=0; j<length; j++){   //This for loop prints the dashes (-) at the end of each block
            System.out.print("-");
        }
        System.out.println();
    }
    
    //This method prints a single line in a block
    public static void line(int a){
        int length= a*2-1;
        //int space= 
        for(int i=0; i<length; i++){
            System.out.print(a);
        }
        System.out.println();
    }
    
    //This method prints the correct number of spaces before each line to format the pyramid shape
    public static void space(int a, int original){
        for (int i=0; i<original-a; i++){
            System.out.print(" ");
//            System.out.print("|");
        }
        //System.out.println();
    }
}
