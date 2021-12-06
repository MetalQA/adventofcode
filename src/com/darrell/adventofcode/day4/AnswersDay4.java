package com.darrell.adventofcode.day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnswersDay4 {

  private static List<BingoCards> parseCards(String[] cardNumberLines)
  {
    List<String> cardNumList = Arrays.asList(cardNumberLines);
    List<BingoCards> cards = new ArrayList<>();
    List<String> card = new ArrayList<>();

    for(String line : cardNumList)
    {
      if(line.equals(""))
      {
        cards.add(new BingoCards(card));
        card = new ArrayList<>();
        continue;
      }
      card.add(line);
    }
    cards.add(new BingoCards(card));
    return cards;
  }

  public static int calculateTask1Answer(String[] cardNumberLines, String[] bingoNumbers)
  {
    String bingoNums = bingoNumbers[0];
    List<BingoCards> cards = parseCards(cardNumberLines);
    String[] nums = bingoNums.split(",");
    for(String number : nums)
    {
      int num = Integer.parseInt(number);
      for(BingoCards card : cards)
      {
        if(card.checkNumber(num))
        {
          int sum = card.getSumOfUnmarkedNumbers();
          return num * sum;
        }
      }
    }
    return -1;
  }

  public static int calculateTask2Answer(String[] cardNumberLines, String[] bingoNumbers)
  {
    String bingoNums = bingoNumbers[0];
    List<BingoCards> cards = parseCards(cardNumberLines);
    List<BingoCards> winningCards = new ArrayList<>();
    String[] nums = bingoNums.split(",");
    for(String number : nums)
    {
      int num = Integer.parseInt(number);
      for(BingoCards card : cards)
      {
        if(card.isWin())
        {
          continue;
        }
        if(card.checkNumber(num))
        {
          card.setWinningNumber(num);
          winningCards.add(card);
        }
      }
    }

    BingoCards lastWinningCard = winningCards.get(winningCards.size()-1);
    return lastWinningCard.getSumOfUnmarkedNumbers() * lastWinningCard.getWinningNumber();
  }

}
