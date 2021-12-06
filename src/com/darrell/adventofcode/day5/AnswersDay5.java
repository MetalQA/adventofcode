package com.darrell.adventofcode.day5;

import java.util.ArrayList;
import java.util.List;

public class AnswersDay5 {

  public static int calculateTask1Answer(String[] input)
  {
    String[][] inputArr = parseInput(input);
    List<VentLines> ventList = new ArrayList<>();
    for(String[] line : inputArr)
    {
      ventList.add(new VentLines(line[0], line[1]));
    }
    Grid grid = new Grid(ventList);
    return grid.amountOfOverlappingLines();
  }

  private static String[][] parseInput(String[] input) {
    String[][] inputArr = new String[input.length][2];
    for(int i = 0; i < input.length; i++)
    {
      String[] line = input[i].split(" -> ");
      for(int e = 0; e < line.length; e++)
      {
        inputArr[i][e] = line[e];
        inputArr[i][e] = line[e];
      }
    }
    return inputArr;
  }

}
