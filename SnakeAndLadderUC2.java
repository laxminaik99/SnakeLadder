package com.bridgelabz7;
import java.util.*;

public class SnakeAndLadderUC2 {
	
	private static final int WINNING_POSITION = 100;
    private static final int SNAKE = 1;
    private static final int LADDER = 2;
    
    private static final Random random = new Random();
    
    private static Map<Integer, Integer> snakesAndLadders = new HashMap<>();

    static {
        // Define the positions of snakes and ladders
        snakesAndLadders.put(17, 7);
        snakesAndLadders.put(54, 34);
        snakesAndLadders.put(62, 19);
        snakesAndLadders.put(64, 60);
        snakesAndLadders.put(87, 36);
        
        snakesAndLadders.put(93, 73);
        snakesAndLadders.put(95, 75);
        snakesAndLadders.put(98, 79);
        snakesAndLadders.put(4, 14);
        snakesAndLadders.put(9, 31);
        
        snakesAndLadders.put(20, 38);
        snakesAndLadders.put(28, 84);
        snakesAndLadders.put(40, 59);
        snakesAndLadders.put(51, 67);
        snakesAndLadders.put(63, 81);
        
        snakesAndLadders.put(71, 91);
        snakesAndLadders.put(17, 7);
        snakesAndLadders.put(89, 26);
        snakesAndLadders.put(95, 75);
    }

    private static int rollDice() {
        return random.nextInt(6) + 1; // Roll a 6-sided dice
    }

	public static void main(String[] args) {
		
		  int playerPosition = 0;

	}
	
	
	

}
