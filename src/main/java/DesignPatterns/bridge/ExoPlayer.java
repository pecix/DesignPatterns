package DesignPatterns.bridge;

public class ExoPlayer implements VideoPlayer {
    @Override
    public void play() {
        System.out.println("Play by Exo Player");
    }

    @Override
    public void pause() {
        System.out.println("Pause by Exo Player");
    }
}
