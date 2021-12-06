package com.darrell.adventofcode.day5;

import java.util.List;

public class Grid {
  private int[][] grid;
  private final List<VentLines> lines;

  public Grid(List<VentLines> lines) {
    this.lines = lines;
    establishGridSize();
    populateGrid();
  }

  public int amountOfOverlappingLines()
  {
    int count = 0;
    for(int i = 0; i < grid.length; i++)
    {
      for(int e = 0; e < grid[i].length; e++)
      {
        if(grid[i][e] > 1)
        {
          count++;
        }
      }
    }
    return count;
  }

  private void establishGridSize()
  {
    int hx = 0;
    int hy = 0;
    for(VentLines line : lines)
    {
      int x = Math.max(line.getXfinish(), line.getXstart());
      int y = Math.max(line.getYfinish(), line.getYstart());
      if(x > hx)
      {
        hx = x;
      }
      if(y > hy)
      {
        hy = y;
      }
    }
    this.grid = new int[hy+1][hx+1];
  }

  private void populateGrid()
  {
    for(VentLines line : lines)
    {
      int xStart = line.getXstart();
      int xFinish = line.getXfinish();
      int yStart = line.getYstart();
      int yFinish = line.getYfinish();
      if(xStart == xFinish)
      {
        if(yStart < yFinish)
        {
          for(int i = yStart; i <= yFinish; i++)
          {
            grid[i][xStart]++;
          }
        }
        else
        {
          for(int i = yStart; i >= yFinish; i--)
          {
            grid[i][xStart]++;
          }
        }
      }
      if(yStart == yFinish)
      {
        if(xStart < xFinish)
        {
          for(int i = xStart; i <= xFinish; i++)
          {
            grid[yStart][i]++;
          }
        }
        else
        {
          for(int i = xStart; i >= xFinish; i--)
          {
            grid[yStart][i]++;
          }
        }
      }
    }
  }


}
