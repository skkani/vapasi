package com.company;

import java.util.Random;

public class ParttimeBowler implements Bowler{
    @Override
    public int runTypeAndList()
    {
        Random randomScoreGeneration = new Random();
        int randomScoreForBowler = randomScoreGeneration.nextInt(6);
        return randomScoreForBowler;
    }
}
