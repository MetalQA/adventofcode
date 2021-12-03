package com.darrell.adventofcode.day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnswersDay3 {

  public static int calculateTask1Answer(String[] input)
  {
    StringBuilder gamma = new StringBuilder();
    StringBuilder epsilon = new StringBuilder();
    for(int i = 0; i < input[0].length(); i++)
    {
      int z = 0;
      int o = 0;
      for(String line : input)
      {
        if(line.charAt(i) == '0')
        {
          z+=1;
        }
        else
        {
          o+=1;
        }
      }
      if(z > o)
      {
        gamma.append("0");
        epsilon.append("1");
      }
      else
      {
        gamma.append("1");
        epsilon.append("0");
      }
    }
    return Integer.parseInt(gamma.toString(),2) * Integer.parseInt(epsilon.toString(), 2);
  }

  public static int calculateTask2Answer(String[] input) {
    List<String> master = Arrays.asList(input);

    List<String> oxygen = new ArrayList<>(master);
    List<String> c02 = new ArrayList<>(master);
    List<String> ones = new ArrayList<>();
    List<String> zeros = new ArrayList<>();
    for (int i = 0; i < input[0].length(); i++)
    {
      for(String line : oxygen)
      {
        if(oxygen.size() == 1)
        {
          break;
        }
        if(line.charAt(i) == '0')
        {
          zeros.add(line);
        }
        else
        {
          ones.add(line);
        }
      }
      if(zeros.size() > ones.size()) {
        oxygen.removeAll(ones);
      }
      else
      {
        oxygen.removeAll(zeros);
      }
      ones.clear();
      zeros.clear();

      for(String line : c02)
      {
        if(c02.size() == 1)
        {
          break;
        }
        if(line.charAt(i) == '0')
        {
          zeros.add(line);
        }
        else
        {
          ones.add(line);
        }
      }
      if(ones.size() >= zeros.size()) {
        c02.removeAll(ones);
      }
      else
      {
        c02.removeAll(zeros);
      }
      ones.clear();
      zeros.clear();
    }

    return Integer.parseInt(oxygen.get(0), 2) * Integer.parseInt(c02.get(0), 2);
  }
}
