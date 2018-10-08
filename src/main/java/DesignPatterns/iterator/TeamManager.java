package DesignPatterns.iterator;

public interface TeamManager {

    void addPlayer(FootballPlayer player);

    void removePlayer(FootballPlayer player);

    Iterator iterator();
}
