///////////////////////////////////////////////////////////////////////
//Billy DeLucia
//CSE002
//lab10
//
//This program prints out a series of digits and connects them lenth wise such that 60 add 3 is 360 not 63.
//Is does thsi by calling two diffent methods the addDigit method and the join method. The join method aslo calls the 
// addDigit method.


public class MethodCalls{
    
    //This is teh main method that prints lines explaining what the program is doing and calls
    //other methods to complete the task of either adding or joining integers.
    public static void main(String[] args){
        int a=784,b=22,c;
        c=addDigit(a,3);
        System.out.println("Add 3 to "+a+" to get "+c);
        c=addDigit(addDigit(c,4),5);
        System.out.println("Add 3, 4, and 5 to "+a+" to get "+c);
        System.out.println("Add 3 to -98 to get: "+addDigit(-98,3));
        c=join(a,b);
        System.out.println("Join "+a+" to "+b+" to get "+c);
        System.out.println("Join 87, 42, and 83 to get "+join(87, join(42,83)));
        System.out.println("Join -9 and -90 to get "+join(-9,-90));
        
    }
    
    //This method adds a digit to the end of an int
    //It also maintins the positive or negetive value to the original int
    public static int addDigit(int a, int b){
        int remainder=a;
        int i=1;
        while(remainder!=0){    //determines the lenth of the original int to determine the power of 10 that the added digit must be
            remainder=(int)(remainder/10);
            i*=10;  //the power of ten multiplier
        }
//      String test=""+b+a;
//        int answer=(int)test;
//       System.out.println(test);
        int add=b*i;
        if(a<0 ^ b<0){      //maintains negative or positive values (somewhat unclear if this is what was desired)
            add*=-1;
        }
        else if(a<0 && b<0){
            add*=-1;
            a*=-1;
        }
        int output=add+a;
        return output;
    }
    
    //This method joins two ints together such that the second int is added just past the end of the frist int
    //This method calls the addDigit method to complete its task
    public static int join(int a, int b){
        int remainder=a;
        int place;
        int newB=b;
        while (remainder!=0){
            place=remainder%10;         // isolates single digit to be added
            //System.out.println("place: "+place);
            remainder/=10;
            newB=addDigit(newB,place);  // adds single digit
            //System.out.println("New B: "+newB);
        }
        
        return newB;
        
    }
}
