package DesignPatterns.bridge;

public class MediaPlayer implements VideoPlayer {
    @Override
    public void play() {
        System.out.println("Play by Media Player");
    }

    @Override
    public void pause() {
        System.out.println("Pause by Media Player");
    }
}
