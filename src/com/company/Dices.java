package com.company;

import java.util.Random;

public class Dices {
    private int d4;
    private int d6;
    private int d8;
    private int d10;
    private int percent;
    private int d12;
    private int d20;
    private Random random = new Random();

    public int rollD4() {
        int x = random.nextInt(4) + 1;
        return x;
    }
}
