///////////////////////////////////////////////////////////////////////////////////////
//
//Billy Delucia
import java.util.Scanner;
public class Play1{
	public static void main(String [] args){
		Scanner input=new Scanner(System.in);
		for (int i=4; i>0; i--){
			for (int j=i; j>0; j--){
				for (int k=0; k<j; k++){
					System.out.print(i);
				}
				System.out.println();
			}
		}
	}
}