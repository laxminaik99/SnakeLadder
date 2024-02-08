package com.bridgelabz7;
import java.util.*;

public class SnakeAndLadderUC6 {
	
    private static final int WINNING_POSITION = 100;
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

    public static void main(String[] args) {
        int playerPosition = 0;
        int diceRollCount = 0;

        while (playerPosition < WINNING_POSITION) {
            int diceRoll = rollDice();
            diceRollCount++;
            int newPosition = playerPosition + diceRoll;

            // Check if the new position exceeds the winning position
            if (newPosition > WINNING_POSITION) {
                System.out.println("Player rolled a " + diceRoll + ". Can't move forward as it exceeds winning position. Player stays at position " + playerPosition);
            } else {
                playerPosition = newPosition;
                System.out.println("Player rolled a " + diceRoll + ". Moved to position " + playerPosition);

                // Check if the player encounters a snake or ladder
                if (snakesAndLadders.containsKey(playerPosition)) {
                    int option = random.nextInt(2); // 0: ladder, 1: snake
                    switch (option) {
                        case 0:
                            newPosition = playerPosition + diceRoll;
                            System.out.println("Ladder found! Climbing to position " + newPosition);
                            playerPosition = newPosition;
                            break;
                        case 1:
                            int backPosition = playerPosition - diceRoll;
                            System.out.println("Snake found! Sliding down to position " + snakesAndLadders.get(playerPosition));
                            playerPosition = backPosition >= 0 ? backPosition : 0; // Ensure player doesn't go below position 0
                            break;
                    }
                } else {
                    System.out.println("No ladder or snake found. Player stays in the same position.");
                }
            }
        }

        System.out.println("Congratulations! Player has reached position " + WINNING_POSITION + ". Game over!");
        System.out.println("Number of times dice rolled to win: " + diceRollCount);
    }

    private static int rollDice() {
        return random.nextInt(6) + 1; // Roll a 6-sided dice
    }


}
