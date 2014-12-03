////////////////////////////////////////////////////////////////////
//Billy DeLucia
//CSE002
//Homework 11
//
//This program accepts user input to create a five card poker hand.
//Then checks to see what kind of hand it is. i.e. straight, flush...

//Aces are high for straights (check line 33)

import java.util.Scanner;
public class PokerHands{
	public static void main(String [] args){
		do{
			System.out.println("Hello");
			int hand []=new int [5];
			int frequency []=new int [13];
			getHand(hand, frequency);
			printHand(hand);
			checkHand(hand, frequency);
		}while(again());
	}
	
	//This method recieves the user's input to populate the hand
	public static void getHand(int [] hand, int [] frequency){
		int suit=0;
		int rank=0;
		int card=0;
		for (int i=0; i<5; i++){
			suit=getSuit();
			rank=getRank();
			if (rank==1){
				frequency[12]++;	//Aces are high 
			} 
			else if (rank==0){
				frequency[11]++;
			}
			else{
				frequency[rank-2]++;
			}
			card=(suit*13)+rank;
			hand[i]=card;
		}
	}
	
	//This method recieves a user input to represent the suit of the card
	public static int getSuit(){
		Scanner input= new Scanner(System.in);
		int output=0;
		boolean repeat=false;
		do{
			repeat=false;
			System.out.print("Enter the suit: 'c', 'd', 'h', or 's' - ");
			String userInput=input.next();
			switch (userInput){
				case "c":
					output=0;
					break;
				case "d":
					output=1;
					break;
				case "h":
					output=2;
					break;
				case "s":
					output=3;
					break;
				default:
					System.out.println("Invalid input. Try again.");
					repeat=true;
			}
		}while(repeat);
		return output;
	}
	
	//This method recieves a user input to represent the rank of the card
	public static int getRank(){
		Scanner input=new Scanner(System.in);
		int output=0;
		String temp="";
		char convert='_';
		boolean repeat=false;
		do{
			repeat=false;
			System.out.print("Enter one of 'a', 'k', 'q', 'j', '10', ...'2'-");
			if (input.hasNextInt()){
				output=input.nextInt();
				if (output<2 || output>10){
					System.out.println("Invalid input. Try again.");
					repeat=true;
					continue;
				}
			}
			else{
				temp=input.next();
				if (temp.length()>1){
					System.out.println("Invalid input. Try again.");
					repeat=true;
					continue;
				}
				convert=temp.charAt(0);
				switch (convert) {
					case 'k':
						output=0;
						break;
					case 'a':
						output=1;
						break;
					case 'j':
						output=11;
						break;
					case 'q':
						output=12;
						break;
					default:
						System.out.println("Invalid input. Try again.");
						repeat=true;
						continue;
				}
			}
		}while(repeat);
		return output;
	}
	
	//This method prints out the contents of the hand.
	public static void printHand(int [] hand){
		int rank=0;
		char faceRank='_';
		for (int suit=0; suit<4; suit++){
			System.out.print(convertSuit(suit)+": ");
			for (int i=0; i<5; i++){
				if ((int)(hand[i]/13)==suit){
					rank=hand[i]%13;
					if (rank<2 || rank>10){
						faceRank=convertRank(rank);
						System.out.print(faceRank+"  ");
					}
					else{
						System.out.print(rank+"  ");
					}
				}
			}
			System.out.println();
		}
	}
	
	//This method converts the numerical value of the suit into a string
	public static String convertSuit(int suit){
		String output="";
		switch (suit){
			case 0:
				output="Clubs";
				break;
			case 1:
				output="Diamonds";
				break;
			case 2:
				output="Hearts";
				break;
			case 3:
				output="Spades";
		}
		return output;
	}
	
	//This method converts the numerical rank of a facecard into a char
	public static char convertRank(int rank){
		char output='_';
		switch (rank){
			case 0:
				output='K';
				break;
			case 1:
				output= 'A';
				break;
			case 11:
				output= 'J';
				break;
			case 12:
				output= 'Q';
				break;
		}
		return output;
	}
	
	//This method checks the cards for the best poker hand
	public static void checkHand(int [] hand, int [] frequency){
		int [] matches= new int [5];
		for (int i=0; i<5; i++){
			for (int j=0; j<13; j++){
				if (frequency[j]==i){
					matches[i]++;
				}
			}
		}
		//boolean straight=false, flush=false, pair=false, three=false, four=false, 
		if (straight(matches, frequency) && flush(hand) && frequency[11]==1){
			System.out.println("This is a Royal Straight Flush");
		}
		else if (straight(matches, frequency) && flush(hand)){
			System.out.println("This is a Straight Flush");
		}
		else if (straight(matches, frequency)){
			System.out.println("This is a Straight.");
		}
		else if (flush(hand)){
			System.out.println("This is a Flush");
		}
		else if (matches[4]==1){
			System.out.println("This is a Four of a Kind");
		}
		else if (matches[3]==1 && matches[2]==1){
			System.out.println("This is a Full House");
		}
		else if (matches[2]==1){
			System.out.println("This is a Pair");
		}
		else{
			System.out.println("High Card");
		}
		
	}
	
	//Checks if there is a straight
	public static boolean straight(int [] mathes, int [] frequency){
		if (mathes[1]!=5){
			return false;
		}
		int five=0, i=0;
		while(five<5){
			five+=frequency[i];
			if( five>0 && frequency[i]==0){
				return false;
			}
			i++;
		}
		return true;
	}
	
	//Checks if the hand has a flush
	public static boolean flush(int [] hand){
		int check= (int)(hand[0]/13);
		int temp=0;
		for (int i=1; i<5; i++){
			temp=(int)(hand[i]/13);
			if (check!=temp){
				return false;
			}
		}
		return true;
	}
	
	//This method determines if the user would like to enter another hand.
	public static boolean again(){
		Scanner input= new Scanner(System.in);
		System.out.print("Enter 'y' or 'Y' to enter another hand: ");
		String userInput=input.next();
		if (userInput.length()>1){
			return false;
		}
		char check=userInput.charAt(0);
		if (check=='y' || check=='Y'){
			return	true;
		}
		else{
			return false;
		}
	}
}