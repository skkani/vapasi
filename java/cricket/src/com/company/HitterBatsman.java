package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HitterBatsman implements Batsman{
    @Override
    public int runTypeAndList()
    {
        Random randomScoreGeneration = new Random();
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(4);
        list.add(6);
        int randomScoreForBatsman = list.get(randomScoreGeneration.nextInt(list.size()));
        return randomScoreForBatsman;
    }
}
