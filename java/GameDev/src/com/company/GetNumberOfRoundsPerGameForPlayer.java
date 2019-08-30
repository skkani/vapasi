package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GetNumberOfRoundsPerGameForPlayer {

    public int getNumberOfRoundsPerGameForPlayer() {
        Random r = new Random();
        int low = 3;
        int high = 7;
        int result = r.nextInt(high - low) + low;
        return result;
    }

    public List<String> getOrderOfBots()
    {
        List<String> getOrderOfBots = new ArrayList<>();
        getOrderOfBots.add("Kind");
        getOrderOfBots.add("Evil");
        getOrderOfBots.add("Grudge");
        getOrderOfBots.add("CopyCat");
        return getOrderOfBots;
    }
}
