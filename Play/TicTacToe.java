/////////////////////////////////////////////////////////////////
//Billy DeLucia
//
//Tic tac to simulator
//
import java.util.Scanner;
public class TicTacToe{
	public static void main(String [] args){
		int [] [] board=new int [3] [];
		for (int i=0; i<3; i++){
			board[i]= new int [3];
			for (int j=0; j<3; j++){
				board [i][j]=0;
			}
		}
		int player=0;
		do{
			player=XO();
			printBoard(board);
			move(board, player);
			printBoard(board);
		}while(play(board));
		win(board);
	}
	
	//recieves user input and assigns player value 1 or 2
	public static int XO(){
		Scanner input=new Scanner(System.in);
		int output=0;
		do{
			System.out.print("Enter 1 or 2 for player value:");
			 output=input.nextInt();
		}while(output<1 || output>2);
		return output;
	}
	
	//takes the users move in X and Y cordinates
	public static void move(int [] [] board, int player){
		Scanner input=new Scanner(System.in);
		do{
			System.out.print("Enter the X and Y cordinates of your move:");
			int X=input.nextInt();
			int Y=input.nextInt();
			if (board[Y][X]==0){
				board[Y][X]=player;
				return;
			}
			System.out.println("The spot is already taken");
		}while(true);
	}
	
	//
	public static void printBoard(int [] [] board){
		char print='E';
		System.out.println(" Y       Y");
		System.out.println("X  0 1 2  X");
		for(int i=0; i<3; i++){
			System.out.print(" "+i);
			for( int j=0; j<3; j++){
				switch (board[i][j]){
					case 0: print='_';
						break;
					case 1: print='X';
						break;
					case 2: print='O';
						break;
				}
				System.out.print(" "+print);
			}
			System.out.println(" "+i);
		}
		System.out.println("X  0 1 2  X");
		System.out.println(" Y       Y");
	}
	
	//
	public static boolean play(int [] [] board){
		char print='E';
		for (int i=0; i<3; i++){
			// checks each column
			if (board[i][0]==board[i][1] && board[i][1]==board[i][2] && board[i][0]!=0){
				System.out.println(board[i][0]+"won");
				return false;
			}
			//checks each row
			if (board[0][i]==board[1][i] && board[1][i]==board[2][i] && board[0][i]!=0){
				System.out.println(board[0][i]+"won");
				return false;
			}
		}
		if (board[0][0]==board[1][1] && board[1][1]==board[2][2] && board[0][0]!=0){
			System.out.println(board[0][0]+"won");
			return false;
		}
		if ((board[0][2]==board[1][1] && board[1][1]==board[2][0]) && board[0][2]!=0){
			System.out.println(board[0][2]+" won");
			return false;
		}
		return true;
	}
	
	//
	public static void win(int player){
		//no!
	}
}