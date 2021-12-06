package com.darrell.adventofcode.day4;

import java.util.List;

public class BingoCards {
  private final int column = 5;
  private final int row = 5;
  private final int[][] cardNumbers = new int[row][column];
  private final boolean[][] matched = new boolean[row][column];
  private final int[] latestMatch = new int[2];
  private boolean win;
  private int winningNumber;

  public BingoCards(List<String> cardLines)
  {
    setCard(cardLines);
  }

  public boolean checkNumber(int value)
  {
    if(setMatched(value))
    {
      return checkWin();
    }
    return false;
  }

  private boolean setMatched(int value)
  {
    for(int i = 0; i < row; i++)
    {
      for(int e = 0; e < column; e++)
      {
        if(value == cardNumbers[i][e])
        {
          matched[i][e] = true;
          latestMatch[0] = i;
          latestMatch[1] = e;
          return true;
        }
      }
    }
    return false;
  }

  private boolean checkWin()
  {
    boolean rowWin = true;
    for(int i = 0; i < column; i++)
    {
      if(!matched[latestMatch[0]][i])
      {
        rowWin = false;
        break;
      }
    }
    if(rowWin)
    {
      win = rowWin;
      return rowWin;
    }

    boolean colWin = true;
    for(int e = 0; e < row; e++)
    {
      if(!matched[e][latestMatch[1]])
      {
        return false;
      }
    }
    win = true;
    return true;
  }

  private void setCard(List<String> cardLines)
  {
    int lc = 0;
    for(String line : cardLines)
    {
      String[] nums = line.split("\\b +");
      for(int i = 0; i < nums.length; i++)
      {
        this.cardNumbers[lc][i] = Integer.parseInt(nums[i].replace(" ", ""));
      }
      lc++;
    }
  }

  public int getSumOfUnmarkedNumbers() {
    int sum = 0;
    for(int i = 0; i < row; i++)
    {
      for(int e = 0; e < column; e++)
      {
        if(!matched[i][e])
        {
          sum += cardNumbers[i][e];
        }
      }
    }
    return sum;
  }

  public boolean isWin() {
    return win;
  }

  public void setWinningNumber(int winningNumber) {
    this.winningNumber = winningNumber;
  }

  public int getWinningNumber() {
    return this.winningNumber;
  }
}
