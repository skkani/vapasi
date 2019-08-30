package com.company;

import java.util.ArrayList;
import java.util.List;

public class RunCalculatorForTheMatch {

    public List<Object> runScoredForTheGivenOver(MatchDetails match) {
        List<Object> listOfAll = new ArrayList<Object>();
        int noOfBalls = match.noOfOvers * 6;
        List<Integer> listOfScoresPerOverByBatsman = new ArrayList<>();
        List<Integer> listOfScoresPerOverByBowler = new ArrayList<>();
        int totalScoreByBatsman = 0;
        int totalScoreByBowler = 0;
        int runByBatsman = 0;
        int runByBowler = 0;

        for (int i = 0; i < noOfBalls; i++) {

            if (match.batsmanType == "Normal") {
                Batsman bt = new NormalBatsman();
                runByBatsman = bt.runTypeAndList();
            }

            else if (match.batsmanType == "TailEnder" )
            {
                Batsman te = new TailEnderBatsman();
                runByBatsman = te.runTypeAndList();
               // if (runByBatsman == runByBowler) runByBatsman = 0;

            }
            else if (match.batsmanType == "Hitter") {
                Batsman ht = new HitterBatsman();
                runByBatsman = ht.runTypeAndList();
            }
            if (match.batsmanType == "Normal") {
                Bowler bw = new NormalBowler();
                runByBowler = bw.runTypeAndList();
            }
            else if (match.batsmanType == "Parttime") {
                Bowler pt = new ParttimeBowler();
                runByBowler = pt.runTypeAndList();
                if (runByBatsman == runByBowler) runByBatsman = 0;
                if (totalScoreByBatsman >= match.targetRun) break;
            }

            if (runByBatsman != runByBowler) {
                listOfScoresPerOverByBatsman.add(runByBatsman);
                listOfScoresPerOverByBowler.add(runByBowler);
                totalScoreByBatsman = totalScoreByBatsman + runByBatsman;
                totalScoreByBowler = totalScoreByBowler + runByBowler;
            }
            else {
                break;
            }
        }

        listOfAll.add(totalScoreByBatsman);
        listOfAll.add(totalScoreByBowler);
        listOfAll.add(listOfScoresPerOverByBatsman);
        listOfAll.add(listOfScoresPerOverByBowler);
        return  listOfAll;
    }




}
