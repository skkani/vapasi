package com.company;

import java.util.Random;

public class NormalBatsman implements Batsman {
    @Override
    public int runTypeAndList()
    {
        Random randomScoreGeneration = new Random();
        int randomScoreForBatsman = randomScoreGeneration.nextInt(6);
        return randomScoreForBatsman;
    }


}
