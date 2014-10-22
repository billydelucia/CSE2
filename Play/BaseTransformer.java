//////////////////////////////////////////////////////////////////////
//Billy DeLucia
//
// The goal of this program is to be able to translate differnt bases into base 10
// The accepoted bases should inclued binary octal and heidcimal.
// GOOD LUCK!!!

import java.util.Scanner;
public class BaseTransformer {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("This program translates diffent bases into decimal.");
		System.out.println("Accpeted bases are binary, base 2, octal, base 8, and hexadecimal, base 16");
		System.out.println("Please input the base of your input");
		
		// Check if desired input base is acceptable 
		if (!input.hasNextInt()){
			System.out.println("You did not enter an integer");
			return;
		}
		int base=input.nextInt();
		boolean goodInput= base==2 || base==8 || base==16;
		if (!goodInput){
			System.out.println("You entered an uspupported base, not 2, 8, or 16");
			return;
		}
		
		// asking for input in base 
		System.out.println("Enter number in correct form of input base");
		/*
		if (!input.hasNextInt()){
			System.out.println("You did not enter an integer");
			return;
		}
		*/
		int count=0, basepower=1, digit=0, add=0, sum=0, max=100;
		
		int number=0;
		switch (base){
			case 2:
			case 8:		//checking if input is a pure integer for base 2 and 8
				if (!input.hasNextInt()){
					System.out.println("You did not enter an integer");
					return;
				}	
				number=input.nextInt();
			break;
			case 16:
				String hexadecimal;
				String done="done";
				char hex;
				System.out.println("Enter each didgit idividually hitting 'enter' between each");
				System.out.println("Ender 'done' after last digit");
				while (true){						//allows user to input infinite digits unil 'dond'
					hexadecimal=input.next();		// accepts single hexadecimal digit from user
					if (hexadecimal.equals(done)){	//allows user to end infinite loop
						break;
					}
					hex=hexadecimal.charAt(0);
					int remainder=number;
					switch (hex){		//changing hexadecimal input into base 10 numbers
						case '1':
							add=1;
							break;
						case '2':
							add=2;
							break;
						case '3':
							add=3;
							break;
						case '4':
							add=4;
							break;
						case '5':
							add=5;
							break;
						case '6':
							add=6;
							break;
						case '7':
							add=7;
							break;
						case '8':
							add=8;
							break;
						case '9':
							add=9;
							break;
						case 'a':
						case 'A':
							add=10;
							break;
						case 'b':
						case 'B':
							add=11;
							break;
						case 'c':
						case 'C':
							add=12;
							break;
						case 'd':
						case 'D':
							add=13;
							break;
						case 'e':
						case 'E':
							add=14;
							break;
						case 'f':
						case 'F':
							add=15;
							break;
						default:
							System.out.println("Incorrect hexadecimal format");
					}
					//
					basepower*=base;
					if (count==0){
						basepower=1;
					}
					add*=basepower;
					sum+=add;		//base 10 tally
					count++;
					
				}
				
		}
		int remainder=number, check=0;
		
		// check for correct format of base
		switch (base){
			case 2:		//Binary
				while (remainder>0){
					check=remainder%10;
					remainder/=10;
					if (check>base-1){
						System.out.println("Incorrect binary format");
						System.out.println(check);
						return;
					}
				}
				break;
			case 8:		//Octal
				while (remainder>0){
					check=remainder%10;
					remainder/=10;
					if (check>base-1){
						System.out.println("Incorrect octal format");
						System.out.println(check);
						return;
					}
				}
				break;
			case 16:	//Hexadecimal
				System.out.println("This base is currently in beta mode");
				break;
		}
		
		//calculate decimal value
		// int count=0, basepower=1, digit=0, add=0, sum=0, max=100;
		remainder=number;
		switch (base){
			case 2:
			case 8:
				while (remainder>0){
					digit=remainder%10;
					remainder/=10;
					basepower*=base;
					if (count==0){
						basepower=1;
					}
					add=digit*basepower;
					sum+=add;
					count++;
					if (count>max){
						System.out.println("max cycles reached");
						break;
					}
				}
		}
		System.out.println("In decimal your input is "+sum);
	}
}