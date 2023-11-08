package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lottery {
    public List<Integer> roll() {
        List<Integer> balls = new ArrayList<>(100);

        for (int i = 0; i < 100; i++) {
            balls.add(i + 1);
        }

        Collections.shuffle(balls);
        return balls.subList(0, 10);
    }
}