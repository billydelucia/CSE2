///////////////////////////////////////////////////////////////////
//Billy Delucia
//CSE002
//
//Play file made for testing ideas and code 
//
import java.util.Scanner;
public class Play {
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