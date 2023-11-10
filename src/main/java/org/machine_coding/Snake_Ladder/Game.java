package org.machine_coding.Snake_Ladder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Game {
    public static void main(String[] args) {

        Player p1 = Player.builder().
                id(1).
                playerName("akshay").
                build();

        Player p2 = Player.builder().
                id(2).
                playerName("John").
                build();

        List<Player> players = new ArrayList<>(Arrays.asList(p1,p2));
        Board board = new Board(2, players, 100);//minimum board size is 100 apply this limit.

        board.startGame();
    }
}
