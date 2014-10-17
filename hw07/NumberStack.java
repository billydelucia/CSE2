////////////////////////////////////////////////////////////////////
//Billy DeLucia
//CSE002
//
//This prgram uses multiple kinds of loops to create a tree of numbers
//
import java.util.Scanner;
public class NumberStack{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number between 1 and 9 - ");
		
		while(!input.hasNextInt()){
			System.out.println("You did not enter an int, try again");
			System.out.print("Enter a number between 1 and 9 - ");
			input.next();
		}
		
		/*if(!input.hasNextInt()){
			System.out.println("You did not enter an int");
			return;
		}*/
		
		
		int number=input.nextInt();
		if(number<1 || number>9){
			System.out.println("Your inuput was outside the range [1,9]");
			return;
		}
		int i, j, k, f, g, h; //Declaring variables to use in following loops
		for(i=0; i<number; i++){
			g=(i*2)+1;
			for(k=0; k<g; k++){
				for(h=0; h<=number-i; h++){
					System.out.print(" ");		//centers the numbers
				}
				for(j=0; j<g; j++){
					System.out.print((i+1));	//printing numbers
				}
			System.out.println();				//entering a new line
			}
			for(h=0; h<=number-i; h++){
					System.out.print(" ");		//centers the dashes
			}
			for(f=0; f<k; f++){
				System.out.print("-");			//printing the dashes
			}
			System.out.println();				//entering a new line
		}
	}
}