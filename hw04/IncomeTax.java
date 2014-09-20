////////////////////////////////////////////////////////////
//Billy DeLucia
//Income Tax homework
//
import java.util.Scanner;
public class IncomeTax {
    public static void main(String [ ] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter an int giving the number of thousands- ");
        //declaring variables
        double taxRate=0;
        int income;
        //decision tree based on income to assign tax rate
        if (input.hasNextInt()) {
            income= input.nextInt(); //user enters income in thousands and program checks if it is an int
            if (income>=0 && income<20){
                taxRate= 0.05;
            }
            else if (income>=20 && income<40){
                taxRate= 0.07;
            }
            else if (income>=40 && income<78){
                taxRate= 0.12;
            }
            else if (income>=78){
                taxRate= 0.14;
            }
            else{
                System.out.println("You did not enter a positive int");
            }
            
            //calculations
        double tax=income*taxRate*1000;
        double taxRatePercentage=taxRate*100;
        //output
        System.out.printf("The tax rate on $%2d,000  is %2.1f%% and the tax is $%5.1f %n",income,taxRatePercentage,tax);
        //System.out.println("The tax rate on " +income*1000+ " is " +taxRatePercentage+ "%, and the tax is " +tax);
        }
        else{
            System.out.println("You did not enter an int, Goodbye");
            return; //program terminates
        }
        
        
        
    }
}