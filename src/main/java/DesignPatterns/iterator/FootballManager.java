package DesignPatterns.iterator;

import java.util.Arrays;

public class FootballManager {

    public static void main(String[] args) {

        FootballPlayer playerOne = new FootballPlayer("Player", "One", Position.GOALKEEPER, 25, "Best Club");
        FootballPlayer playerTwo = new FootballPlayer("Player", "Two", Position.DEFENDER, 24, "Best Club");
        FootballPlayer playerThree = new FootballPlayer("Player", "Three", Position.DEFENDER, 27, "Best Club");
        FootballPlayer playerFour = new FootballPlayer("Player", "Four", Position.HELPER, 22, "Best Club");
        FootballPlayer playerFive = new FootballPlayer("Player", "Five", Position.ATTACKER, 29, "Best Club");

        FootballTeam team = new FootballTeam(Arrays.asList(playerOne, playerTwo, playerThree, playerFour, playerFive));

        Iterator iterator = team.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
