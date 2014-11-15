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
		
		//For Loop Program
		System.out.println("Using for Loops:");
		int i, j=0, k, f, g, h; //Declaring variables to use in following loops
		for(i=0; i<number; i++){
			g=(i*2)+1;
			for(k=0; k<i+1; k++){
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
			for(f=0; f<j; f++){
				System.out.print("-");			//printing the dashes
			}
			System.out.println();				//entering a new line
		}
		
		System.out.println("Using while loops");
		i=0; k=0; h=0; j=0;
		while(i<number){
			g=(i*2)+1;
			k=0;
			while(k<i+1){
				h=0;
				while(h<=number-i){
					System.out.print(" ");		//centers the numbers
					h++;
				}
				j=0;
				while(j<g){
					System.out.print((i+1));	//printing numbers
					j++;
				}
				System.out.println();
				k++;
			}
			h=0;
			while(h<=number-i){
				System.out.print(" ");			//centers the dashes
				h++;
			}
			f=0;
			while(f<j){
				System.out.print("-");			//prints dashes
				f++;
			}
			System.out.println();
			i++;
		}
		
		System.out.println("Using do-while loops:");
		i=0; k=0; h=0; j=0;
		do{
			g=(i*2)+1;
			k=0;
			do{
				h=0;
				do{
					System.out.print(" ");		//centers numbers
					h++;
				}while(h<=number-i);
				j=0;
				do{
					System.out.print(i+1);
					j++;
				}while(j<g);
				System.out.println();
				k++;	
			}while(k<i+1);
			h=0;
			do{
				System.out.print(" ");			//centers dashes
				h++;
			}while(h<=number-i);
			f=0;
			do{
				System.out.print("-");
				f++;
			}while(f<j);
			System.out.println();
			i++;
		}while(i<number);
	}
}