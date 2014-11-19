///////////////////////////////////////////
//Billy DeLucia
//CSE002
//
//This program givese the user a simulated poker hand. Then the program simulats 10,000 hands and counds the 
//number of hands with exactly one pair and what card the pair is of. The program then prints the simulation out.
import java.util.Random;
import java.util.Scanner;
public class PokerOdds{
    public static void main(String [] args){
        showHands();
        simulateOdds();
    }
    // This method generates a single hand
    public static void showHands(){
        //creates an array that is used as the deck of available cards
        int [] deck= new int [52]; 
        for (int i=0; i<52; i++){
            deck[i]=i;
        }
        
        //creates an array to represent your five card hand
        int [] hand= new int [5];
        for (int j=0; j<5; j++){
            hand[j]=-1;
        }
        
        //moves cards from the deck to your hand
        for (int k=0; k<5; k++){
            Random random=new Random();
            int draw=deck[random.nextInt(deck.length)];
            // makes sure you cant get the same card twice
            if (draw<0){
                    k--;
                    continue;
                }
            hand [k]=draw;
            hand [k]=deck[draw];
            deck [draw]=-1;
        }
        //Prints the suit and card value of your card
        System.out.println();
        System.out.print("Clubs: ");
        for (int z=0; z<5; z++){
            if (hand[z]<13){ //checks suit
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
            if (hand[z]>=13 && hand[z]<26){//checks suit
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
            if (hand[z]>=26 && hand[z]<39){ //checks suit
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
            if (hand[z]>=39 && hand[z]<52){ //checks suit
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
        // declaring variables to count the number of pairs of each card value
        int A=0, K=0, Q=0, J=0, two=0, three=0, four=0, five=0, six=0, seven=0, eight=0, nine=0, ten=0;
        //total pairs
        int total=0;
        for (int v=0; v<10000; v++){
            
            //makes deck
            int [] deck= new int [52];
            for (int i=0; i<52; i++){
                deck[i]=i;
            }
            
            //makes hand
            int [] hand= new int [5];
            for (int j=0; j<5; j++){
                hand[j]=-1;
            }
            
            //populates hand
            for (int k=0; k<5; k++){
                Random random=new Random();
                int draw=deck[random.nextInt(deck.length)];
                if (draw<0){
                    k--;
                    continue;
                }
                
                hand [k]=draw;
                hand [k]=deck[draw];
                deck [draw]=-1;
            }
            
            //checks to make sure there is only one pair
            int check=0;
            for (int s=0; s<5; s++){
                int pair1=hand[s];
                for (int d=0; d<5; d++){
                    if (s==d){
                        continue;
                    }
                    int pair2=hand[d];
                    if (pair1%13==pair2%13){
                        check++;
                        } 
                    }
                }
            
            if (check>2){
                continue;
            }
            
            // counts the pair and of what value the pair is of
            for (int h=0; h<5; h++){
                int pair1=hand[h];
                for (int g=0; g<5; g++){
                    if (h==g){
                        continue;
                    }
                    int pair2=hand[g];
                    if (pair1%13==pair2%13){
                        
                        total++;
                        // gives the pair to the specific value of the card
                       switch (pair1%13){
                            case 0 :
                                A++;
                                break;
                            case 1 :
                                K++;
                                break;
                            case 11 :
                                J++;
                                break;
                            case 12 :
                                Q++;
                                break;
                            case 2:
                                two++;
                                break;
                            case 3:
                                three++;
                                break;
                            case 4:
                                four++;
                                break;
                            case 5:
                                five++;
                                break;
                            case 6:
                                six++;
                                break;
                            case 7:
                                seven++;
                                break;
                            case 8:
                                eight++;
                                break;
                            case 9:
                                nine++;
                                break;
                            case 10:
                                ten++;
                                break;
                        } 
                    }
                }
            }
            
        
        }
        
        // each pair is counted twice so must devide the count by 2 to get the real result
         A/=2; K/=2; Q/=2; J/=2; two/=2; three/=2; four/=2; five/=2; six/=2; seven/=2; eight/=2; nine/=2; ten/=2;
         total/=2;
         
        // prints results
        System.out.println("A   "+A);
        System.out.println("K   "+K);
        System.out.println("Q   "+Q);
        System.out.println("J   "+J);
        System.out.println("10  "+ten);
        System.out.println("9   "+nine);
        System.out.println("8   "+eight);
        System.out.println("7   "+seven);
        System.out.println("6   "+six);
        System.out.println("5   "+five);
        System.out.println("4   "+four);
        System.out.println("3   "+three);
        System.out.println("2   "+two);
        System.out.println("Total not exactly one pair "+(10000-total));
    }
}