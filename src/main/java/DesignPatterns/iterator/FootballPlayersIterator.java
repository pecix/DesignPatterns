package DesignPatterns.iterator;

import java.util.List;

public class FootballPlayersIterator implements Iterator {

    private List<FootballPlayer> players;
    private int position;

    public FootballPlayersIterator(List<FootballPlayer> players) {
        this.players = players;
    }

    @Override
    public boolean hasNext() {
        return position < players.size();
    }

    @Override
    public FootballPlayer next() {
        FootballPlayer player = players.get(position);
        position++;
        return player;
    }
}
