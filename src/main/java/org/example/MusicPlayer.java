package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private Music music1;
    private Music music2;
    private Music music3;
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    @Autowired
    public MusicPlayer(@Qualifier("hipHopMusic") Music music1,
                       @Qualifier("classicalMusic") Music music2,
                       @Qualifier("rockMusic") Music music3) {
        this.music1 = music1;
        this.music2 = music2;
        this.music3 = music3;
    }

    public MusicPlayer() { }

    public void playMusic(MusicEnum musicEnum) {
        Music music = null;
        if(musicEnum == MusicEnum.HIPHOP)
            music = music1;
        else if(musicEnum == MusicEnum.CLASSICAL)
            music = music2;
        else if(musicEnum == MusicEnum.ROCK)
            music = music3;
        int random_song = (int) (Math.random() * 3);
        assert music != null;
        System.out.println("Playing " + music.getSong().get(random_song) + " on " + this.getName() + " with volume " + this.getVolume() + "%");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
