package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        ClassicalMusic classicalMusic1 = context.getBean("classicalMusicBean", ClassicalMusic.class);
        ClassicalMusic classicalMusic2 = context.getBean("classicalMusicBean", ClassicalMusic.class);

        System.out.println(classicalMusic1.getSong());
        System.out.println(classicalMusic2.getSong());
//        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//        boolean comparation = firstMusicPlayer == secondMusicPlayer;
//
//        System.out.println(comparation);
//        System.out.println(firstMusicPlayer);
//        System.out.println(secondMusicPlayer);
//
//        firstMusicPlayer.setVolume(10);
//        System.out.println(firstMusicPlayer.getVolume());
//        System.out.println(secondMusicPlayer.getVolume());
//        firstMusicPlayer.playMusic();
//        secondMusicPlayer.playMusic();
        context.close();
    }
}
