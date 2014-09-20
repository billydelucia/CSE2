/////////////////////////////////////////////////////////////////////
//BillyDeLucia
//Time Padding Homework
//
//This code takes input in seconds and transforms it into time of day military time
//currently doesnt have greater than 24 hour perameter
import java.util.Scanner;
public class TimePadding{
    public static void main(String[ ] args){
        Scanner input= new Scanner(System.in);
        int nSec;
        int seconds, minutes, hours;
        System.out.print("Enter the time in seconds: ");
        if (input.hasNextInt()){
            nSec=input.nextInt();
            if (nSec<0){
                System.out.println("You did not enter a positve int");
            }
            else{ //This section simplifies the entered number of seconds into hours, minutes, and seconds
                hours= (int)nSec/3600;
                minutes= (int)(nSec/60-hours*60);
                seconds= nSec-((int)(nSec/10)*10);
                //the next sections of if statements checks if a padded 0 is needed for either seconds minutes or both
                if (minutes<10 && seconds<10){ 
                    System.out.println("The time is "+hours+ ":0" +minutes+":0"+seconds);
                }
                else if (minutes<10){
                    System.out.println("The time is " +hours+ ":0" +minutes+":"+seconds);
                }
                else if (seconds<10){
                    System.out.println("The time is "+hours+ ":" +minutes+":0"+seconds);
                }
                else{
                    System.out.println("The time is "+hours+ ":" +minutes+":"+seconds);
                }
            }
        }
        else{
            System.out.println("You did not enter an int");
            return; //terminates program
        }
    }
}
