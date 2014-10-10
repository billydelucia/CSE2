/*Sample of expected output:
 *   Enter an int- 9
 *   You entered 9
 *   sum is 25
 *   Again, you entered 9
 */

import java.util.Scanner;
public class Enigma0{
  public static void main(String arg []){
    int n;  // declaring the varible within the larger scope of the main method
    System.out.print("Enter an int- ");
    Scanner scan=new Scanner(System.in);
    if(scan.hasNextInt()){
      n=scan.nextInt(); //initializing but not declaring n
      System.out.println("You entered "+n);
    }
    else{
      n=4;  //initializing but not declaring n
      System.out.println("You entered "+n);
    }
    
    int k=4,p=6,q=7,r=8;    // no need to redeclare n
    switch(k+p+q+r){
      case 24: 
      case 25: System.out.println("sum is 25");
      default:
        System.out.println("To repeat, you entered "+n);
    }
  }
}

/* Error report:
 *   Expand this comment:
 Compiler Error: the variable n night not have been initialized. This is because int n was originally 
 declared within the scope of an if statement and then redeclared but not inititialized afterwords.
 *   Explain the error(s) that occurred here, and then fix them
 */

