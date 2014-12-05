/* Insert System.out.println() statements in the code
 * below, displaying the status of n and k, which 
 * should help you identify when n  or k becomes 0 and causes
 * the program to crash
 */

import java.util.Scanner;
public class Enigma3{
  public static void main(String [] arg){
    int n=40,k=60;
    String out="";
    switch(k%14){     //switch 1
      case 12: 
      case 13: out+=13;
         break;
      default: out+=40;
          n/=3;
          k-=7;
    }
    System.out.println(n+k); //Added
    if(n*k%12< 12){
      n-=20;
      out+=n;
    }
    if(n*n>k){
      n=42;
      out+=n+k;
    }
    else {
      n=45;
      out+=n+k;
    }
    System.out.println(n+k); //Added
    System.out.println((n+k));
    switch(n+k){      //switch 2
      case 114: 
        n-=11;
        k-=3;
        System.out.println(n+k); //Added
        break;
      case 97:
        n-=14;
        k-=2;
        System.out.println(n+k); //Added
        break;
      case 98:
        n/=5;
        k/=9;
        System.out.println(n+k); //Added
      default:
        n-=3;
        k-=5;//k=0 here
        System.out.println(n+k); //Added
    }
    System.out.println(n+k); //Added
     out+=1/n;// + 1/k;   
    System.out.println(out);
  }
}

/*
 * Error report:
 * I determined that k became zero by commenting it out and checking if the program ran
 * I then checked wich case ran in the second switch statment and it was case 98
 * I commented 1/k out of the final statement but there are multiple ways to fix this bug
 * 
 */

