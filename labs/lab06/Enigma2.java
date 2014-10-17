////////////////////////////////////////////////////////////
//Billy DeLucia
//CSE002
//
//
import java.util.Scanner;
public class Enigma2{
  public static void main(String [] arg){
    int n=40,k=60;
    String out="";
    switch(n){
      case 12: 
      case 13: out+=13;
      case 40: out+=40;///0;
    }
    System.out.println(out);
  }
}

/*
 * Error Report: Explain how you can use the java.lang exception to
 *     identify the runtime error in the above code
 *      The runtime error is in line 40 dividing 40 by zero
 *      I commented the error out so that the code just adds
 *      40 to string out
 * 
 * 
 */

