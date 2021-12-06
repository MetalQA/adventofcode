package com.darrell.adventofcode;

import com.darrell.adventofcode.day4.AnswersDay4;
import com.darrell.adventofcode.day5.AnswersDay5;

public class Main {

    public static void main(String[] args) {
        day4Challenges();
    }

    private static void day4Challenges()
    {
        String[] exerciseinput = FileUtils.readFile("/day5/inputexercise.txt");
        System.out.println(AnswersDay5.calculateTask1Answer(exerciseinput));

    }


}
