package DesignPatterns.bridge;

public class SDAPlatform extends VODPlatform {

    private String track;
    private VideoPlayer player;

    public SDAPlatform(VideoPlayer player) {
        this.player = player;
    }

    @Override
    void play() {
        System.out.println(track);
        player.play();
    }

    @Override
    void pause() {
        System.out.println(track);
        player.pause();
    }

    @Override
    void setTrack(String track) {
        this.track = track;
    }
}
