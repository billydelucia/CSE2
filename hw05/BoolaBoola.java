///////////////////////////////////////////////////
//Billy DeLucia
//cse
//hw05
//
//program creates 3 random true false statements and a boolean statement with them.
//the user must guess if the boolean statement is true or not
import java.util.Scanner;
public class BoolaBoola{
    public static void main(String[ ] args){
        Scanner input= new Scanner(System.in);
        // three random numbers to generate the three booleans
        int random1=(int)(Math.random()*2);
        int random2=(int)(Math.random()*2);
        int random3=(int)(Math.random()*2);
        int random4=(int)(Math.random()*4 +1); // this will be used to gernete the boolean statment for the other boolean statements
        
        boolean boo1=(random1<1);
        boolean boo2=(random2<1);
        boolean boo3=(random3<1);
        boolean test=true, guess, check;
        
        switch (random4){
            case 1:
                test= (boo1 && boo2 && boo3);
                System.out.println("Does "+boo1+" && "+boo2+" && "+boo3+" have the value true (t/T) or false (f/F)? ");
            break;
            case 2:
                test= (boo1 && boo2 || boo3);
                System.out.println("Does "+boo1+" && "+boo2+" || "+boo3+" have the value true (t/T) or false (f/F)? ");
            break;
            case 3:
                test= (boo1 || boo2 && boo3);
                System.out.println("Does "+boo1+" || "+boo2+" && "+boo3+" have the value true (t/T) or false (f/F)? ");
            break;
            case 4:
                test= (boo1 || boo2 || boo3);
                System.out.println("Does "+boo1+" || "+boo2+" || "+boo3+" have the value true (t/T) or false (f/F)? ");
            break;
        }
        String input1=input.next();
        char TorF=input1.charAt(0);
        switch (TorF){
            case 't':
            case 'T':
                guess=true;
                break;
            case 'f':
            case 'F':
                guess=false;
                break;
            default: System.out.println("Error");
            return;
        }
        
        String out="";
        check=(test==guess);
        if (check){
            out="Correct";
        }
        else{
            out="Wrong; try again";
        }
        
        System.out.println(out);
            
    }
}