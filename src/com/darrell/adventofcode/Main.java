package com.darrell.adventofcode;

import com.darrell.adventofcode.day3.AnswersDay3;

public class Main {

    public static void main(String[] args) {
        day3Challenges();
    }

    private static void day3Challenges()
    {
        String[] example = FileUtils.readFile("/day3/inputexample.txt");
        System.out.println(AnswersDay3.calculateTask1Answer(example));

        String[] exercise = FileUtils.readFile("/day3/inputexercise.txt");
        System.out.println(AnswersDay3.calculateTask2Answer(exercise));
    }


}
