package org.example;

public class MusicPlayer {
    private final Music music;

    //IoC
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing " + music.getSong());
    }
}
