package com.programming;

import java.util.Random;

public class SnakeAndLadderSimulator {

    public static int player1 = 0;
    public static int player2 = 0;

    public static void main(String[] args) {
        Random random = new Random();

        int totalTurns1 = 0;
        int totalTurns2 = 0;

        final int noPlay = 0;
        final int snake = 1;
        final int ladder = 2;

        while (player1 != 100 && player2 != 100) {

            int dice1 = 1 + random.nextInt(5);
            int dice2 = 1 + random.nextInt(5);
            System.out.println("Dice number of player1 is: " + dice1);
            System.out.println("Dice number of player2 is: " + dice2);


            int playOption = random.nextInt(3);

//            The switch case to roll the die and decide play option for player 1
            switch (playOption) {

                case noPlay:
                    System.out.println("No movement for player1");
                    System.out.println(player1);
                    break;
                case snake:
                    System.out.println("snake for player1");
                    player1 -= dice1;
                    if (player1 < 0) {
                        player1 = 0;
                    }
                    System.out.println(player1);
                    break;
                case ladder:
                    System.out.println("ladder player1");
                    player1 += dice1;
                    if (player1 > 100) {
                        player1 = player1-dice1;
                    }
                    System.out.println(player1);
                    break;
            }
//            player1 += player1;
            totalTurns1++;

//             The switch case to roll the die and decide play option for player 2
            switch (playOption) {

                case noPlay:
                    System.out.println("No movement for player2");
                    System.out.println(player2);
                    break;
                case snake:
                    System.out.println("snake player2");
                    player2 -= dice2;
                    if (player2 < 0) {
                        player2 = 0;
                    }
                    System.out.println(player2);
                    break;
                case ladder:
                    System.out.println("ladder player2");
                    player2 += dice2;
                    if (player2 > 100) {
                        player2 = player2-dice2;
                    }
                    System.out.println(player2);
                    break;
            }
//            player2 += player2;
            totalTurns2++;

            if (player1 == 100) {
                System.out.println("player 1 has won in " + totalTurns1);
                break;
            }
            if (player2 == 100) {
                System.out.println("player 2 has won in " + totalTurns2);
                break;
            }
        }
        System.out.println(player1);
        System.out.println(player2);

    }
}

