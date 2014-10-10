//////////////////////////////////////////////////////////////////////
//Billy DeLucia
//Course Number Homework
//
import java.util.Scanner;
public class CourseNumber{
    public static void main(String[ ] args){
        Scanner input= new Scanner(System.in);
        int courseNumber;
        System.out.print("Enter a six digit number giving the course semester- ");
        //promted user for input
        if (input.hasNextInt()){ //checking if input is an int
            courseNumber=input.nextInt();
            boolean test1= (courseNumber%10==0 && courseNumber%100<=40);
            boolean test2= (courseNumber%1000==0);
            boolean legit= (test1 && !test2); // checking if input is a valid input for our purposes
            if (courseNumber<186510 || courseNumber>201440){ //checking if the input is within the relevent time ranges
                System.out.println("The number was outsid the range [186510,201440]");
                return;
            }
            else if (!legit){
                System.out.println(courseNumber+ " is not a legitimate semester");
            }
            else{ //now that we have checked that the input is valid and relivant we can produce the correct output based ou year and semester
                int year= (int)(courseNumber/100);
                int semester= courseNumber%100;
                if (semester==10){
                    System.out.println("The course was offerd in the Spring semester of " +year);
                }
                else if (semester==20){
                    System.out.println("The course was offerd in the Summer 1 semester of " +year);
                }
                else if (semester==30){
                    System.out.println("The course was offerd in the Summer 2 semester of " +year);
                }
                else if (semester==40){
                    System.out.println("The course was offerd in the Fall semester of " +year);
                }
            }    
        }    
        else{
            System.out.println("You did not enter an int");
            return;
        }
    }
}