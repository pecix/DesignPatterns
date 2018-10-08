package DesignPatterns.iterator;

import java.util.List;

public class FootballTeam implements TeamManager {

    private List<FootballPlayer> players;

    public FootballTeam(List<FootballPlayer> players) {
        this.players = players;
    }

    public List<FootballPlayer> getPlayers() {
        return players;
    }

    public void setPlayers(List<FootballPlayer> players) {
        this.players = players;
    }

    @Override
    public void addPlayer(FootballPlayer player) {
        players.add(player);
    }

    @Override
    public void removePlayer(FootballPlayer player) {
        players.remove(player);
    }

    @Override
    public Iterator iterator() {
        return new FootballPlayersIterator(players);
    }
}
