package com.bridgelabz7;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class SnakeAndLadderUC3 {

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
		  
		  while (playerPosition < WINNING_POSITION) {
	            int diceRoll = rollDice();
	            playerPosition += diceRoll;

	            if (playerPosition > WINNING_POSITION) {
	                playerPosition -= diceRoll; // Player overshoots, move back
	                continue;
	            }

	            System.out.println("Player rolled a " + diceRoll + ". Moved to position " + playerPosition);

		  
          // Check if the player encounters a snake or ladder
          if (snakesAndLadders.containsKey(playerPosition)) {
              int option = random.nextInt(2); // 0: ladder, 1: snake
              switch (option) {
                  case 0:
                      int newPosition = playerPosition + diceRoll;
                      System.out.println("Ladder found! Climbing to position " + newPosition);
                      playerPosition = newPosition;
                      break;
                  case 1:
                      System.out.println("Snake found! Sliding down to position " + snakesAndLadders.get(playerPosition));
                      playerPosition = snakesAndLadders.get(playerPosition);
                      break;
              }
          } else {
              System.out.println("No ladder or snake found. Player stays in the same position.");
          }
          }
      

          System.out.println("Congratulations! Player has reached position " + WINNING_POSITION + ". Game over!");
		    }
	}
	
	


