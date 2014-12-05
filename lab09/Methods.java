///////////////////////////////////////////////////////////
//Billy DeLucia
//CSE002
//lab09
//Methods
//
//This is the first program I will write with multiple methods.

import java.util.Scanner;
public class Methods{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter three integers: ");
        a=getInt(input);    //callse getInt method to 
        b=getInt(input);
        c=getInt(input);
        System.out.println("The larger of "+a+" and "+b+" is "+larger(a,b));
	System.out.println("The larger of "+a+", "+b+", and "+c+" is "+larger(a,larger(b,c)));
	System.out.println("It is "+ascending(a,b,c)+" that "+a+", "+b+", and "+c+" are in ascending order");
    }
    
    public static int getInt(Scanner userInput){
        //Scanner input=new Scanner(System.in);
        System.out.print("Enter and int - ");
        while(!userInput.hasNextInt()){
            userInput.next();
            System.out.print("You did not enter an integer. Try again- ");
        }
        int a=userInput.nextInt();
    
        return a;
    }
    
    public static int larger(int a, int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
     public static boolean ascending(int a, int b, int c){
         boolean output=(a<b && b<c);
         return output;
     }
    
     /*public static int smaller(int a, int b){
        if(a<b){
            return a;
        }
        else{
            return b;
        }
    }
    
    public static String ascending(int a, int b, int c){
        String output;
        int largest=larger(a,larger(b,c));
        /*switch(largest){
            case a:
                output= a+", "+larger(b,c)+", "+smaller(b,c);
                break;
            case b:
                output= b+", "+larger(a,c)+", "+smaller(a,c);
                break;
            case c:
                output= c+", "+larger(b,a)+", "+smaller(b,a);
                break;
            default:
                System.out.println("Error");
        int smallest= smaller(a, smaller(b, c));
        int middle=0;
        if (a==b || a==c || a<largest && a>smallest){
            middle=a;
        }
        else if(b==c || b<largest && b>smallest){
            middle=b;
        }
        else if(c<largest && c>smallest){
            middle=c;
        }
            
        
        output= smallest+", "+middle+", "+largest;
        return output;
    }*/
            
        
    
    
}