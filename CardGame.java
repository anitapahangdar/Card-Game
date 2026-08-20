/*
 * Name: Anita Pahangdar
 * Date: Oct 7th and 8th
 * Teacher: Ms. Siddiqui
 * Description: Standard Deck of Cards
 */

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class CardGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hello!");
		System.out.println("Welcome to the game! My name is Anita and today I will be your dealer.");
		System.out.println("\n----------------------------------------------------------------------");
		
		//creating a 2d array with 4 rows and 13 columns
		String[][] deck = new String[4][13];
		
		//creating an ArrayList
		ArrayList<String> cards = new ArrayList<>();
		
		//calling the method to add the cards to the deck
		deck = createDeck(deck);
		
		//printing the deck of card in a table format
		System.out.println("The deck of cards: ");
		for(int row = 0; row < 4; row++){
			for(int col = 0; col < 13; col++){
				System.out.print(deck[row][col] + "\t");
			}
			System.out.println();
		}
		
		//adding all elements to the ArrayList
		 for (int row = 0; row < 4; row++) {
	            for (int col = 0; col < 13; col++) {
	                cards.add(deck[row][col]);
	            }
	        }
		
		//calling the method to shuffle the deck
		cards = shuffleDeck(cards);
		
		//creating two arrays for each player 
		ArrayList<String> player1 = new ArrayList<>();
		ArrayList<String> player2 = new ArrayList<>();
		
		//Ask how many cards each player should receive and validate all input.
		int count = 0;
		while (count < 1 || count > 26) {
			System.out.print("\nHow many cards should I give to each player? (1-26): ");
			if (sc.hasNextInt()) {
				count = sc.nextInt();
				if (count < 1 || count > 26) {
					System.out.println("Please enter a number between 1 and 26.");
				}
			} else {
				System.out.println("Please enter a whole number.");
				sc.next();
			}
		}
		
		//calling the method deal to hand cards out to the players
		deal(cards, player1, player2, count);
		
		//printing each players hand
		System.out.println("----------------------------------------------------------------------");
		System.out.println("\nLET'S SHUFFLE");
		System.out.println("Don't peak at eachother's hand! ;)");
		System.out.println("\nPlayer 1: ");
		for (String card : player1) {
            System.out.print("[" + card + "] ");
        }
		System.out.println();
		
		System.out.println("\nPlayer2: ");
		for (String card : player2) {
            System.out.print("[" + card + "] ");
        }
		System.out.println();
		
		//calculating the points for each player
		int player1Point = calcPoints(player1);
		int player2Point = calcPoints(player2);
		
		if (player1Point > player2Point) {
			System.out.println("\nCongratulations! Player 1 won this hand with " + player1Point + " points.");
		} else if (player2Point > player1Point) {
			System.out.println("\nCongratulations! Player 2 won this hand with " + player2Point + " points.");
		} else {
			System.out.println("\nThis hand is a tie at " + player1Point + " points each.");
		}
		
		System.out.println("Thank you for playing! Restart the program to play again.");
		sc.close();

	}
	
	
	public static String[][] createDeck(String[][] deck){
		//create arrays to store the combinations
		String[] typ = {"♦", "♣", "♥", "♠"};
		String[] num = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		
		//using for loop to add the cards to the deck: 4 rows and 13 columns
		for(int row = 0; row < 4; row++){
			for(int col = 0; col < 13; col++){
				deck[row][col] = num[col] + typ[row];
			}
		}
		
		//returning the modified ArrayList
		return deck;
	}
	
	//fisher-yates shuffle
	public static ArrayList<String> shuffleDeck(ArrayList<String> cards) {
		//generating a random number
		Random rnd = new Random();
		
		for (int i = cards.size() - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            //swap elements at i and index
            String temp = cards.get(i);
            cards.set(i, cards.get(index));
            cards.set(index, temp);
        }
		
		//returning the modified ArrayList
		return cards;
	}
	
	public static void deal(ArrayList<String> cards, ArrayList<String> player1, ArrayList<String> player2, int count){
		//adding the first 8 shuffled cards to player1's hand
		for(int i = 0; i < count; i++){
			player1.add(cards.get(i));
		}
		
		//adding the first 8 shuffled cards to player2's hand
		for(int i = count; i < count*2; i++){
			player2.add(cards.get(i));
		}
	}
	
	public static int calcPoints(ArrayList<String> player1){
		//declaring variables to keep track of each player's points
		int points = 0;
		
		for (String card : player1) {
	        //separating the numbers from the card
	        String rank = card.substring(0, card.length() - 1);
	        
	        //adding up the points based on each card
	        if (rank.equals("J") || rank.equals("Q") || rank.equals("K")) {
	            points += 10;
	        }
	        //ace gets one point
	        else if (rank.equals("A")) {
	            points += 1;
	        } 
	        //converting the strings to int and add it to the points
	        else {
	            points += Integer.parseInt(rank);
	        }
	    }
	    
	    return points;
		
	}
	
}