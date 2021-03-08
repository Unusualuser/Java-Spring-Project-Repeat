package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Arrays;
import java.util.List;

@Component
@Scope("singleton")
public class ClassicalMusic implements Music {
    private ClassicalMusic () {}

    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }

    @Override
    public List<String> getSong() {
        return Arrays.asList("Hungarian Rhapsody", "Rondo", "Very slowly");
    }
}
