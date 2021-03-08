package org.example;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class HipHopMusic implements Music {
    @Override
    public List<String> getSong() {
        return Arrays.asList("Rap god", "Umbrella", "Alors on dance");
    }
}
