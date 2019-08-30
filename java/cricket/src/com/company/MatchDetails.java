package com.company;

import java.util.ArrayList;
import java.util.List;

public class MatchDetails {

    int noOfOvers;
    int targetRun;
    String batsmanType;
    String bowlerType;

    public MatchDetails(int noOfOvers, int targetRun, String batsmanType, String bowlerType) {
        this.noOfOvers = noOfOvers  ;
        this.targetRun = targetRun;
        this.batsmanType = batsmanType;
        this.bowlerType = bowlerType;
    }

    public void matchStatus(int runScoredByBatsMan,int runScoredByBowler, List<Integer> listOfScoresPerOverByBatsman, List<Integer> listOfScoresPerOverByBowler)
    {
        for (int i = 0; i < listOfScoresPerOverByBatsman.size(); i++) {
            System.out.println("Batsman score is : " + listOfScoresPerOverByBatsman.get(i).toString());
            System.out.println("Bowler score is : " + listOfScoresPerOverByBowler.get(i).toString());
            System.out.println("\n");
        }
        System.out.println("Total Score by Batsman is : " + listOfScoresPerOverByBatsman.toString());
        if (runScoredByBatsMan >= this.targetRun) {
            System.out.println("Batsman won ");
        } else {
            System.out.println("Batsman lost");
        }
    }
}
