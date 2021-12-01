package com.darrell.adventofcode.day1;

public class Day1ChallengeAnswers {

  public static int calculateSimpleIncreases(int[] x)
  {
    int count = 0;
    for(int i = 0; i < x.length-1; i++)
    {
      if(x[i+1]>x[i])
      {
        count++;
      }
    }
    return count;
  }

  public static int calculateThreeMeasurementIncreases(int[] x)
  {
    int count = 0;
    for(int i = 0; i < x.length-3; i++)
    {
      int r = x[i] + x[i+1] + x[i+2];
      int r2 = x[i+1] + x[i+2] + x[i+3];
      if(r2 > r)
      {
        count++;
      }
    }
    return count;
  }
}
