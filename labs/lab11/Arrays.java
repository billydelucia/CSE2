///////////////////////////////////////////////////////////////////////
//Billy Delucia
//CSE 002
//Lab11
//
//This program makes two arrays both holding ten values. The user enters the ten
//values for the first array and the program coppies the values in reverse order
// in the second array.
//

import java.util.Scanner;
public class Arrays{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		
		
		//first Array
		int [] ArrayOne;
		ArrayOne=new int [10];
		
		//populating array
		for (int i=0; i<10; i++){
			System.out.print("Enter value #"+(i+1)+": ");
			ArrayOne[i]=input.nextInt();
		}
		
		//anaylysis of first Array
		
		//finding lowest input
		int lowest=ArrayOne[0];
		for (int z=1; z<10; z++){
			if (lowest>ArrayOne[z]){
				lowest=ArrayOne[z];
			}
		}
		System.out.println("The Lowest input was: "+lowest);
		
		//finding highest
		int highest=ArrayOne[0];
		for (int h=1; h<10; h++){
			if (highest<ArrayOne[h]){
				highest=ArrayOne[h];
			}
		}
		System.out.println("The highest input was: "+highest);
		
		//finding sum
		int sum=0;
		for (int g=0; g<10; g++){
			sum+=ArrayOne[g];
		}
		System.out.println("The sum of inputs is: "+sum);
		
		//second array
		int [] ArrayTwo;
		ArrayTwo= new int [10];
		
		//populate array 2
		for (int j=0; j<10; j++){
			//System.out.println(j);
			ArrayTwo[j]=ArrayOne[9-j];
		}
		
		//print contests of both arrays
		for (int k=0; k<10; k++){
			System.out.println(ArrayOne[k]+"   "+ArrayTwo[k]);
		}
	}
}