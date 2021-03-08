package org.example;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    private ClassicalMusic () {}

    @Override
    public List<String> getSong() {
        return Arrays.asList("Hungarian Rhapsody", "Rondo", "Very slowly");
    }
}
