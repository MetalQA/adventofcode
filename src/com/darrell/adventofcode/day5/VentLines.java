package com.darrell.adventofcode.day5;

public class VentLines {
  private int xstart;
  private int ystart;
  private int xfinish;
  private int yfinish;

  public VentLines(String start, String finish)
  {
    String[] s = start.split(",");
    String[] f = finish.split(",");

    this.xstart = Integer.parseInt(s[0]);
    this.ystart = Integer.parseInt(s[1]);
    this.xfinish = Integer.parseInt(f[0]);
    this.yfinish = Integer.parseInt(f[1]);
  }

  public int getXstart() {
    return xstart;
  }

  public int getYstart() {
    return ystart;
  }

  public int getXfinish() {
    return xfinish;
  }

  public int getYfinish() {
    return yfinish;
  }
}
