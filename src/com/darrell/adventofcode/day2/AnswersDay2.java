package com.darrell.adventofcode.day2;

public class AnswersDay2 {

  public static int task1Answer(String input)
  {
    Position sub = new Position();
    String[] iLines = input.split("\n");
    for(String line: iLines)
    {
      String[] actions = line.split(" ");
      triggerActions(sub, actions[0], actions[1]);
    }
    return sub.calculatePosition();
  }

  private static void triggerActions(Position sub, String action, String value) {
    int v = Integer.parseInt(value);
    switch(action)
    {
      case "forward":
        sub.goForward(v);
        break;
      case "down":
        sub.goDown(v);
        break;
      case "up":
        sub.goUp(v);
        break;
      default:
        throw new IllegalArgumentException(String.format("%s action not recognised", action));
    }
  }


}
