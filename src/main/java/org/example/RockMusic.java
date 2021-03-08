package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class RockMusic implements Music {
    @Override
    public List<String> getSong() {
        return Arrays.asList("Wind cries Mary", "Brother Louie", "Natural");
    }
}
