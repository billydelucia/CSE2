//////////////////////////////////////////////////////////////
//Billy DeLucia
// Month Homework
//
import java.util.Scanner;
public class Month{
    public static void main(String[ ] args){
        Scanner input=new Scanner(System.in);
        int month;
        boolean odd;
        System.out.print("Enter and int giving the number of the month (1-12)- ");
        //
        if (input.hasNextInt()) {
            month=input.nextInt();
            odd= (month%2)==1;
            if (month>=1 && month<=7){
                if (odd){
                    System.out.println("The month has 31 days");
                }
                else{
                    if (month==2){   //Febuary is a special case due to leap years
                        System.out.print("Enter and int giving the year ");
                        int year;
                        if (input.hasNextInt()){
                            year=input.nextInt();
                            boolean divisibleBy4= (year%4==0);
                            boolean divisibleBy100= (year%100==0);
                            boolean divisibleby400= (year%400==0);
                            if (divisibleBy4 && !divisibleBy100){
                                System.out.println("The month has 29 days");
                            }
                            else if (divisibleBy4 && divisibleBy100 && divisibleby400){
                                System.out.println("The month has 29 days");
                            }
                            else{
                                System.out.println("The month has 28 days");
                            }
                            
                        }
                        else{
                            System.out.println("You did not enter an int");
                            return; //terminates program
                        }
                    }
                    else{
                        System.out.println("The month has 30 days");
                    }
                }
                
            }
            else if (month>7 && month<=12){
                if (!odd){
                    System.out.println("The month has 31 days");
                }
                else{
                    System.out.println("The month has 30 days");
                }
            }
            else{
                System.out.println("You did not enter an int between 1 and 12");
            }
        }
        else{
            System.out.println("You did not enter an int");
            return; //terminates program
        }
    }
}