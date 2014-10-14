///////////////////////////////////////////////////////////////
//Billy DeLucia
//CSE002
//hw06
//Roulette
//
// This program tests your roulette bet. It assumes you kep the same bet over 100 spins. 
// This program runs this system 1000 times. Giving you a result based on 100,000 bets.
// It also gives you the number of times you came away with a profit after a series of 100 bets
// as well as the number of times you lost every bet in the 100 bet series.

import java.util.Scanner;
public class Roulette {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Place a bet on a number between 1 and 36 - ");
        if (!input.hasNextInt()){       //checking for valid input
            System.out.println("You did not enter an integer");
            return;
        }
        int place=input.nextInt();      // accepting user input for bet
        // I assume you cant bet on 0 or 00
        if (place<1 || place>36){       //checking if input is within range of roulette 
            System.out.println("Your bet wasnt within the range [1,36]");
            return;
        }
        
       // declaring variables to use in loops
        int winner=0, wins=0, cost=0, loser=0, winnerCount=0;
        int run=100, i=0;
        int revenue=0, profit=0, totalRevenue=0;
        
        for(int j = 0; j < 1000; j++){
            i=0;
            cost=0;
            wins=0;
            while (i<run){
                winner= (int) (Math.random()*38)+1;     //generating random roulette spin
                if (winner==place){                     //checking if bet was a win
                    wins++;                             // if bet won counting wins
                }
                i++;                                    //counting spins
                cost++;                                 //tallying costs
        
            }
        revenue=wins*36;
        totalRevenue+=revenue;
        //System.out.println(profit);
        profit=revenue-cost;
        if (profit>0){                                  // did we make a profit this round?
            winnerCount++;
        }
        if (wins==0){                                   // did we lose completely this round?
                loser++;
        }
        
        //System.out.println("Revenue:"+revenue+"  Cost of bet:"+cost+"  Profit: "+profit);
    }
        //System.out.println("Revenue:"+revenue+"  Cost of bet:"+cost+"  Profit: "+profit);
        System.out.println("Total winnings $"+totalRevenue);
        System.out.println("You lost every bet "+loser+" times, and you came away with a profit "+winnerCount+" times");
    }
}