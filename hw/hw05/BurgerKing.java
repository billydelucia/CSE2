///////////////////////////////////////////////////////////////////
//Billy DeLucia
//cse002
//homework 05
//
//Creates a BurgerKing ordering system where user is prompted on they're various choices
import java.util.Scanner;
public class BurgerKing {
	public static void main(String[ ] args) {
		Scanner input=new Scanner(System.in);
		System.out.printf("Enter a letter to indicate a choice of %n Burger (B or b) %n Soda (S or s) %n Fries (F or f)  ");
		String input1=input.next();
		char order1=input1.charAt(0);
		if (input1.length()>1){
			System.out.println("Single character expected");
			return; 
		}
		String input2="", extra="";
		char order2=' ';
		
		switch (order1){
			case 'B':
			case 'b': // burger questions and output code
				System.out.printf("Enter A or a for \"all the fixins\" %n C or c for cheese %n N or n for none of the above ");
				input2=input.next();
				order2=input2.charAt(0);
				if (input1.length()>1){
					System.out.println("Single character expected");
					return; 
				}
				extra="";
				switch (order2){
					case 'A':
					case 'a':
						extra=" with all the fixins";
						break;
					case 'C':
					case 'c':
						extra=" with cheese";
						break;
					case 'N':
					case 'n':
						extra="";
						break;
					default: System.out.println("You did not enter any of A, a, C, c, N or n");
					return;
				}
				System.out.println("You ordered a burger"+extra);
				break;
			case 'S':
			case 's':
				System.out.printf("Do you want Pepsi (p or P), %n Coke (c or C), Sprite (s or S) or Mountain Dew (M or m)-");
				input2=input.next();
				order2=input2.charAt(0);
				if (input1.length()>1){
					System.out.println("Single character expected");
					return; 
				}
				switch (order2){
					case 'P':
					case 'p':
						extra="Pepsi";
						break;
					case 'C':
					case 'c':
						extra="Coke";
						break;
					case 'S':
					case 's':
						extra="Sprite";
						break;
					case 'M':
					case 'm':
						extra="Mountain Dew";
						break;
					default: System.out.println("You did not enter any of P, p, C, c, S, s, M or m");
					return;
				}
				System.out.println("You ordered a "+extra);
				break;
			case 'F':
			case 'f':
				System.out.println("Do you want a large or small order of fries (L, l or S, s)");
				input2=input.next();
				order2=input2.charAt(0);
				if (input1.length()>1){
					System.out.println("Single character expected");
					return; 
				}
				switch (order2){
					case 'L':
					case 'l':
						extra="large";
						break;
					case 'S':
					case 's':
						extra="small";
						break;
					default: System.out.println("You did not enter any of L, l, S or s");
					return;
				}
				System.out.println("You ordered "+extra+" fries");
				break;
			default: System.out.println("You did not enter any of B, b, F, f, S, or s");
			return;
		}
	}
}
