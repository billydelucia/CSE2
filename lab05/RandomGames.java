////////////////////////////////////////////////////////////////////
//Billy DeLucia
//lab05
//RandomGames
// 
//This program allows teh user to choose one of 3 random chance games:
//Roulet
//Craps
//Card Picck
// For any on of these inputs the program will generate a random output within the relative parameters of the game
import java.util.Scanner;
public class RandomGames{
    public static void main(String[ ] args) {
        char game;
        String input1;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter R or r for Roulette, C or c for craps, P or p for pick a card- ");
        
        input1=input.next( );
        if (input1.length()>1){
            System.out.println("a single charachter was expected");
            return; // program terminated
        }
        game = input1.charAt(0);
        
        switch (game){
            case 'R':
            case 'r': // Roulette code
                System.out.print("Roulette: ");
                int spin=(int) (Math.random()*38+1); //creates random spin
                switch (spin) {
                    case 38: System.out.println("00"); break;   // replaces 38 with double zero
                    default: System.out.println(spin);
                }
            break;
            
            case 'C':
            case 'c': // Craps code
                int dice1= (int) (Math.random()*6+1);
                int dice2= (int) (Math.random()*6+1);
                int total= dice1+dice2;
                System.out.println("Craps: "+dice1+" + "+dice2+" = "+total);
            break;
            
            case 'P':
            case 'p': // Pick a card code
                int card= (int) (Math.random()*13+1);
                int suit= (int) (Math.random()*4+1);
                String suitOut=" ",cardOut=" ";
                switch (suit){
                    case 1: suitOut="Clubs"; break;
                    case 2: suitOut="Diamonds"; break;
                    case 3: suitOut="Hearts"; break;
                    case 4: suitOut="Spades"; break;
                }
                if (card>=11 || card==1){
                    switch (card) {     //checs if card is face card
                        case 11: cardOut="Jack"; break;
                        case 12: cardOut="Queen"; break;
                        case 13: cardOut="King"; break;
                        case 1: cardOut="Ace"; break;
                    }
                    System.out.println("You picked a "+cardOut+" of "+suitOut); //prints out face card
                } else{
                    System.out.println("You picked a "+card+" of "+suitOut);    //prints out normal card
                }
            break;
            
            default: System.out.println("'"+game+"' is not one of 'R', 'r', 'C', 'c', 'P', or 'p'");
            return; //program terminated
            
            
        }
    }
}
