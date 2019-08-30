package com.company;

import javax.tools.Diagnostic;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PlayGameAndCalculateScore {


    public void playGame() {
        int round = 3;
        GetNumberOfRoundsPerGameForPlayer roun = new GetNumberOfRoundsPerGameForPlayer();

        int playerTotal = 0;
        int botTotal = 0;
        KindBot kb = new KindBot(botTotal);
        List<BotBehaviourClass> botObj = (List<BotBehaviourClass>) new KindBot(botTotal);
        Random r = new Random();

        List<String> getOrderOfBots = new ArrayList<>();
        getOrderOfBots = roun.getOrderOfBots();
        List<String> playerschoice = new ArrayList<>();
        playerschoice.add("coperate");
        playerschoice.add("cheat");
        List<Integer> tot = new ArrayList<>();
        int playerschoiceint ;
        String playerschoicestring = "";

        round = roun.getNumberOfRoundsPerGameForPlayer();
        System.out.println("The number of rounds per game for the bot is "+round);

        for (int j = 0; j < round; j++) {
            playerschoiceint = r.nextInt(playerschoice.size());
            playerschoicestring = playerschoice.get(playerschoiceint);
            tot = kb.behaviour(playerschoicestring);
            System.out.println("playerschoicE IS "+playerschoicestring+"TOTAL" + tot);

        }
    }
}



