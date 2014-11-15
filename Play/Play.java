///////////////////////////////////////////////////////////////////
//Billy Delucia
//CSE002
//
//Play file made for testing ideas and code 
//
import java.util.Scanner;
public class Play{
	public static void main(String [] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter and int-");
		int max=input.nextInt();
		int check=0;
		for (int i=1; true; i++){
			check=0;
			for (int j=max; j>0; j--){
				check+=i%j;
			}
			if (i%100==0){
				System.out.println(check);
			}
			if (check==0){
				System.out.println(i);
				break;
			}
		}
	}
}	