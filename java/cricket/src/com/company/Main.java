package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MatchDetails cs = new MatchDetails(2,20,"Hitter","Normal");

        RunCalculatorForTheMatch rnObj = new RunCalculatorForTheMatch();

        List<Object> listOfAll = rnObj.runScoredForTheGivenOver(cs);
        int totalScoreByBatsman = new Integer((Integer) listOfAll.get(0));
        int totalScoreByBowler = new Integer((Integer) listOfAll.get(1));
        List<Integer> listOfScoresPerOverByBatsman = (List<Integer>) listOfAll.get(2);
        List<Integer> listOfScoresPerOverByBowler = (List<Integer>) listOfAll.get(3);

        cs.matchStatus(totalScoreByBatsman, totalScoreByBowler,listOfScoresPerOverByBatsman,listOfScoresPerOverByBowler);


    }
}
