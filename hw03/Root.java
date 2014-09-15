///////////////////////////////////////////////////////////
//Billy DeLucia 
//CSE002
//hw03 root problem
// finding the cube root of a user entered number "x" (double)
//finding this root with a wierd guessing technique
import java.util.Scanner;
public class Root {
    public static void main(String [ ] args) {
        Scanner input=new Scanner(System.in); //named input as a scanner class
        System.out.printf("Enter a double, and I print its cube root- ");
        double x=input.nextDouble( );
        double guess=x/3; // a very rough guess for cube root
        guess=(2*guess*guess*guess+x)/(3*guess*guess); // refining the guess mutiple (5) times 
        guess=(2*guess*guess*guess+x)/(3*guess*guess);
        guess=(2*guess*guess*guess+x)/(3*guess*guess);
        guess=(2*guess*guess*guess+x)/(3*guess*guess);
        guess=(2*guess*guess*guess+x)/(3*guess*guess);
        //
        double guessCubed=guess*guess*guess; //cubing the final guess
        //
        System.out.println("The cube root is " +guess);
        System.out.println(guess+ "*" +guess+ "*" +guess+ "=");
        System.out.println(guessCubed);
        
    }
}