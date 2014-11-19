///////////////////////////////////////////
//Billy DeLucia
//CSE002
//
//
import java.util.Random;
import java.util.Scanner;
public class PokerOdds{
    public static void main(String [] args){
        showHands();
        simulateOdds();
    }
    
    public static void showHands(){
        int [] deck= new int [52];
        for (int i=0; i<52; i++){
            deck[i]=i;
        }
        
        int [] hand= new int [5];
        for (int j=0; j<5; j++){
            hand[j]=-1;
        }
        
        for (int k=0; k<5; k++){
            Random random=new Random();
            int draw=deck[random.nextInt(deck.length)];
            hand [k]=draw;
            hand [k]=deck[draw];
            deck [draw]=-1;
        }
        System.out.println();
        System.out.print("Clubs: ");
        for (int z=0; z<5; z++){
            if (hand[z]<13){
                switch (hand[z]){
                    case 0 :
                        System.out.print("A ");
                        break;
                    case 1 :
                        System.out.print("K ");
                        break;
                    case 11 :
                        System.out.print("J ");
                        break;
                    case 12 :
                        System.out.print("Q ");
                        break;
                    default :
                        System.out.print(hand[z]+" ");
                }
            }
        }
        System.out.println();
        System.out.print("Diamonds: ");
        for (int z=0; z<5; z++){
            if (hand[z]>=13 && hand[z]<26){
                switch (hand[z]){
                    case 13 :
                        System.out.print("A ");
                        break;
                    case 14 :
                        System.out.print("K ");
                        break;
                    case 24 :
                        System.out.print("J ");
                        break;
                    case 25 :
                        System.out.print("Q ");
                        break;
                    default :
                        System.out.print(hand[z]-13+" ");
                }
            }
        }
        System.out.println();
        System.out.print("Hearts: ");
        for (int z=0; z<5; z++){
            if (hand[z]>=26 && hand[z]<39){
                switch (hand[z]){
                    case 26 :
                        System.out.print("A ");
                        break;
                    case 27 :
                        System.out.print("K ");
                        break;
                    case 37 :
                        System.out.print("J ");
                        break;
                    case 38 :
                        System.out.print("Q ");
                        break;
                    default :
                        System.out.print(hand[z]-26+" ");
                }
            }
        }
        System.out.println();
        System.out.print("Spades: ");
        for (int z=0; z<5; z++){
            if (hand[z]>=39 && hand[z]<52){
                switch (hand[z]){
                    case 39 :
                        System.out.print("A ");
                        break;
                    case 40 :
                        System.out.print("K ");
                        break;
                    case 50 :
                        System.out.print("J ");
                        break;
                    case 51 :
                        System.out.print("Q ");
                        break;
                    default :
                        System.out.print(hand[z]-39+" ");
                }
            }
        }
        System.out.println();
    }
    
    public static void simulateOdds(){
        
        int add=0;
        for (int v=0; v<10000; v++){
            int [] deck= new int [52];
            for (int i=0; i<52; i++){
                deck[i]=i;
            }
            
            int [] hand= new int [5];
            for (int j=0; j<5; j++){
                hand[j]=-1;
            }
            
            for (int k=0; k<5; k++){
                Random random=new Random();
                int draw=deck[random.nextInt(deck.length)];
                hand [k]=draw;
                hand [k]=deck[draw];
                deck [draw]=-1;
            }
            
            
            for (int h=0; h<5; h++){
                int pair1=hand[h];
                for (int g=0; g<5; g++){
                    if (h==g){
                        continue;
                    }
                    int pair2=hand[g];
                    if (pair1%13==pair2%13){
                       add++; 
                    }
                }
            }
        
        }
        int pairs=add/2;
        System.out.println(add +" "+(10000-pairs) );
    }
}