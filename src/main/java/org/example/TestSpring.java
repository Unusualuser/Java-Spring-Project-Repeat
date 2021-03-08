package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        HipHopMusic hipHopMusic = context.getBean("hipHopMusic", HipHopMusic.class);

        System.out.println(hipHopMusic.getSong());
        context.close();
    }
}
