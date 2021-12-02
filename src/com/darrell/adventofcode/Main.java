package com.darrell.adventofcode;

import com.darrell.adventofcode.day2.AnswersDay2;

public class Main {

    public static void main(String[] args) {
        day2Challenges();
    }

    private static void day2Challenges()
    {
        String example = FileUtils.readFile("/day2/1inputexample.txt");
        System.out.println(AnswersDay2.task1Answer(example));

        String answer = FileUtils.readFile("/day2/1inputexercise.txt");
        System.out.println(AnswersDay2.task1Answer(answer));
    }


}
