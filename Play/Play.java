///////////////////////////////////////////////////////////////////
//Billy Delucia
//CSE002
//
//Play file made for testing ideas and code 
//
import java.util.Scanner;
public class Play {
/*
	public static int input(int scannerInput, int max, int min){
		while(!scannerInput.hasNextInt){
			Scanner input= new Scanner(System.in);
			System.out.print("You did not enter and integer. Try again -");
			scannerInput=input.nextInt;
		}
		while(scannerInput<min || scannerInput>max){
			
		}
	}
*/
	public static int hasInt(int scannerInput)
	
	public static void main(String [] args){
		Scanner input=new Scanner(System.in());
		System.out.printlin("Enter int");
		int user=input.nextInt();
		int count=0;
		//int i;
		int j;
		
		for (int i=0; i<user; i++){
			System.out.println("i: "+i);
			for (j=0; j<count; j++){
				System.out.println("	j: "+j);
			}
		}
	}
}