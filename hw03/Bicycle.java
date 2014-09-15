////////////////////////////////////////////////////////////////////////
//Billy DeLucia
//CSE 002
//hw02
// 
//
import java.util.Scanner;
//
public class Bicycle {
    public static void main(String [ ] args) {
        Scanner input=new Scanner(System.in);
        //
        //recieving input from user for time and distance of trips
        System.out.println("Enter the number of seconds:");
        int seconds=input.nextInt( );
        System.out.println("Enter the number of counts:");
        int counts=input.nextInt( );        
        //
        //calculations
        double diameter=27; //inches
        double circumference=diameter*3.14159; //circumference of the wheel and the distance travelled per cout in inches
        double inchesPerFoot=12;
        double feetPerMile=5280;
        double milesPerCount=(circumference/inchesPerFoot)/feetPerMile;
        int tLenth= (int)((counts*milesPerCount)*100.0);
        double tripLenth=tLenth/100.0;
        double secondsPerMinute=60;
        int tTime= (int)((seconds/secondsPerMinute)*100.0);
        double tripTime=tTime/100.0; //minutes
        double minutesPerHour=60;
        double tripInHours=(seconds/secondsPerMinute)/minutesPerHour;
        double averageMPH=(counts*milesPerCount)/tripInHours;
        //
        //Outputw
        System.out.println("The distance was " +tripLenth+ " miles and took " +tripTime+ " minutes");
        System.out.printf("The average mph was %2.2f\n", averageMPH);
        
        
    }
}