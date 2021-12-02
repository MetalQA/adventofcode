package com.darrell.adventofcode.day2;

public class Position {
  private int horizontal;
  private int depth;
  private int aim;

  public Position()
  {
    horizontal = 0;
    depth = 0;
    aim = 0;
  }

  public void goForward(int value)
  {
    horizontal += value;
    depth += aim * value;
  }

  public void goDown(int value)
  {
    aim += value;
  }

  public void goUp(int value)
  {
    aim -= value;
  }

  public int calculatePosition() {
    return horizontal * depth;
  }
}
