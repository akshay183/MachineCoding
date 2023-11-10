package org.machine_coding.Snake_Ladder;

import java.util.*;

public class Board {

    private final int boardSize;
    private final int numDice;
    private final Queue<Player> playerQueue;
    private Map<Integer, Position> playerPosition; // put(playerId, position)
    private Map<Position, Position> boardDistribution;  // return final location position as value.


    public Board(int numDice, List<Player> players, int boardSize) {

        this.numDice = numDice;
        playerQueue = new LinkedList<>(players);
        this.boardSize = boardSize;
        playerPosition = new HashMap<>();
        boardDistribution = new HashMap<>();

        distributeBoard(players);
    }

    //randomise distribution of snakes and ladder.
    private void distributeBoard(List<Player> players) {

        for(Player player : players) {

            Position initialPos = new Position(0);
            playerPosition.put(player.getId(), initialPos);
        }

        Random random = new Random();
        int numberOfJumps = random.nextInt(boardSize/20 - 1) + 2;

        for(int i=0;i<numberOfJumps;i++) {

             Position initialPos = new Position(random.nextInt( (boardSize-10) - 20 + 1) + 20);
             Position finalPos = new Position(random.nextInt((initialPos.getCoordinate()+15) -
                     (initialPos.getCoordinate()-15) + 1) + (initialPos.getCoordinate()-15));

             if(finalPos.getCoordinate() >= boardSize || boardDistribution.containsKey(initialPos)) {
                 i--;
                 continue;
             }
             boardDistribution.put(initialPos, finalPos);
        }
    }

    // roll dice
    public int rollDice() {
        int moveCount;
        Random random = new Random();

        moveCount = random.nextInt(numDice*6) + 1;
        return moveCount;
    }

    // a move
    public void makeMove(int moveCount) {

        Player nextPlayer = playerQueue.peek();
        playerQueue.poll();

        /*
        * 1.move player by given moves count
        * 2.check for snake and ladders.
        * 3.if there goto final position of respective parts.
        * 4.if it goes out of bounds don't move.
        * 5.if its on final winning position return.
        * 6.push player in queue again.
        */
    }

    // game starts
    public void startGame() {

        while(!playerQueue.isEmpty()) {
            /*
            * 1.roll dice
            * 2.make current player move. offer into queue if satisfies the conditions.
            */
            int moveCount = rollDice();

            makeMove(moveCount);
        }
    }
}
