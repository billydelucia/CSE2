////////////////////////////////////////////////////////////////////////
//Billy DeLucia
//CSE002
//
import java.util.Scanner;
public class LoopTheLoop {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter an int between 1 and 15");
        if (!input.hasNextInt()){
            System.out.println("You did not enter an int");
            return;
        }
        int nStars=input.nextInt();
        if (nStars<1 || nStars>15){
            System.out.println("Your int was not within the range [1,15]");
            return;
        }
        int x=0;
        while (x<nStars){
            System.out.print("*");
            x++;
        }
        System.out.println("");
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
    }
}