//////////////////////////////////////////////////////////////////
//Billy DeLucia
//CSE002
//hw03 Four Digits
//
//
import java.util.Scanner;
public class FourDigits {
    public static void main(String [ ] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a double and I display the four digits to the right of the decimal point-");
        double four=input.nextDouble( );
        double digits=four%1;
        int onlyFour=(int)(digits*10000);
        System.out.println("The four digits are " +onlyFour);
    }
}