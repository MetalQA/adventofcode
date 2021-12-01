package com.darrell.adventofcode;

import com.darrell.adventofcode.day1.Day1ChallengeAnswers;
import com.darrell.adventofcode.day1.Day1ChallengeInput;

public class Main {

    public static void main(String[] args) {
        day1Challenges();
    }

    private static void day1Challenges()
    {
        System.out.println(Day1ChallengeAnswers.calculateSimpleIncreases(Day1ChallengeInput.exerciseInput()));
        System.out.println(Day1ChallengeAnswers.calculateThreeMeasurementIncreases(Day1ChallengeInput.exerciseInput()));
    }


}
