package com.company;

import java.util.ArrayList;
import java.util.List;

public class EvilBot implements BotBehaviour{

    int playTotal ;
    int botTotal ;

    public EvilBot(int playTotal, int botTotal) {
        this.playTotal = playTotal;
        this.botTotal = botTotal;
    }

    @Override
    public List<Integer> behaviour(String playersChoice) {
        List<Integer>  n = new ArrayList<>();


        if (playersChoice.equals("coperate")  )
        {
            playTotal = playTotal -1 ;
            botTotal = botTotal+3;
        }
        else if (playersChoice.equals("cheat"))
        {
            playTotal = playTotal + 0;
            botTotal = botTotal + 0;
        }

        n.add(playTotal);
        n.add(botTotal);
        return n;
    }
}
