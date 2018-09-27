package DesignPatterns.bridge;

public class Player {
    public static void main(String[] args) {

        VideoPlayer player = new MediaPlayer();
        VODPlatform platform = new SDAPlatform(player);

        platform.setTrack("Track one");
        platform.play();
        System.out.println();
        platform.pause();
    }
}
